package com.cskaoyan.mall.service.admin.storage;

import com.cskaoyan.mall.beans.system.Message;
import org.springframework.web.multipart.MultipartFile;

/**
 * @Author: Tangxuan
 * @Date: 2019/5/23 22:04
 */
public interface StorageService {
    Message imgUpload(MultipartFile[] file);

}
