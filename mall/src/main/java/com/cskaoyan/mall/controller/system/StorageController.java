package com.cskaoyan.mall.controller.system;

import com.cskaoyan.mall.beans.system.Message;
import com.cskaoyan.mall.service.admin.storage.StorageService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;

/**
 * @Author: Tangxuan
 * @Date: 2019/5/23 21:40
 */
@RestController
@RequestMapping("/storage")
public class StorageController {
    private Logger logger = Logger.getLogger(StorageController.class);

    @Autowired
    StorageService storageService;
    @RequestMapping("/create")
    public Message imgUpload(MultipartFile[] file, HttpServletRequest request){
        return storageService.imgUpload(file);
    }
}
