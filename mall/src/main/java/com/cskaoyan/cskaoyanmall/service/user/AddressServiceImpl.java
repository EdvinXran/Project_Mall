package com.cskaoyan.cskaoyanmall.service.user;

import com.cskaoyan.cskaoyanmall.beans.ItemTotal;
import com.cskaoyan.cskaoyanmall.beans.Message;
import com.cskaoyan.cskaoyanmall.beans.user.Address;
import com.cskaoyan.cskaoyanmall.beans.user.AddressExample;
import com.cskaoyan.cskaoyanmall.mapper.user.AddressMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressServiceImpl implements AddressService {

    @Autowired
    AddressMapper addressMapper;


    @Override
    public Message pageListWithCondition(int page,int limit,String sort,String order,String name,Integer userId) {
        int start_i=(page-1)*limit;
        long total= addressMapper.countByExample(new AddressExample());
//        List<Address> addresss =addressMapper.selectPageList(start_i,limit,sort,order);
        AddressExample addressExample = new AddressExample(sort+" "+order,start_i,limit);
        AddressExample.Criteria addressExampleCriteria = addressExample.createCriteria();
        if(name!=null&&!"".equals(name)){addressExampleCriteria .andNameLike("%"+name+"%"); }
        if(userId!=null&&!"".equals(userId)){ addressExampleCriteria.andUserIdEqualTo(userId);}
        List<Address> addresss = addressMapper.selectByExample(addressExample);
        ItemTotal itemTotal = new ItemTotal(addresss, total);
        return new Message(0,itemTotal,"成功");
    }
}
