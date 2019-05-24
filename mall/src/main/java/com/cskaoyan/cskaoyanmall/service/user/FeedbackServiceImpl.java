package com.cskaoyan.cskaoyanmall.service.user;

import com.cskaoyan.cskaoyanmall.beans.ItemTotal;
import com.cskaoyan.cskaoyanmall.beans.Message;
import com.cskaoyan.cskaoyanmall.beans.user.Feedback;
import com.cskaoyan.cskaoyanmall.beans.user.FeedbackExample;
import com.cskaoyan.cskaoyanmall.mapper.user.FeedbackMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FeedbackServiceImpl implements FeedbackService {

    @Autowired
    FeedbackMapper feedbackMapper;


    @Override
    public Message pageListWithCondition(int page,int limit,String sort,String order,String username,Integer id) {
        int start_i=(page-1)*limit;
        long total= feedbackMapper.countByExample(new FeedbackExample());
        FeedbackExample feedbackExample = new FeedbackExample(sort+" "+order,start_i,limit);
        FeedbackExample.Criteria feedbackExampleCriteria = feedbackExample.createCriteria();
        if(username!=null&&!"".equals(username)){ feedbackExampleCriteria.andUsernameLike("%"+username+"%");}
        if(id!=null&&!"".equals(id)){ feedbackExampleCriteria.andIdEqualTo(id);}
        List<Feedback> feedbacks = feedbackMapper.selectByExample(feedbackExample);
        ItemTotal itemTotal = new ItemTotal(feedbacks, total);
        return new Message(0,itemTotal,"成功");
    }
}
