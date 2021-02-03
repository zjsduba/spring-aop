package com.example.springaop.tx.service;

import com.example.springaop.tx.entity.OrgRole;
import java.util.List;

/**
 * 角色管理(OrgRole)表服务接口
 *
 * @author lsp
 * @since 2021-02-01 14:06:13
 */
public interface OrgRoleService {

    /**
     * 通过ID查询单条数据
     *
     * @param id_ 主键
     * @return 实例对象
     */
    OrgRole queryById(String id_);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<OrgRole> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param orgRole 实例对象
     * @return 实例对象
     */
    OrgRole insert(OrgRole orgRole) throws Exception;

    /**
     * 修改数据
     *
     * @param orgRole 实例对象
     * @return 实例对象
     */
    OrgRole update(OrgRole orgRole);

    /**
     * 通过主键删除数据
     *
     * @param id_ 主键
     * @return 是否成功
     */
    boolean deleteById(String id_);

}