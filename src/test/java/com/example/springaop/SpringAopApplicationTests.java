package com.example.springaop;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
class SpringAopApplicationTests {

    @Test
    void contextLoads() throws Exception{
        AnnotationConfigApplicationContext annotationConfigApplicationContext=new AnnotationConfigApplicationContext(Config.class);

        Math bean = annotationConfigApplicationContext.getBean(Math.class);
        bean.add(1,1);
    }

}
