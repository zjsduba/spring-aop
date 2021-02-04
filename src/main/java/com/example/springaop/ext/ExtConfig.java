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
 *      在所有bean定义信息将要被加载，bean实例还未创建时执行
 *      优先于BeanFactoryPostProcessor执行：
 *      利用BeanDefinitionRegistryPostProcessor给容器中在额外添加一些组件
 *      原理：
 *          1.IOC创建对象
 *          2.refresh()->invokeBeanFactoryPostProcessors(beanFactory)
 *          3.从容器中获取到所有的BeanFactoryPostProcessor组件
 *              1.依次触发所有的postProcessBeanDefinitionRegistry()方法
 *              2.在来触发postProcessBeanFactory()方法
 *          4.在从容器中找到BeanFactoryPostProcessor组件，依次触发postProcessBeanFactory()方法
 * 3.ApplicationListener：监听容器中发布的事件，事件模型驱动开发
 *  public interface ApplicationListener<E extends ApplicationEvent> extends EventListener
 *      监听ApplicationEvent及其下面的子事件
 *      1.实现一个监听器来监听某个时间（ApplicationEvent及其子类）
 *      2.把监听器加入容器
 *      3.只要容器中有相关事件发布，我们就能监听到这个事件（ContextRefreshedEvent：容器刷新完成-所有bean都完全创建会发布这个事件）
 *      4.自定义发布事件
 *          ApplicationContext.publishEvent(Object object)
 *      原理：
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
