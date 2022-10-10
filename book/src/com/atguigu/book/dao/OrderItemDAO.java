package com.atguigu.book.dao;

import com.atguigu.book.pojo.OrderItem;

/**
 * @author Keith
 * @create 2022-09-27 下午 9:04
 */
public interface OrderItemDAO {
    //添加订单项
    void addOrderItem(OrderItem orderItem);
}
