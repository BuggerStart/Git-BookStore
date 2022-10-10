package com.atguigu.book.dao.impl;

import com.atguigu.book.dao.OrderItemDAO;
import com.atguigu.book.pojo.OrderItem;
import com.atguigu.myssm.basedao.BaseDAO;

/**
 * @author Keith
 * @create 2022-09-27 下午 9:42
 */
public class OrderItemDAOImpl extends BaseDAO<OrderItem> implements OrderItemDAO {
    //添加个人的购物车中想要的书籍的信息
    @Override
    public void addOrderItem(OrderItem orderItem) {
        super.executeQuery("INSERT INTO t_order_item values(0,?,?,?)",orderItem.getBook(),orderItem.getBuyCount(),orderItem.getOrderBean());
    }
}
