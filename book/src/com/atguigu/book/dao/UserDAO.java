package com.atguigu.book.dao;

import com.atguigu.book.pojo.User;

public interface UserDAO {
    User getUser(String uname , String pwd );
    //在注册时，增加的新用户
    void addUser(User user);
    //在注册时候，用于验证用户的名称是否被使用
    User getUser(String uname);
}
