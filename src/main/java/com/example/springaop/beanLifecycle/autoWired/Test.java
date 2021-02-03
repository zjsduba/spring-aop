package com.example.springaop.beanLifecycle.autoWired;

/**
 * @Author: lsp
 * @Date: 2020/12/7 16:35
 * @Version 1.0
 * @Description:
 */
public interface Test {
     default void test(){
         System.out.println("1");
     };
}
