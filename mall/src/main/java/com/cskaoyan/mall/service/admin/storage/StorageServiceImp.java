package com.cskaoyan.mall.service.admin.storage;

import com.cskaoyan.mall.beans.CskaoyanMallStorage;
import com.cskaoyan.mall.beans.CskaoyanMallStorageExample;
import com.cskaoyan.mall.beans.system.Message;
import com.cskaoyan.mall.mapper.CskaoyanMallStorageMapper;
import com.cskaoyan.mall.util.FormatDate;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.UUID;

/**
 * @Author: Tangxuan
 * @Date: 2019/5/23 22:04
 */
@Service("storageService")
public class StorageServiceImp implements StorageService {

    @Autowired
    CskaoyanMallStorageMapper mapper;
    Logger logger =Logger.getLogger(StorageServiceImp.class);
    @Override
    public Message imgUpload(MultipartFile[] file) {
        CskaoyanMallStorage storage = upload(file);
        logger.debug(storage.getKey());
        int insert = mapper.insert(storage);
        return insert==1?new Message(0, mapper.selectByKey(storage.getKey()), "成功"):
                new Message(500, "", "失败");
    }

    private CskaoyanMallStorage upload(MultipartFile[] file) {
        String uploadDir=null;
        try {
            uploadDir= ResourceUtils.getURL("classpath:").getPath()+"static/img/";
            logger.debug(uploadDir);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        //如果目录不存在 ，创建
        File dir = new File(uploadDir);
        if(!dir.exists()){
            dir.mkdir();
        }

        //遍历文件数组上传
        for (int i = 0; i < file.length; i++) {
            if(file[i]!=null){
                CskaoyanMallStorage storage = executeUpload(uploadDir, file[i]);
                return storage;
            }
        }
        return null;
    }

    private CskaoyanMallStorage executeUpload(String uploadDir,MultipartFile file){
        //文件后缀名
        String suffix = file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("."));
        //上传文件名
        String fileName = UUID.randomUUID()+suffix;

        //服务器端保存的文件对象
        File  serverFile = new File(uploadDir+fileName);
        //上传文件保存到服务器文件内
        try {
            file.transferTo(serverFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
        String url = "http://localhost:80/img/"+fileName;

        CskaoyanMallStorage storage = new CskaoyanMallStorage();

        storage.setUpdateTime(FormatDate.GetNow());
        storage.setAddTime(FormatDate.GetNow());
        storage.setKey(fileName);
        storage.setSize((int)file.getSize());
        storage.setUrl(url);
        storage.setType(file.getContentType());
        storage.setName(fileName);
        return storage;
    }
}

