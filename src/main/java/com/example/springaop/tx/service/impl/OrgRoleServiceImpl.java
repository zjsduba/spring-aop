package com.example.springaop.tx.service.impl;

import com.example.springaop.tx.entity.OrgRole;
import com.example.springaop.tx.dao.OrgRoleDao;
import com.example.springaop.tx.service.OrgRoleService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * 角色管理(OrgRole)表服务实现类
 *
 * @author lsp
 * @since 2021-02-01 14:06:14
 */
@Service("orgRoleService")
public class OrgRoleServiceImpl implements OrgRoleService {
    @Resource
    private OrgRoleDao orgRoleDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id_ 主键
     * @return 实例对象
     */
    @Override
    public OrgRole queryById(String id_) {
        return this.orgRoleDao.queryById(id_);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<OrgRole> queryAllByLimit(int offset, int limit) {
        return this.orgRoleDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param orgRole 实例对象
     * @return 实例对象
     */
    @Override
    @Transactional(propagation= Propagation.REQUIRED,rollbackFor = Exception.class)
    public OrgRole insert(OrgRole orgRole) throws Exception{
        this.orgRoleDao.insert(orgRole);
        throw new Exception("111");
        //return orgRole;
    }

    /**
     * 修改数据
     *
     * @param orgRole 实例对象
     * @return 实例对象
     */
    @Override
    public OrgRole update(OrgRole orgRole) {
        this.orgRoleDao.update(orgRole);
        return this.queryById(orgRole.getId_());
    }

    /**
     * 通过主键删除数据
     *
     * @param id_ 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String id_) {
        return this.orgRoleDao.deleteById(id_) > 0;
    }
}