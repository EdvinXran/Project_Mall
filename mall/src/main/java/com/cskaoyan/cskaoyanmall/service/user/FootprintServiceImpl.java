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
    FootprintMapper footprintMapper;


    @Override
    public Message pageListWithCondition(int page,int limit,String sort,String order,Integer userId,Integer goodsId) {
        int start_i=(page-1)*limit;
        long total= footprintMapper.countByExample(new FootprintExample());
        FootprintExample footprintExample = new FootprintExample(sort+" "+order,start_i,limit);
        FootprintExample.Criteria footprintExampleCriteria = footprintExample.createCriteria();
        if(userId!=null&&!"".equals(userId)){ footprintExampleCriteria.andUserIdEqualTo(userId);}
        if(goodsId!=null&&!"".equals(goodsId)){ footprintExampleCriteria.andGoodsIdEqualTo(goodsId);}
        List<Footprint> footprints = footprintMapper.selectByExample(footprintExample);
        ItemTotal itemTotal = new ItemTotal(footprints, total);
        return new Message(0,itemTotal,"成功");
    }
}
