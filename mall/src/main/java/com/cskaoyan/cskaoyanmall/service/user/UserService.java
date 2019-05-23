package com.cskaoyan.cskaoyanmall.service.user;

import com.cskaoyan.cskaoyanmall.beans.Message;

public interface UserService {

    Message pageList(int page,int limit,String sort,String order);

    Message pageListWithCondition(int page, int limit, String sort, String order, String username, String mobile);
}
