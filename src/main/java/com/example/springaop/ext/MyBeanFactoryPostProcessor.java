package com.example.springaop.ext;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

/**
 * @Author: lsp
 * @Date: 2021/2/3 9:30
 * @Version 1.0
 * @Description:
 */
@Configuration
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

    /**
     * Modify the application context's internal bean factory after its standard
     * initialization. All bean definitions will have been loaded, but no beanLifecycle
     * will have been instantiated yet. This allows for overriding or adding
     * properties even to eager-initializing beanLifecycle.
     *
     * @param beanFactory the bean factory used by the application context
     * @throws BeansException in case of errors
     */
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        System.out.println("MyBeanFactoryPostProcessor.postProcessBeanFactory");
        System.out.println("beanFactory = [" + beanFactory + "]");
        System.out.println("beanFactoryNames = " + Arrays.asList(beanFactory.getBeanDefinitionNames()));
        System.out.println("count = " + beanFactory.getBeanDefinitionCount());
    }
}
