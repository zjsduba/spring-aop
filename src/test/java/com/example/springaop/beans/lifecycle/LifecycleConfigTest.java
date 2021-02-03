package com.example.springaop.beans.lifecycle;

import com.example.springaop.beanLifecycle.bean.Person;
import com.example.springaop.beanLifecycle.value.PropertySourceTest;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.annotation.Resource;
import java.util.Arrays;

/**
 * @Author: lsp
 * @Date: 2020/12/4 14:08
 * @Version 1.0
 * @Description:
 */
@SpringBootTest
class LifecycleConfigTest {

    @Resource
    ApplicationContext applicationContext;

    @Test
    public void testLifecycle(){
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        Arrays.stream(beanDefinitionNames).filter(s -> !s.contains("org")||!s.contains("spring")).forEach(s -> System.out.println(s));
        AnnotationConfigApplicationContext annotationConfigApplicationContext=new AnnotationConfigApplicationContext(PropertySourceTest.class);
        Person person = (Person) annotationConfigApplicationContext.getBean("person");
        System.out.println(person);
        annotationConfigApplicationContext.close();
    }

}