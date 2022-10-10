package com.atguigu.book.dao;

import com.atguigu.book.pojo.OrderBean;
import com.atguigu.book.pojo.User;

import java.util.List;

/**
 * @author Keith
 * @create 2022-09-27 下午 9:51
 */
public interface OrderDAO {
    //添加订单
    void addOrderBean(OrderBean orderBean);
    //获取指定用户的订单列表
    List<OrderBean> getOrderList(User user);
    //获取指定用户订单的所有图书数目
    Integer getOrderTotalBookCount(OrderBean orderBean);
}
