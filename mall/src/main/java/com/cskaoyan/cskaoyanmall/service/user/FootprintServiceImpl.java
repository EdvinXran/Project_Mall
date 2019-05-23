package com.cskaoyan.cskaoyanmall.service.user;

import com.cskaoyan.cskaoyanmall.beans.ItemTotal;
import com.cskaoyan.cskaoyanmall.beans.Message;
import com.cskaoyan.cskaoyanmall.beans.user.Footprint;
import com.cskaoyan.cskaoyanmall.beans.user.FootprintExample;
import com.cskaoyan.cskaoyanmall.mapper.user.FootprintMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FootprintServiceImpl implements FootprintService {

    @Autowired
    FootprintMapper collectMapper;


    @Override
    public Message pageListWithCondition(int page,int limit,String sort,String order,Integer userId,Integer goodsId) {
        int start_i=(page-1)*limit;
        long total= collectMapper.countByExample(new FootprintExample());
        FootprintExample collectExample = new FootprintExample(sort+" "+order,start_i,limit);
        FootprintExample.Criteria collectExampleCriteria = collectExample.createCriteria();
        if(userId!=null&&!"".equals(userId)){ collectExampleCriteria.andUserIdEqualTo(userId);}
        if(goodsId!=null&&!"".equals(goodsId)){ collectExampleCriteria.andGoodsIdEqualTo(goodsId);}
        List<Footprint> collects = collectMapper.selectByExample(collectExample);
        ItemTotal itemTotal = new ItemTotal(collects, total);
        return new Message(0,itemTotal,"成功");
    }
}
