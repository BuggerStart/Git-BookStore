package com.atguigu.book.service;

import com.atguigu.book.pojo.Book;

import java.util.List;

/**
 * @author Keith
 * @create 2022-09-26 下午 8:01
 */
public interface BookService {
    List<Book> getBookList();
    Book getBook(Integer id);
}
