package com.example.springaop.ext;

import com.example.springaop.beanLifecycle.bean.Black;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 扩展原理
 *  1.BeanFactoryPostProcessor:beanFactory的后置处理器
 *  {@link org.springframework.beans.factory.config.BeanFactoryPostProcessor}
 *      postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory)
 *      (BeanPostProcessor:bean后置处理器，bean创建对象初始化前后进行拦截工作)
 *  在beanFactory标准初始化之后调用:所有的bean定义已经保存加载到BeanFactory中，但是bean的实例还未创建
 *  时机：
 *      1.IOC创建对象
 *      2.invokeBeanFactoryPostProcessors(beanFactory):执行BeanFactoryPostProcessors
 *          如何找到所有的BeanFactoryPostProcessor并执行他们的方法
 *          1.直接在beanFactory中找到所有类型是BeanFactoryPostProcessor的组件，并执行他们的方法
 *          2.在初始化创建其他组件前执行
 * 2.BeanDefinitionRegistryPostProcessor extends BeanFactoryPostProcessor
 *      BeanDefinitionRegistry:bean定义信息的保存中心，以后BeanFactory就是按照BeanDefinitionRegistry里面保存的每一个bean定义信息创建bean实例
 * {@link org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor}
 *      postProcessorBeanDefinitionRegistry(BeanDefinitionRegistry registry)
 *      在所有bean定义信息将要被加载，bean实例还未创建
 *
 * @date 2021/2/3 9:07
 * @version 1.0
 * @description
 */
@Configuration
@ComponentScan("com.example.springaop.ext")
public class ExtConfig {

    @Bean
    public Black black(){
        return new Black();
    }
}
