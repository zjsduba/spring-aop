package com.example.springaop;

/**
 * @Author: lsp
 * @Date: 2020/12/11 15:47
 * @Version 1.0
 * @Description:
 */
public class Math {
    public int add(int i, int j) throws Exception{
        System.out.println("Math.add方法正在执行");
        return i + j;
    }
}
