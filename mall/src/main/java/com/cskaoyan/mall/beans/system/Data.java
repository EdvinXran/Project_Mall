package com.cskaoyan.mall.beans.system;

import java.util.Arrays;

/**
 * @Author: Tangxuan
 * @Date: 2019/5/23 10:58
 */
public class Data {
    private String[] roles;
    private String name;
    private String[] perms;
    private String avatar;

    public Data() {
    }

    public Data(String[] roles, String name, String[] perms, String avatar) {
        this.roles = roles;
        this.name = name;
        this.perms = perms;
        this.avatar=avatar;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String[] getRoles() {
        return roles;
    }

    public void setRoles(String[] roles) {
        this.roles = roles;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getPerms() {
        return perms;
    }

    public void setPerms(String[] perms) {
        this.perms = perms;
    }

    @Override
    public String toString() {
        return "Data{" +
                "roles=" + Arrays.toString(roles) +
                ", name='" + name + '\'' +
                ", perms=" + Arrays.toString(perms) +
                '}';
    }
}