package com.example.springaop.tx.dao;

import com.example.springaop.tx.entity.OrgRole;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 角色管理(OrgRole)表数据库访问层
 *
 * @author lsp
 * @since 2021-02-01 14:06:13
 */
public interface OrgRoleDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id_ 主键
     * @return 实例对象
     */
    OrgRole queryById(String id_);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<OrgRole> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param orgRole 实例对象
     * @return 对象列表
     */
    List<OrgRole> queryAll(OrgRole orgRole);

    /**
     * 新增数据
     *
     * @param orgRole 实例对象
     * @return 影响行数
     */
    int insert(OrgRole orgRole);

    /**
     * 修改数据
     *
     * @param orgRole 实例对象
     * @return 影响行数
     */
    int update(OrgRole orgRole);

    /**
     * 通过主键删除数据
     *
     * @param id_ 主键
     * @return 影响行数
     */
    int deleteById(String id_);

}