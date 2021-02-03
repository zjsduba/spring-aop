package com.example.springaop.beanLifecycle.value;

import com.example.springaop.beanLifecycle.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @Author: lsp
 * @Date: 2020/12/7 10:00
 * @Version 1.0
 * @Description:
 */
@Configuration
@PropertySource("classpath:application.properties")
public class PropertySourceTest {

    @Bean
    public Person person(){
        return new Person();
    }
}
