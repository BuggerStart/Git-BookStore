package com.atguigu.book.dao;

import com.atguigu.book.pojo.Book;

import java.util.List;

/**
 * @author Keith
 * @create 2022-09-26 下午 7:53
 */
public interface BookDAO {
    List<Book> getBookList();
    Book getBook(Integer id);
}
