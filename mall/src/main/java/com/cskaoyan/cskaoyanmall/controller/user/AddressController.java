package com.cskaoyan.cskaoyanmall.controller.user;

import com.cskaoyan.cskaoyanmall.beans.Message;
import com.cskaoyan.cskaoyanmall.service.user.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("admin/address")
public class AddressController {
    @Autowired
    AddressService addressService;



    @RequestMapping("list")
    @ResponseBody
    public Message pageList(int page,int limit,String sort,String order,String name,Integer userId){
        return addressService.pageListWithCondition(page,limit,sort,order,name,userId);
    }

}
