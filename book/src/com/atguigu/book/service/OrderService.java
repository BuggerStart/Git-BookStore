package com.atguigu.book.service;

import com.atguigu.book.pojo.OrderBean;
import com.atguigu.book.pojo.User;

import java.util.List;

/**
 * @author Keith
 * @create 2022-09-27 下午 9:47
 */
public interface OrderService {

    void addOrderBean(OrderBean orderBean);
    List<OrderBean> getOrderList(User user);
}
