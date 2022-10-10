package com.atguigu.book.service;

import com.atguigu.book.pojo.Cart;
import com.atguigu.book.pojo.CartItem;
import com.atguigu.book.pojo.User;

import java.util.List;

/**
 * @author Keith
 * @create 2022-09-27 下午 5:06
 */
public interface CartItemService {
    //在总的购物车中增添一条数据
    void addCartItem(CartItem cartItem);
    //根据cartItem.getid（）定位到需要修改的订单 然后修改他的购买数量
    void updateCartItem(CartItem cartItem);
    void addOrUpdateCartItem(CartItem cartItem,Cart cart);
    //获取指定用户的所有购物车项列表（需要注意的是，这个方法内部查询的时候，会将book的详细信息设置进去）
    List<CartItem> getCartItemList(User user);

    //加载特定用户的购物车信息
    Cart getCart(User user);
}
