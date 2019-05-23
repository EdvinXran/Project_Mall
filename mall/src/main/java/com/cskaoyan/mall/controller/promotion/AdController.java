package com.cskaoyan.mall.controller.promotion;

import com.cskaoyan.mall.beans.Message;
import com.cskaoyan.mall.service.admin.promotion.AdService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Tangxuan
 * @Date: 2019/5/23 15:31
 */
@RestController
@RequestMapping("/ad")
public class AdController {
   private Logger logger = Logger.getLogger(AdController.class);

    @Autowired
    AdService adService;

    @RequestMapping("/list")
    public Message AdList(@RequestBody int page,int limit,String sort,String order){
        logger.debug(page);
        logger.debug(limit);
        logger.debug(sort);
        return null;
//        return adService.pageAdList();
    }
}
