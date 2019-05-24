package com.cskaoyan.cskaoyanmall.controller.user;

import com.cskaoyan.cskaoyanmall.beans.Message;
import com.cskaoyan.cskaoyanmall.service.user.FootprintService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("admin/footprint")
public class FootprintController {
    @Autowired
    FootprintService footprintService;



    @RequestMapping("list")
    @ResponseBody
    public Message pageList(int page,int limit,String sort,String order,Integer userId,Integer goodsId){
        return footprintService.pageListWithCondition(page,limit,sort,order,userId,goodsId);
    }

}
