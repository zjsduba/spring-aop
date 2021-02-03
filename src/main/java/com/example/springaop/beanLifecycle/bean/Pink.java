package com.example.springaop.beanLifecycle.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @Author: lsp
 * @Date: 2020/12/4 15:01
 * @Version 1.0
 * @Description:
 */
public class Pink {

    public Pink() {
        System.out.println("this is a constructor method:Pink");
    }

    @PostConstruct
    public void init(){
        System.out.println("this is a PostConstruct method:Pink");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("this is a PreDestroy method:Pink");
    }

}
