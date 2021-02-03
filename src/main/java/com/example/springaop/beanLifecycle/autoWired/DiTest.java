package com.example.springaop.beanLifecycle.autoWired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 * @Author: lsp
 * @Date: 2020/12/7 11:14
 * @Version 1.0
 * @Description:
 */
@Configuration
@ComponentScan("com.example.springbatch.autoWired")
public class DiTest {


    @Autowired
    private ApplicationContext applicationContext;


    @Bean
    @Primary
    public BookService bookService2(BookDao bookDao){
        BookService bookService2 = new BookService(bookDao);
        bookService2.setName("bean set");
        return bookService2;
    }
}
