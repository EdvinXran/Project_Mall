package com.cskaoyan.cskaoyanmall.controller;

import com.cskaoyan.cskaoyanmall.beans.LoginData;
import com.cskaoyan.cskaoyanmall.beans.Message;
import com.cskaoyan.cskaoyanmall.beans.system.Admin;
import com.cskaoyan.cskaoyanmall.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {

    @Autowired
    LoginService loginService;

    @RequestMapping("admin/auth/login")
    @ResponseBody
    public Message login(@RequestBody Admin admin){
        String username = admin.getUsername();
        String password = admin.getPassword();
        return loginService.login(username,password);
    }

    @RequestMapping("admin/auth/info")
    @ResponseBody
    public Message loginInfo(String token){

        String[] roles={"超级管理员"};
        String[] perms={"*"};
        LoginData data = new LoginData(roles, "admin123", perms, "https://wpimg.wallstcn.com/f778738c-e4f8-4870-b634-56703b4acafe.gif");
        return new Message(0,data,"成功");
    }

//    @RequestMapping("admin/dashboard")
//    public
}
