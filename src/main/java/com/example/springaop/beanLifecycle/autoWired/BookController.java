package com.example.springaop.beanLifecycle.autoWired;

import lombok.Data;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * @Author: lsp
 * @Date: 2020/12/7 11:06
 * @Version 1.0
 * @Description:
 */
@Controller
@ToString
@Data
public class BookController {

    @Autowired(required = false)
    @Qualifier("bookService")
    private BookService bookService;



}
