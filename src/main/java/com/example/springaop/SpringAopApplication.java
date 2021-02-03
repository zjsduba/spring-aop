package com.example.springaop;

import com.example.springaop.beanLifecycle.importBean.ImportBeanDefinitionRegistrarTest;
import com.example.springaop.beanLifecycle.importBean.ImportSelectorTest;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@MapperScan("com.example.springaop.tx.dao")
@Import({ImportSelectorTest.class, ImportBeanDefinitionRegistrarTest.class})
public class SpringAopApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringAopApplication.class, args);
    }

}
