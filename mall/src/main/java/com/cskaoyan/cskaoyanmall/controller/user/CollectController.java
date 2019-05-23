package com.cskaoyan.cskaoyanmall.controller.user;

import com.cskaoyan.cskaoyanmall.beans.Message;
import com.cskaoyan.cskaoyanmall.service.user.CollectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("admin/collect")
public class CollectController {
    @Autowired
    CollectService collectService;



    @RequestMapping("list")
    @ResponseBody
    public Message pageList(int page,int limit,String sort,String order,Integer userId,Integer vauleId){
        return collectService.pageListWithCondition(page,limit,sort,order,userId,vauleId);
    }

}
