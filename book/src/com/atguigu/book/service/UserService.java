package com.atguigu.book.service;

import com.atguigu.book.pojo.User;

public interface UserService {
    //用于登录操作
    User login(String uname , String pwd );
    //用于注册操作
    void regist(User user);
    //判断注册时候是否存在重名操作
    User getUser(String uname);
}
