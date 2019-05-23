package com.cskaoyan.cskaoyanmall.service;

import com.cskaoyan.cskaoyanmall.beans.LoginMessage;
import com.cskaoyan.cskaoyanmall.beans.system.Admin;
import com.cskaoyan.cskaoyanmall.beans.system.AdminExample;
import com.cskaoyan.cskaoyanmall.mapper.system.AdminMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class LoginServiceImpl implements LoginService{

    @Autowired
    AdminMapper adminMapper;

    @Override
    public LoginMessage login(String username, String password) {
        LoginMessage loginMessage = new LoginMessage();
        AdminExample adminExample = new AdminExample();
        adminExample.createCriteria().andUsernameEqualTo(username).andPasswordEqualTo(password);
//        List<Admin> admins =adminMapper.selectByExample(adminExample);
        long l = adminMapper.countByExample(adminExample);
//        if(admins!=null){
        if(true){
            loginMessage.setErrmsg("成功");
            loginMessage.setErrno(0);
            loginMessage.setData(UUID.randomUUID());
        }else{
            loginMessage.setErrno(605);
            loginMessage.setErrmsg("用户名或密码不正确");
        }
        return loginMessage;
    }
}
