package com.example.springaop.beanLifecycle.bean;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;

/**
 * @Author: lsp
 * @Date: 2020/12/7 10:02
 * @Version 1.0
 * @Description:
 */
@Data
public class Person {
    @Value("张三")
    private String name;
    @Value("#{20-2}")
    private Integer age;
    @Value("${nickName}")
    private String nickName;
}
