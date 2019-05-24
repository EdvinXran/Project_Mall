package com.cskaoyan.mall.controller.promotion;

import com.cskaoyan.mall.beans.promotion.CskaoyanMallAd;
import com.cskaoyan.mall.beans.system.Message;
import com.cskaoyan.mall.beans.system.PageAndSort;
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

    /**
     * 回显分页的广告，
     * @param pas  前端给的是分页数和排序方式
     * @return  返回的是封装了List和总页数的Message
     */
    @RequestMapping("/list")
    public Message AdList(PageAndSort pas){
       return adService.pageAdList(pas);
    }

    /**
     * 修改广告
     * @param ad
     * @return
     */
    @RequestMapping("/update")
    public Message adUpdate(@RequestBody CskaoyanMallAd ad){
        return adService.AdUpdate(ad);
    }

    /**
     * 删除广告
     * @param ad
     * @return
     */
    @RequestMapping("/delete")
    public Message AdDelete(@RequestBody CskaoyanMallAd ad){
        return adService.AdDelete(ad);
    }

    /**
     * 增加广告
     * @param ad
     * @return
     */
    @RequestMapping("/create")
    public Message AdAdd(@RequestBody CskaoyanMallAd ad){
        return adService.AdAdd(ad);
    }
}
