package com.cskaoyan.mall.controller.goods;

import com.cskaoyan.mall.beans.CskaoyanMallGoods;
import com.cskaoyan.mall.beans.Message;
import com.cskaoyan.mall.beans.TotalAndItems;
import com.cskaoyan.mall.service.goods.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author: Suzie Liao
 * @Date: 2019-05-23 19:05
 */

@Controller
public class GoodsController {

    @Autowired
    GoodsService goodsService;


    /*=================== 1. <商品列表>模块 ===================*/

    @RequestMapping("/goods/list")
    @ResponseBody
    public Message getGoodsList(String page, String limit) {
        return goodsService.getPageList(page, limit);
    }

}
