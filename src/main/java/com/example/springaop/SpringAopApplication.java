package com.example.springaop;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.springaop.dao")
public class SpringAopApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringAopApplication.class, args);
    }

}
