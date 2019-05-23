package com.cskaoyan.cskaoyanmall.service;

import com.cskaoyan.cskaoyanmall.beans.LoginMessage;

public interface LoginService {
    LoginMessage login(String username,String password);
}
