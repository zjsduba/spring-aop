package com.example.springaop;

import com.example.springaop.tx.entity.OrgRole;
import com.example.springaop.tx.service.OrgRoleService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.Date;

@SpringBootTest
class SpringAopApplicationTests {

    @Resource
    ApplicationContext applicationContext;

    @Autowired
    OrgRoleService orgRoleService;
    @Test
    void contextLoads() throws Exception{
        AnnotationConfigApplicationContext annotationConfigApplicationContext=new AnnotationConfigApplicationContext(Config.class);

        Math bean = annotationConfigApplicationContext.getBean(Math.class);
        bean.add(1,1);
    }

    @Test
    void testTx() throws Exception{
        OrgRole orgRole=new OrgRole();
        orgRole.setName_("1");
        orgRole.setAlias_("2");
        orgRole.setEnabled_(1);
        orgRole.setDescription("2222");
        orgRole.setCreateBy_("1111");
        orgRole.setUpdateBy_("2222");
        orgRole.setTypeId_("111");
        orgRole.setTypeName_("222");
        orgRole.setCreateTime_(new Date());
        orgRole.setUpdateTime_(new Date());
        orgRoleService.insert(orgRole);
    }

    @Test
    void testImport(){
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        Arrays.stream(beanDefinitionNames).filter(s -> !s.contains("org")||!s.contains("spring")).forEach(s -> System.out.println(s));
        Object bean =applicationContext.getBean("com.example.springbatch.importBean.ImportTest");
        System.out.println("导入测试"+bean);
    }
    @Test
    void testImportSelector(){
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        Arrays.stream(beanDefinitionNames).filter(s -> !s.contains("org")||!s.contains("spring")).forEach(s -> System.out.println(s));
        Object bean =applicationContext.getBean("com.example.springbatch.bean.Blue");
        System.out.println("导入测试"+bean);
    }
    @Test
    void testImportBeanDefinitionRegistrar(){
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        Arrays.stream(beanDefinitionNames).filter(s -> !s.contains("org")||!s.contains("spring")).forEach(s -> System.out.println(s));
        Object bean =applicationContext.getBean("red");
        System.out.println("导入测试"+bean);
    }
    @Test
    void testFactoryBean(String name,String size) {
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        Arrays.stream(beanDefinitionNames).filter(s -> !s.contains("org")||!s.contains("spring")).forEach(s -> System.out.println(s));
        //获取factorybean生成的bean
        Object importColor = applicationContext.getBean("colorFactoryBean");
        //获取容器中factorybean本身
        Object bean = applicationContext.getBean("&colorFactoryBean");
        System.out.println("获取factorybean生成的bean:"+importColor.getClass());
        System.out.println("获取容器中factorybean本身"+bean.getClass());
    }
    @Test
    void testLifecycle(){

    }

}
