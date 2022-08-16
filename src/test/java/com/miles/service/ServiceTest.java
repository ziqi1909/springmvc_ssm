package com.miles.service;

import com.miles.config.SpringConfig;
import com.miles.domain.Book;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : Wzq
 * @version : 1.0
 * @Project : springmvc_07_rest_case
 * @Package : com.miles.service
 * @ClassName : ServiceTest.java
 * @createTime : 2022/8/16 17:00
 * @Email : zqwang21@163.com
 * @Description :
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class ServiceTest {
    @Autowired
    private BookService bookService;


   @Test
    public void Test1(){
       Book book = bookService.getById(1);
       System.out.println(book);

   }
    @Test
    public void Test2(){
        List<Book> books = bookService.getAll();
        System.out.println(books);

    }
}
