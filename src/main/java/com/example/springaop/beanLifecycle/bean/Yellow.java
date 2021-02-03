package com.example.springaop.beanLifecycle.bean;

import lombok.Data;

/**
 * @Author: lsp
 * @Date: 2020/12/4 10:28
 * @Version 1.0
 * @Description:
 */
@Data
public class Yellow {
    private String color;

    public Yellow() {
        System.out.println("this is a constructor method");
    }

    public void init(){
        System.out.println("this is a init method");
    }
    public void destroy(){
        System.out.println("this is a destroy method");
    }
}
