package com.cskaoyan.cskaoyanmall.controller.user;

import com.cskaoyan.cskaoyanmall.beans.Message;
import com.cskaoyan.cskaoyanmall.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("admin/user")
public class UserController {
    @Autowired
    UserService userService;

//    @RequestMapping("list")
//    @ResponseBody
//    public Message pageList(int page,int limit,String sort,String order){
//        return userService.pageList(page,limit,sort,order);
//    }

    @RequestMapping("list")
    @ResponseBody
    public Message pageList(int page,int limit,String sort,String order,String username,String mobile){
        return userService.pageListWithCondition(page,limit,sort,order,username,mobile);
    }

}
