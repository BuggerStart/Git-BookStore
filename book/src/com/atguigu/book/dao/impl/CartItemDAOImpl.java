package com.atguigu.book.dao.impl;

import com.atguigu.book.dao.CartItemDAO;
import com.atguigu.book.pojo.CartItem;
import com.atguigu.book.pojo.User;
import com.atguigu.myssm.basedao.BaseDAO;

import java.util.List;

/**
 * @author Keith
 * @create 2022-09-27 下午 4:32
 */
public class CartItemDAOImpl extends BaseDAO<CartItem> implements CartItemDAO {
    //在总的购物车上面增加一条信息
    @Override
    public void addCartItem(CartItem cartItem) {
        executeUpdate("INSERT INTO t_cart_item values(0,?,?,?)",cartItem.getBook().getId(),cartItem.getBuyCount(),cartItem.getUserBean().getId());
    }
    //根据购物车的id进行更新数据
    @Override
    public void updateCartItem(CartItem cartItem) {
        executeUpdate("UPDATE t_cart_item SET buyCount=? WHERE id=?",cartItem.getBuyCount(),cartItem.getId());
    }
        //根据用户的id查询他的购物车
    @Override
    public List<CartItem> getCartItemList(User user) {
        return executeQuery("SELECT * FROM t_cart_item WHERE userBean=?",user.getId());
    }
    //通过id去删除他的购物车
    @Override
    public void delCartItem(CartItem cartItem) {
        super.executeUpdate("DELETE FROM t_cart_item WHERE id=?",cartItem.getId());
    }
}
