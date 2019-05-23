package com.cskaoyan.cskaoyanmall.service;

import com.cskaoyan.cskaoyanmall.beans.Message;

public interface LoginService {
    Message login(String username, String password);
}
