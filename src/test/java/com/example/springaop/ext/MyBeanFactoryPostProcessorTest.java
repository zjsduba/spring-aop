package com.example.springaop.ext;

import com.example.springaop.Config;
import com.example.springaop.Math;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author: lsp
 * @Date: 2021/2/3 14:28
 * @Version 1.0
 * @Description:
 */
class MyBeanFactoryPostProcessorTest {

    @Test
    void postProcessBeanFactory() {
        AnnotationConfigApplicationContext annotationConfigApplicationContext=new AnnotationConfigApplicationContext(ExtConfig.class);
        annotationConfigApplicationContext.publishEvent("发布事件");
        MyBeanFactoryPostProcessor bean = annotationConfigApplicationContext.getBean(MyBeanFactoryPostProcessor.class);
    }
}