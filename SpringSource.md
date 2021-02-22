Spring容器的refresh()[创建和刷新]
1.prepareRefresh() 刷新前的预处理;
    1.initPropertySources();初始化属性设置，子类自定义个性化的属性设置方法
    2.getEnvironment().validateRequiredProperties();检验属性的合法性等
    3.this.earlyApplicationEvents =new LinkedHashSet<>(this.applicationListeners);保存容器中的一些早期事件
2.obtainFreshBeanFactory();获取BeanFactory
    1.refreshBeanFactory();刷新BeanFactory
        在GenericApplicationContext对象构造时this.beanFactory=new DefaultListableBeanFactory() ;
        设置ID
    2.getBeanFactory();
        返回刚才GenericApplicationContext创建的BeanFactory【DefaultListableBeanFactory】对象
        将创建的beanFactory【DefaultListableBeanFactory】返回
3.prepareBeanFactory(beanFactory);beanFactory的预准备工作(BeanFactory进行一些设置)
    1.设置BeanFactory的类加载器，支持表达式解析器。。。
    2.添加部分的BeanPostProcessor[ApplicationContextAwareProcessor]
    3.设置忽略的自动装配的接口EnvironmentAware、EmbeddedValueResolverAware、xxx
    4.注册可以解析的自动装配：我们能直接在任何组件中自动注入：BeanFactory,ResourceLoader,ApplicationEventPublisher,ApplicationContext
    5.添加BeanPostProcessor[ApplicationListenerDetector]
    6.添加编译时的AspectJ
    7.给BeanFactory中注册一些能用的组件：
        environment【ConfigurableEnvironment】、
        ​systemProperties【Map<String,Object>】
        ​systemEnvironment【Map<String,Object>】
4.postProcessBeanFactory(beanFactory):BeanFactory准备工作完成后进行的后置处理工作
    1.子类通过重写这个方法来在BeanFactory创建并预准备完成以后做进一步的设置
    
===================以上是beanFactory的创建与预准备工作=====================
5.invokeBeanFactoryPostProcessors(beanFactory);执行BeanFactoryPostProcessors(beanFactory)的方法;
BeanFactoryPostProcessors:beanFactory的后置处理器,在beanFactory标准初始化之后执行的
    两个接口:BeanFactoryPostProcessor、BeanDefinitionRegistryPostProcessor
    1.执行BeanFactoryPostProcessor的方法
        1.先执行BeanDefinitionRegistryPostProcessor
            1.获取所有的BeanDefinitionRegistryPostProcessor
            2.先执行实现了PriorityOrdered优先级接口的BeanDefinitionRegistryPostProcessor
                postProcessor.postProcessBeanDefinitionRegistry(registry);
            3.在执行实现了Ordered顺序接口的BeanDefinitionRegistryPostProcessor
                postProcessor.postProcessBeanDefinitionRegistry(registry);
            4.最后执行其它没有实现优先级或者顺序接口的BeanDefinitionRegistryPostProcessor
                postProcessor.postProcessBeanDefinitionRegistry(registry);
            5.同时,BeanDefinitionRegistryPostProcessor也是BeanFactoryPostProcessor，需要执行
                postProcessor.postProcessBeanFactory(beanFactory);
        2.在执行BeanFactoryPostProcessor的方法
            1.获取所有的BeanFactoryPostProcessor
            2.先执行实现了PriorityOrdered优先级接口的BeanFactoryPostProcessor
                postProcessor.postProcessBeanFactory(beanFactory);
            3.在执行实现了Ordered顺序接口的BeanFactoryPostProcessor
                postProcessor.postProcessBeanFactory(beanFactory);
             4.最后执行其它没有实现优先级或者顺序接口的BeanFactoryPostProcessor
                postProcessor.postProcessBeanFactory(beanFactory);
    