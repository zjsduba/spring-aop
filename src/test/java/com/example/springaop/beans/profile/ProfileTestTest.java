package com.example.springaop.beans.profile;

import com.example.springaop.beanLifecycle.profile.ProfileTest;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

/**
 * @author lsp
 * @since  2020/12/8 15:22
 * @version 1.0
 *
 */
@SpringBootTest
class ProfileTestTest {
    //@Resource
    //AnnotationConfigApplicationContext applicationContext;
    @Test
    void dataSourceTest() {
        AnnotationConfigApplicationContext applicationContext=new AnnotationConfigApplicationContext();
        //设置需要激活的环境
        applicationContext.getEnvironment().setActiveProfiles("prod");
        //注册配置类
        applicationContext.register(ProfileTest.class);
        //刷新容器
        applicationContext.refresh();
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        Arrays.stream(beanDefinitionNames).filter(s -> s.contains("DataSource")).forEach(s -> System.out.println(s));
    }
}