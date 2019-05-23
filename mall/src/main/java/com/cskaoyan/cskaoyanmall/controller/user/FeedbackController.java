package com.cskaoyan.cskaoyanmall.controller.user;

import com.cskaoyan.cskaoyanmall.beans.Message;
import com.cskaoyan.cskaoyanmall.service.user.FeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("admin/feedback")
public class FeedbackController {
    @Autowired
    FeedbackService feedbackService;



    @RequestMapping("list")
    @ResponseBody
    public Message pageList(int page,int limit,String sort,String order,Integer userId,Integer id){
        return feedbackService.pageListWithCondition(page,limit,sort,order,userId,id);
    }

}
