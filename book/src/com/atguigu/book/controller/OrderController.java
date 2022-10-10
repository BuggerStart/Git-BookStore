package com.atguigu.book.controller;

import com.atguigu.book.pojo.OrderBean;
import com.atguigu.book.pojo.User;
import com.atguigu.book.service.OrderService;

import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * @author Keith
 * @create 2022-09-27 下午 10:52
 */
public class OrderController {
    private OrderService orderService;
    public String checkOut(HttpSession session){
        OrderBean orderBean = new OrderBean() ;
        Date now = new Date();
        int year = now.getYear();
        int month = now.getMonth() ;
        int day = now.getDate();
        int hour = now.getHours();
        int min = now.getMinutes() ;
        int sec = now.getSeconds() ;
        orderBean.setOrderNo(UUID.randomUUID()+"_"+year+month+day+hour+min+sec);
        orderBean.setOrderDate(now);
        User user = (User) session.getAttribute("currUser");
        orderBean.setOrderUser(user);
        orderBean.setOrderMoney(user.getCart().getTotalMoney());
        orderBean.setOrderStatus(0);
        orderService.addOrderBean(orderBean);
        return "index";
    }
    public String getOrderList(HttpSession session){
        User user = (User) session.getAttribute("currUser");
        List<OrderBean> orderList = orderService.getOrderList(user);
        user.setOrderList(orderList);
        session.setAttribute("currUser",user);
        return "order/order";
    }
}
