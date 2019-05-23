package com.cskaoyan.cskaoyanmall.service.user;

import com.cskaoyan.cskaoyanmall.beans.Message;

public interface CollectService {

    Message pageListWithCondition(int page, int limit, String sort, String order, Integer userId,Integer vauleId);
}
