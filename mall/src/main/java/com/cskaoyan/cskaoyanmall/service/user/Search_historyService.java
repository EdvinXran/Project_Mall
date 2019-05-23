package com.cskaoyan.cskaoyanmall.service.user;

import com.cskaoyan.cskaoyanmall.beans.Message;

public interface Search_historyService {

    Message pageListWithCondition(int page, int limit, String sort, String order, Integer userId, String keyword);
}
