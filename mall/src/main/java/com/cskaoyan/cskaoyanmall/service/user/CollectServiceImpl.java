package com.cskaoyan.cskaoyanmall.service.user;

import com.cskaoyan.cskaoyanmall.beans.ItemTotal;
import com.cskaoyan.cskaoyanmall.beans.Message;
import com.cskaoyan.cskaoyanmall.beans.user.Collect;
import com.cskaoyan.cskaoyanmall.beans.user.CollectExample;
import com.cskaoyan.cskaoyanmall.mapper.user.CollectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CollectServiceImpl implements CollectService {

    @Autowired
    CollectMapper collectMapper;


    @Override
    public Message pageListWithCondition(int page,int limit,String sort,String order,Integer userId,Integer vauleId) {
        int start_i=(page-1)*limit;
        long total= collectMapper.countByExample(new CollectExample());
        CollectExample collectExample = new CollectExample(sort+" "+order,start_i,limit);
        CollectExample.Criteria collectExampleCriteria = collectExample.createCriteria();
        if(userId!=null&&!"".equals(userId)){ collectExampleCriteria.andUserIdEqualTo(userId);}
        if(vauleId!=null&&!"".equals(vauleId)){ collectExampleCriteria.andValueIdEqualTo(vauleId);}
        List<Collect> collects = collectMapper.selectByExample(collectExample);
        ItemTotal itemTotal = new ItemTotal(collects, total);
        return new Message(0,itemTotal,"成功");
    }
}
