package com.miles.service.impl;

import com.miles.dao.BookDao;
import com.miles.domain.Book;
import com.miles.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : Wzq
 * @version : 1.0
 * @Project : springmvc_07_rest_case
 * @Package : com.miles.service.impl
 * @ClassName : BookServiceImpl.java
 * @createTime : 2022/8/16 16:27
 * @Email : zqwang21@163.com
 * @Description :
 */
@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookDao bookDao;
    public boolean save(Book book) {
        return bookDao.save(book)>0;


    }

    public boolean update(Book book) {
        return bookDao.update(book)>0;

    }

    public boolean delete(Integer id) {
        return bookDao.delete(id)>0;

    }

    public Book getById(Integer id) {
        Book book = bookDao.getById(id);
        return book;
    }

    public List<Book> getAll() {
        List<Book> bookList = bookDao.getAll();

        return bookList;
    }
}
