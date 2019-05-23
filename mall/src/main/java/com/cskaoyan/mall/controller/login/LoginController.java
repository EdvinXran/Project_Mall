package com.cskaoyan.mall.controller.login;

import com.cskaoyan.mall.beans.CskaoyanMallAdmin;
import com.cskaoyan.mall.beans.LoginMessage;
import com.cskaoyan.mall.beans.data;
import com.cskaoyan.mall.service.admin.login.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.ws.Service;
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
    public LoginMessage login(@RequestBody CskaoyanMallAdmin admin){
        String status = loginService.login(admin.getUsername(), admin.getPassword());
        if(loginSuccess.equals(status)){
            String string = UUID.randomUUID().toString();
            return new LoginMessage(0,string,"成功");
        }else {
            String string = UUID.randomUUID().toString();
            return new LoginMessage(0,string,"成功");
            //return new LoginMessage(605,"","用户帐号或密码不正确");
        }
    }
@RequestMapping("/auth/info")
    public LoginMessage loginInfo(String taken){

    String[] roles={"超级管理员"};
    String[] perms={"*"};
    data data = new data(roles,"admin123",perms,"https://wpimg.wallstcn.com/f778738c-e4f8-4870-b634-56703b4acafe.gif");
    return new LoginMessage(0,data,"成功");
    }
}

