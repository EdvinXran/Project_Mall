package com.cskaoyan.cskaoyanmall.controller.user;

import com.cskaoyan.cskaoyanmall.beans.Message;
import com.cskaoyan.cskaoyanmall.service.user.Search_historyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("admin/history")
public class Search_historyController {
    @Autowired
    Search_historyService search_historyService;



    @RequestMapping("list")
    @ResponseBody
    public Message pageList(int page,int limit,String sort,String order,Integer userId,String keyword){
        return search_historyService.pageListWithCondition(page,limit,sort,order,userId,keyword);
    }

}
