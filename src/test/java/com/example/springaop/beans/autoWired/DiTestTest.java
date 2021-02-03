package com.example.springaop.beans.autoWired;

import com.example.springaop.beanLifecycle.autoWired.BookController;
import com.example.springaop.beanLifecycle.autoWired.BookService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import javax.annotation.Resource;

/**
 * @Author: lsp
 * @Date: 2020/12/7 11:18
 * @Version 1.0
 * @Description:
 */
@SpringBootTest
class DiTestTest {
    @Resource
    ApplicationContext applicationContext;

    @Test
    public void TestDi(){
        BookController bookController = applicationContext.getBean(BookController.class);
        BookService bookService = applicationContext.getBean(BookService.class);
        System.out.println(bookController);
        System.out.println(bookService);
        System.out.println(bookController.getBookService()==bookService);
    }
}