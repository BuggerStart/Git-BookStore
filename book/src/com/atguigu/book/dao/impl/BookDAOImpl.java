package com.atguigu.book.dao.impl;

import com.atguigu.book.dao.BookDAO;
import com.atguigu.book.pojo.Book;
import com.atguigu.myssm.basedao.BaseDAO;

import java.util.List;

/**
 * @author Keith
 * @create 2022-09-26 下午 7:55
 */
public class BookDAOImpl extends BaseDAO<Book> implements BookDAO {

    //获取所有booK信息
    @Override
    public List<Book> getBookList() {
        return executeQuery("SELECT * FROM t_book ");
    }
    //通过id查找所需要的book信息
    @Override
    public Book getBook(Integer id) {
        return load("SELECT * FROM t_book WHERE id=?",id);
    }
}
