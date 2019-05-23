package com.cskaoyan.mall.beans;

/**
 * @Author: Tangxuan
 * @Date: 2019/5/22 22:11
 */
public class LoginMessage {
    private int errno;

    private Object data;

    private String errmsg;

    public LoginMessage() {
    }

    public LoginMessage(int errno, Object data, String errmsg) {
        this.errno = errno;
        this.data = data;
        this.errmsg = errmsg;
    }

    public int getErrno() {
        return errno;
    }

    public void setErrno(int errno) {
        this.errno = errno;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getErrmsg() {
        return errmsg;
    }

    public void setErrmsg(String errmsg) {
        this.errmsg = errmsg;
    }
}
