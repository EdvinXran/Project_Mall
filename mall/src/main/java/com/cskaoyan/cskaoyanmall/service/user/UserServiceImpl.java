package com.cskaoyan.cskaoyanmall.service.user;

import com.cskaoyan.cskaoyanmall.beans.ItemTotal;
import com.cskaoyan.cskaoyanmall.beans.Message;
import com.cskaoyan.cskaoyanmall.beans.user.User;
import com.cskaoyan.cskaoyanmall.beans.user.UserExample;
import com.cskaoyan.cskaoyanmall.mapper.user.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public Message pageList(int page, int limit, String sort, String order) {
        int start_i=(page-1)*limit;
        long total= userMapper.countByExample(new UserExample());
//        List<User> users =userMapper.selectPageList(start_i,limit,sort,order);
        UserExample userExample = new UserExample(sort+" "+order,start_i,limit);
        List<User> users = userMapper.selectByExample(userExample);
        ItemTotal itemTotal = new ItemTotal(users, total);
        return new Message(0,itemTotal,"成功");
    }

    @Override
    public Message pageListWithCondition(int page, int limit, String sort, String order, String username, String mobile) {
        int start_i=(page-1)*limit;
        long total= userMapper.countByExample(new UserExample());
//        List<User> users =userMapper.selectPageList(start_i,limit,sort,order);
        UserExample userExample = new UserExample(sort+" "+order,start_i,limit);
        UserExample.Criteria userExampleCriteria = userExample.createCriteria();
        if(username!=null&&!"".equals(username)){userExampleCriteria .andUsernameLike("%"+username+"%"); }
        if(mobile!=null&&!"".equals(mobile)){ userExampleCriteria.andMobileLike("%"+mobile+"%");}
        List<User> users = userMapper.selectByExample(userExample);
        ItemTotal itemTotal = new ItemTotal(users, total);
        return new Message(0,itemTotal,"成功");
    }
}
