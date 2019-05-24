package com.cskaoyan.mall.controller.login;

import com.cskaoyan.mall.beans.CskaoyanMallAdmin;
import com.cskaoyan.mall.beans.system.Data;
import com.cskaoyan.mall.beans.system.Message;
import com.cskaoyan.mall.service.admin.login.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @Author: Tangxuan
 * @Date: 2019/5/22 19:53
 */
@RestController
public class LoginController {

    //阿里规范，魔法值
    final String loginSuccess="success";
    final String errorUsernameOrPassword="error";
    @Autowired
    LoginService loginService;

    @RequestMapping("/auth/login")
    public Message login(@RequestBody CskaoyanMallAdmin admin){
        String status = loginService.login(admin.getUsername(), admin.getPassword());
        if(loginSuccess.equals(status)){
            return new Message(0,UUID.randomUUID().toString(),"成功");
        }else {
            return new Message(0,UUID.randomUUID().toString(),"成功");
            //return new Message(605,"","用户帐号或密码不正确");
        }
    }
@RequestMapping("/auth/info")
    public Message loginInfo(String taken){

    String[] roles={"超级管理员"};
    String[] perms={"*"};
    Data data = new Data(roles,"admin123",perms,"https://wpimg.wallstcn.com/f778738c-e4f8-4870-b634-56703b4acafe.gif");
    return new Message(0,data,"成功");
    }
}

