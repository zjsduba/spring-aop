package com.example.springaop.beanLifecycle.importBean;

import com.example.springaop.beanLifecycle.bean.Red;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @Author: lsp
 * @Date: 2020/12/3 17:16
 * @Version 1.0
 * @Description:
 */
public class ImportBeanDefinitionRegistrarTest implements ImportBeanDefinitionRegistrar {
    /**
     * Register bean definitions as necessary based on the given annotation metadata of
     * the importing {@code @Configuration} class.
     * <p>Note that {@link BeanDefinitionRegistryPostProcessor} types may <em>not</em> be
     * registered here, due to lifecycle constraints related to {@code @Configuration}
     * class processing.
     * <p>The default implementation is empty.
     *
     * @param importingClassMetadata annotation metadata of the importing class
     * @param registry               current bean definition registry
     */
    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        //指定bean定义信息，类型，作业域等
        RootBeanDefinition rootBeanDefinition=new RootBeanDefinition(Red.class);
        //注册一个bean，指定bean名称
        registry.registerBeanDefinition("red",rootBeanDefinition);
    }
}
