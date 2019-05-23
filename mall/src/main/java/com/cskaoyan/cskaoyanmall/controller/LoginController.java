package com.cskaoyan.cskaoyanmall.controller;

import com.cskaoyan.cskaoyanmall.beans.LoginMessage;
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
    public LoginMessage login(@RequestBody Admin admin){
        String username = admin.getUsername();
        String password = admin.getPassword();
        return loginService.login(username,password);
    }
}
