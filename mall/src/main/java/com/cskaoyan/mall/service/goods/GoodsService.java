package com.cskaoyan.mall.service.goods;

import com.cskaoyan.mall.beans.CskaoyanMallGoods;
import com.cskaoyan.mall.beans.Message;
import com.cskaoyan.mall.beans.TotalAndItems;

/**
 * @Author: Suzie Liao
 * @Date: 2019-05-23 19:29
 */
public interface GoodsService {

    /*=================== 1. <商品列表>模块 ===================*/
    Message getPageList(String page, String limit);

}
