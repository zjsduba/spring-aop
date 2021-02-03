1.给容器中增加组件
    1.包扫描+组件标注注解：@Controller/@Service/@Mapper/@Repository/@Component
    2.@Bean[导入的第三包里面的组件]，搭配@Configuration使用
    3.@Import[快速给容器导入一个组件]
        1.@Import 要导入到容器中的组件，容器会自动注册这个组件，id为全类名
        2.ImportSelector:返回需要导入的组件的全类名数组
        3.ImportBeanDefinitionRegistrar:可手动注册bean到容器中
    4.使用spring的factoryBean(工厂bean)
        1.通过beanid默认取到的是工厂bean调用getObject创建的对象，可通过isSingleton设置是否单例对象
        2.要获取工厂bean本身，需要在id前面加一个&标识
2.bean的生命周期
    1.容器管理bean的生命周期
           自定义初始化和销毁方法，容器在bean进行到当前生命周期的时候调用自定义的初始化方法和销毁方法
    2.构造
      对象创建
            单实例：容器启动的时候创建对象
            多实例：每次获取的时候创建对象
    3.初始化
        1.xml指定 init-method
        2.@bean注解内指定init-method
        3.bean实现InitializingBean，实现afterPropertiesSet()方法
        4.@PostConstruct,在bean创建完成并且属性赋值完成后来执行初始化方法
        5.bean的后置处理器beanPostProcessor（在bean初始化前后进行一些处理工作）
        postProcessBeforeInitialization()，在初始化之前调用
        postProcessAfterInitialization()，在初始化之后调用
        备注：执行顺序：构造方法construct->postProcessBeforeInitialization->
        PostConstruct->afterPropertiesSet->init-method->postProcessAfterInitialization
    4.销毁
        1.xml指定 destroy-method
        2.@bean注解内指定destroy-method：单实例的bean容器销毁的时候执行，多实例的bean不执行销毁方法
        3.bean实现DisposableBean，实现destroy方法
        4.@PreDestroy，在容器销毁bean之前通知我们进行清理工作
        
        备注：执行顺序PreDestroy->destroy->destroy-method
        
3.属性赋值
    1.@Value注解
        1.基础数值
        2.使用SpEL表达式:#{}
        3.使用${},读取配置文件,配合PropertySource导入外部配置文件
4.自动装配--AutowiredAnnotationBeanPostProcessor实现解析
    1.Spring利用依赖注入(DI),完成对IOC容器中各个组件的依赖关系赋值
        1.@AutoWired 自动注入 byType --spring定义的：构造器/方法/参数/属性
            1.默认优先按照类型去容器中找对应的组件applicationContext.getBean(BookService.class)，找到就赋值
            2.如果找到多个相同类型的组件，在将属性的名称作为组件的id去容器中查找applicationContext.getBean("bookController")
            3.@Qualifier("bookService2") 使用Qualifier指定需要装配的组件的id，而不是使用属性名
            4.自动装配默认一定要将属性赋值，没有就会报错noSuchBean;可以使用AutoWired的required=false不进行赋值
            5.@primary，默认让Spring自动装配的时候，默认使用首选的bean;也可以继续使用@Qualifier指定需要装配的bean的名字
               优先级：@Qualifier，@primary，@AutoWired
            6.标注在方法上：spring容器创建当前对象，就会调用方法，完成赋值，方法使用的参数，自定义类型的值从IOC容器中获取
                @bean标注的方法创建对象的时候，方法参数的值从容器中获取[@Bean+方法参数]，默认不写@AutoWired，效果一样
            7.标注在构造器上：默认加在IOC容器中的组件，在容器启动时会调用无参构造器，在进行初始化操作；
                使用有参构造器时，构造器要用的组件，都是从容器中获取，如果组件只有一个有参构造器，有参构造器的@AutoWired可以省略，参数位置的组件还是自动从容器获取
            8.标注在参数上：
        2.@Resouce[java规范：JSR250], byName
            可以和@AutoWired一样实现自动装配功能，默认按照组件名称自动装配，没有支持@primary的功能，也没有支持required=false的功能
        3.@Inject注解[java规范：JSR330]
            需要导入javax.inject的包，和AutoWired的功能一样，没有required=false的功能
5.自定义组件想要使用spring容器底层的一些组件，(ApplicationContext,beanFactory)
     实现xxxAware接口，在创建对象的时候，会调用接口规定的方法注入相关组件，把spring底层一些组件注入到自定义的bean中
     xxxAware使用xxxAwareProcessor
6.@Profile
    1.spring为我们提供的可以根据当前环境，动态激活和切换一系列组件的功能
    2.开发环境/测试环境/生产环境
    3.指定组件在那个环境的情况下才能被注册到容器中，不指定，任何环境下都能注册这个bean
    4.加了环境标识的bean，只有这个环境被激活的时候才能被注册到容器中，默认是default
    5.设置环境
        1.使用命令行动态参数
            -Dspring.profiles.active=test
        2.写在配置类上，只有是指定的环境的时候，整个配置类里面的所有配置才会生效
        3.没有标注环境标识的bean在任何环境下都是加载的
        

