package com.example.springaop.beanLifecycle.profile;


import com.example.springaop.beanLifecycle.bean.Black;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.EmbeddedValueResolverAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.util.StringValueResolver;

import javax.sql.DataSource;

/**
 * @Author: lsp
 * @Date: 2020/12/7 17:35
 * @Version 1.0
 * @Description:
 */
@Configuration
@Profile("test")
@PropertySource("classpath:application.properties")
public class ProfileTest implements EmbeddedValueResolverAware {

    private StringValueResolver stringValueResolver;
    @Value("${spring.datasource.username}")
    private String userName;

    private String driverClassName;

    @Profile("test")
    @Bean("testDataSource")
    public DataSource dataSourceTest(@Value("${spring.datasource.password}") String pwd) {
        HikariDataSource dataSource = new HikariDataSource();
        dataSource.setUsername(userName);
        dataSource.setPassword(pwd);
        dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/cym");
        dataSource.setDriverClassName(driverClassName);
        return dataSource;
    }

    @Profile("default")
    @Bean("devDataSource")
    public DataSource dataSourceDev(@Value("${spring.datasource.password}") String pwd) {
        HikariDataSource dataSource = new HikariDataSource();
        dataSource.setUsername(userName);
        dataSource.setPassword(pwd);
        dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/haoxun");
        dataSource.setDriverClassName(driverClassName);
        return dataSource;
    }

    @Profile("prod")
    @Bean("prodDataSource")
    public DataSource dataSourceProd(@Value("${spring.datasource.password}") String pwd) {
        HikariDataSource dataSource = new HikariDataSource();
        dataSource.setUsername(userName);
        dataSource.setPassword(pwd);
        dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/wxtc");
        dataSource.setDriverClassName(driverClassName);
        return dataSource;
    }

    @Bean("black1111")
    public Black black(){
        return new Black();
    }

    /**
     * Set the StringValueResolver to use for resolving embedded definition values.
     *
     * @param resolver
     */
    @Override
    public void setEmbeddedValueResolver(StringValueResolver resolver) {
        this.stringValueResolver = resolver;
        driverClassName = stringValueResolver.resolveStringValue("${spring.datasource.driver-class-name}");
    }
}
