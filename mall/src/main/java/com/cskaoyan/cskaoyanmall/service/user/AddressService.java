package com.cskaoyan.cskaoyanmall.service.user;

import com.cskaoyan.cskaoyanmall.beans.Message;

public interface AddressService {

    Message pageListWithCondition(int page,int limit,String sort,String order,String name,Integer userId);
}
