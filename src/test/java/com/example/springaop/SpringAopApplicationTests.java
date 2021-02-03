package com.example.springaop;

import com.example.springaop.tx.entity.OrgRole;
import com.example.springaop.tx.service.OrgRoleService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Date;

@SpringBootTest
class SpringAopApplicationTests {

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
        //AnnotationConfigApplicationContext annotationConfigApplicationContext=new AnnotationConfigApplicationContext(Config.class);

        //OrgRoleService orgRoleService = annotationConfigApplicationContext.getBean(OrgRoleService.class);
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

}
