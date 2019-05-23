package com.cskaoyan.cskaoyanmall.service;

import com.cskaoyan.cskaoyanmall.beans.Message;
import com.cskaoyan.cskaoyanmall.beans.system.AdminExample;
import com.cskaoyan.cskaoyanmall.mapper.system.AdminMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class LoginServiceImpl implements LoginService{

    @Autowired
    AdminMapper adminMapper;

    @Override
    public Message login(String username, String password) {
        Message loginMessage = new Message();
        AdminExample adminExample = new AdminExample();
        adminExample.createCriteria().andUsernameEqualTo(username).andPasswordEqualTo(password);
//        List<Admin> admins =adminMapper.selectByExample(adminExample);
        long l = adminMapper.countByExample(adminExample);
//        if(admins!=null){
        if(true){
            loginMessage.setErrmsg("成功");
            loginMessage.setErrno(0);
            loginMessage.setData(UUID.randomUUID().toString());
        }else{
            loginMessage.setErrmsg("成功");
            loginMessage.setErrno(0);
            loginMessage.setData(UUID.randomUUID().toString());
        }
        return loginMessage;
    }
}
