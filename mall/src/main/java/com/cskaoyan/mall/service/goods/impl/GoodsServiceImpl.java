package com.cskaoyan.mall.service.goods.impl;

import com.cskaoyan.mall.beans.CskaoyanMallGoods;
import com.cskaoyan.mall.beans.CskaoyanMallGoodsExample;
import com.cskaoyan.mall.beans.Message;
import com.cskaoyan.mall.beans.TotalAndItems;
import com.cskaoyan.mall.mapper.CskaoyanMallGoodsMapper;
import com.cskaoyan.mall.service.goods.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: Suzie Liao
 * @Date: 2019-05-23 19:30
 */
@Service
public class GoodsServiceImpl implements GoodsService {

    @Autowired
    CskaoyanMallGoodsMapper cskaoyanMallGoodsMapper;

    /*=================== 1. <商品列表>模块 ===================*/
    @Override
    public Message getPageList(String page, String limit) {
        CskaoyanMallGoodsExample example = new CskaoyanMallGoodsExample();
        example.setOrderByClause("add_time desc");

        // 分页展示
        example.setOffset(Integer.parseInt(page));
        example.setLimit(Integer.parseInt(limit));

         int total = (int) cskaoyanMallGoodsMapper.countByExample(example);
        // List<CskaoyanMallGoods> list = cskaoyanMallGoodsMapper.selectByExample(example);
        List<CskaoyanMallGoods> list = cskaoyanMallGoodsMapper.selectByExampleWithBLOBs(example);
        return new Message(0, new TotalAndItems<CskaoyanMallGoods>(total, list), "成功");
    }
}
