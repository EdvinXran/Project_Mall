package com.cskaoyan.mall.service.admin.login;

import com.cskaoyan.mall.beans.CskaoyanMallAdmin;
import com.cskaoyan.mall.beans.CskaoyanMallAdminExample;
import com.cskaoyan.mall.mapper.CskaoyanMallAdminMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: Tangxuan
 * @Date: 2019/5/22 22:29
 */
@Service("loginService")
public class LoginServiceImpl implements  LoginService{
    @Autowired
    CskaoyanMallAdminMapper cskaoyanMallAdminMapper;

    @Override
    public String login(String username, String password) {
        //通过controller层得到的用户名查询用户信息
        CskaoyanMallAdminExample example = new CskaoyanMallAdminExample();
        CskaoyanMallAdminExample.Criteria criteria = example.createCriteria();
        criteria.andUsernameEqualTo(username).andPasswordEqualTo(password);
        List<CskaoyanMallAdmin> users= cskaoyanMallAdminMapper.selectByExample(example);
        if(users.size()==0){
            //user是空，输错用户名
            return "error";
        }else {
                //略
                return "success";
            }
        }
    }
