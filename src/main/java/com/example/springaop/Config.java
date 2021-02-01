package com.example.springaop;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @Author: lsp
 * @Date: 2020/12/14 15:27
 * @Version 1.0
 * @Description:
 */
@Configuration
@EnableAspectJAutoProxy
public class Config {

    @Bean
    public Math math(){
        return new Math();
    }

    @Bean
    public LogAspect logAspect(){
        return new LogAspect();
    }
}
