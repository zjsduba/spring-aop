package com.example.springaop.tx;

import com.zaxxer.hikari.HikariDataSource;
import org.springframework.context.annotation.AnnotationConfigUtils;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.AnnotationAttributes;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

/**
 * 声明式事务
 *
 * 环境搭建
 *
 * 1.导入相关依赖
 *      数据源，数据库驱动，spring-jdbc模块
 * 2.配置数据源，jdbcTemplate（spring提供的简化数据库操作的工具）操作数据
 * 3.给方法上标注@Transactional 表明当前方法是一个事务方法
 * 4.@EnableTransactionManagement 开启基于注解的事务管理功能
 * 5.配置事务管理器控制事务
 *
 * 原理
 *  1.@EnableTransactionManagement
 *  利用TransactionManagementConfigurationSelector给容器中导入2个组件
 *      AutoProxyRegistrar
 *      ProxyTransactionManagementConfiguration
 *  2.AutoProxyRegistrar给容器中注册InfrastructureAdvisorAutoProxyCreator组件
 *      InfrastructureAdvisorAutoProxyCreator：利用后置处理器机制在对象创建以后，包装对象，返回一个代理对象（增强器），代理对象执行方法利用拦截器链进行调用
 *  3.ProxyTransactionManagementConfiguration
 *      给容器中注册事务增强器:
 *          1.事务增强器要用事务注解的信息：AnnotationTransactionAttributeSource解析事务注解
 *          2.给容器中注册事务拦截器：transactionInterceptor:保存事务属性信息，事务管理器
 *              他是一个MethodInterceptor,在目标方法执行的时候：执行拦截器链
 *                  1.先获取事务相关的属性
 *                  2.在获取PlatformTransactionManager:如果事先没有添加指定任何TransactionManager，最终会从IOC容器中按照类型获取一个PlatformTransactionManager
 *                  3.执行目标方法，
 *                      如果异常，获取到事务管理器，利用事务管理回滚操作；
 *                      如果正常，利用事务管理器提交事务
 *
 *
 *
 */
@Configuration
@EnableTransactionManagement
public class TxConfig {

    //@Bean
    public DataSource dataSource(){
        return new HikariDataSource();
    }

    //@Bean
    public JdbcTemplate jdbcTemplate(){
        //spring会对@Configuration类会特殊处理，给容器中加组件的方法，多次调用都是从容器中找组件
        JdbcTemplate jdbcTemplate=new JdbcTemplate(dataSource());

        return jdbcTemplate;
    }
}
