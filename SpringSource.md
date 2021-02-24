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
6.registerBeanPostProcessors(beanFactory);注册BeanPostProcessor(bean的后置处理器--拦截bean的创建过程)
    不同接口类型的BeanPostProcessor:在Bean创建前后的执行时机是不一样的
    接口类型：
        BeanPostProcessor
        DestructionAwareBeanPostProcessor
        InstantiationAwareBeanPostProcessor
        SmartInstantiationAwareBeanPostProcessor
        MergedBeanDefinitionPostProcessor【internalPostProcessors】
    1.获取所有的BeanPostProcessor,后置处理器都默认可以通过PriorityOrdered、Ordered接口来指定优先级
    2.先注册PriorityOrdered优先级接口的BeanPostProcessor
        把每一个BeanPostProcessor添加到BeanFactory中:beanFactory.addBeanPostProcessor(postProcessor);
    3.再注册了实现Ordered接口的
    4.最后注册其他的
    5.最终注册MergedBeanDefinitionPostProcessor类型的
    6.重新注册ApplicationListenerDetector:在bean创建完成后检查是否是ApplicationListener
        this.applicationContext.addApplicationListener((ApplicationListener<?>) bean);
7.initMessageSource:初始化MessageSource组件(做国际化功能;消息绑定，消息解析等)
    1.获取beanFactory；
    2.看容器中是否有id为messageSource，类型是MessageSource的组件
        如果有赋值给messageSource，如果没有就创建一个DelegatingMessageSource
        MessageSource:取出国际化配置文件中的某个key的值,能按照区域信息获取
    3.把创建好的MessageSource注册在容器中,以后获取国际化配置文件的值的时候，可以自动注入MessageSource，调用其方法可以获得相关配置属性
        beanFactory.registerSingleton(MESSAGE_SOURCE_BEAN_NAME, this.messageSource);
        getMessage(String code, @Nullable Object[] args, @Nullable String defaultMessage, Locale locale)
8.initApplicationEventMulticaster();初始化事件多播器   
    1.获取BeanFactory
    2.从BeanFactory获取ApplicationEventMulticaster的组件
    3.如果上一步没有配置，创建一个SimpleApplicationEventMulticaster
    4.将创建的ApplicationEventMulticaster注册到BeanFactory中，以后其他组件直接自动注入
9.onRefresh();留给子类(子容器)
    1.子类重写这个方法，在容器刷新的时候可以自定义逻辑
10.registerListener:给容器中所有项目里面的监听器ApplicationListener注册进来
    1.从容器中拿到所有的硬编码ApplicationListener，添加到事件派发器中
        getApplicationEventMulticaster().addApplicationListener(listener);
    2.从容器中拿到所有的配置形式的ApplicationListener，将listenerBeanName添加到事件派发器中
        getApplicationEventMulticaster().addApplicationListenerBean(listenerBeanName)
    3.派发早期事件
        getApplicationEventMulticaster().multicastEvent(earlyEvent);
11.finishBeanFactoryInitialization(beanFactory);初始化所有剩下的单实例bean
    1.ConversionService(转换服务)初始化
    2.EmbeddedValueResolver(嵌入式值解析器)初始化
    3.LoadTimeWeaverAware(编织者加载时间感知器)初始化
    4.冻结所有的bean定义，说明注册的bean定义将不被修改或者进一步的处理
    5.beanFactory.preInstantiateSingletons:实例化所有剩余的非延迟初始化单例
        1.获取容器中的所有beanNames，依次进行初始化和创建对象
            List beanNames = new ArrayList<>(this.beanDefinitionNames);
        2.遍历beanNames获取bean的定义信息:RootBeanDefinition
            RootBanDefinition bd = getMergedLocalBeanDefinition(beanName);
        3.如果bean不是抽象的，是单实例的，不是懒加载的，创建bean
            1.判断是否是FactoryBean:是否是实现FactoryBean接口的
                如果是，利用工厂方法创建bean
            2.不是工厂bean，利用getBean(beanName)创建对象
                getBean(beanName):ioc.getBean(beanName);
                    1.AbstractBeanFactory.doGetBean(beanName)
                    2.先获取缓存中保存的单实例bean，如果能获取到，说明bean之前被创建过(所有创建过的单实例bean都会被缓存起来)
                        private final Map<String, Object> singletonObjects = new ConcurrentHashMap<>(256);
                    3.缓存中获取不到，开始Bean的创建对象流程
                    4.标记当前bean为创建中，markBeanAsCreated(beanName)
                    5.获取bean的定义信息
                    6.获取当前bean依赖的其他bean，如果有按照getBean()把依赖的bean先创建出来
                    7.启动单实例bean的创建流程
                        1.createBean(beanName,mbd,args)
                        2.先让InstantiationAwareBeanPostProcessor[BeanPostProcessor]先拦截返回代理对象
                            Object bean = resolveBeforeInstantiation(beanName, mbdToUse);
                            先触发所有InstantiationAwareBeanPostProcessor的postProcessBeforeInstantiation(),
                            如果有返回值，调用所有beanPostProcessor的applyBeanPostProcessorsAfterInitialization()
                        3.如果InstantiationAwareBeanPostProcessor没有返回代理对象，调用doCreateBean()方法;
                        4.Object beanInstance = doCreateBean(beanName, mbdToUse, args);创建bean
                            1.createBeanInstance(beanName, mbd, args);**【创建bean实例】**
                                利用工厂方法或者对象的构造器创建出bean实例
                            2.applyMergedBeanDefinitionPostProcessors(mbd, beanType, beanName);
                                调用MergedBeanDefinitionPostProcessor的postProcessMergedBeanDefinition()方法;
                            3.populateBean(beanName, mbd, instanceWrapper);**【bean属性赋值】**
                                ===赋值之前===
                                1.检查是否是合成的bean，如果不是，拿到InstantiationAwareBeanPostProcessor类型的后置处理器
                                    执行postProcessAfterInstantiation();
                                2.拿到InstantiationAwareBeanPostProcessor类型的后置处理器
                                    执行postProcessProperties();
                                ===开始赋值===
                                3.applyPropertyValues(beanName, mbd, bw, pvs);应用bean属性的值，为属性利用setter方法等进行赋值
                            4.initializeBean(beanName, exposedObject, mbd):**【初始化bean】**
                                1.invokeAwareMethods(beanName,bean):**【执行xxxAware接口的方法】**
                                    BeanNameAware/BeanClassLoaderAware/BeanFactoryAware
                                2.applyBeanPostProcessorBeforeInitialization():**【执行后置处理器初始化之前的方法】**
                                    调用BeanPostProcessor.postProcessBeforeInitialization
                                3.invokeInitMethods(beanName, wrappedBean, mbd):**【执行初始化方法】**
                                    1.判断是否是initializingBean接口的实现,执行接口规定的初始化方法:afterPropertiesSet()
                                    2.如果不是，执行自定义的初始化方法：invokeCustomerInitMethod(beanName, bean, mbd)-反射执行
                                4.applyBeanPostProcessorAfterInitialization():**【执行后置处理器初始化之后的方法】**
                                    调用BeanPostProcessor.postProcessAfterInitialization
                            5.registerDisposableBeanIfNecessary(beanName, bean, mbd):注册bean的销毁方法
                        5.addSingleton(beanName, singletonObject);将创建的单实例bean加入缓存singletonObjects
                        ioc容器就是这些map用了保存单实例bean信息，环境信息
        4.所有bean都利用getBean创建完成后,检查所有的bean是否是SmartInitializationSingleton接口的，如果是的话，执行
        SmartInitializationSingleton.afterSingletonsInstantiated();
12.finishRefresh():完成BeanFactory的初始化创建工作，IOC容器就创建完成
    1.清除上下文级别的资源缓存（例如来自扫描的ASM元数据）
    2.initLifecycleProcessor():初始化生命周期有关的后置处理器:LifecycleProcessor
        可以实现LifecycleProcessor，会在BeanFactory进行到特定生命周期时调用
        默认从容器中找是否有名为lifecycleProcessor的组件，没有就new DefaultLifecycleProcessor()加入到容器中
    3.回调LifecycleProcessor的onRefresh()方法；拿到前面所有定义的生命周期处理器回调onRefresh()方法
    4.publishEvent(new ContextRefreshedEvent(this)):发布容器刷新完成事件
    5.LiveBeansView.registerApplicationContext(this):
 =====总结=====
1.Spring在启动的时候，会保存所有注册进来的bean的定义信息:BeanDefinition
    1.xml注册bean；
    2.使用注解方式注册：@Component,@Service,@Bean等
2.Spring容器会在合适的时机创建这些bean
    1.用到这个bean的时候创建：利用getBean()方法，创建好以后保存在容器中
    2.统一创建剩下所有bean的时候:finishBeanFactoryInitialization();
3.后置处理器:BeanPostProcessor
    1.每一个bean创建完成后，都会使用各种后置处理器进行处理，来增强bean的功能
        AutowiredAnnotationBeanPostProcessor来处理自动注入功能
    2.AnnotationAwareAspectJAutoProxyCreator来做AOP功能
    xxx
4.事件驱动模型:
    ApplicationListener:事件监听
    ApplicationEventMulticaster:事件派发器
    