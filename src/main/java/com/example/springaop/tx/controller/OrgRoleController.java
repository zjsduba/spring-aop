package com.example.springaop.tx.controller;

import com.example.springaop.tx.entity.OrgRole;
import com.example.springaop.tx.service.OrgRoleService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 角色管理(OrgRole)表控制层
 *
 * @author lsp
 * @since 2021-02-01 14:06:14
 */
@RestController
@RequestMapping("orgRole")
public class OrgRoleController {
    /**
     * 服务对象
     */
    @Resource
    private OrgRoleService orgRoleService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public OrgRole selectOne(String id) {
        return this.orgRoleService.queryById(id);
    }

}