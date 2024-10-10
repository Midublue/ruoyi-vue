package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.SysUserInfo;

/**
 * 教职工信息Mapper接口
 * 
 * @author ruoyi
 * @date 2024-10-10
 */
public interface SysUserInfoMapper 
{
    /**
     * 查询教职工信息
     * 
     * @param dept 教职工信息主键
     * @return 教职工信息
     */
    public SysUserInfo selectSysUserInfoByDept(String dept);

    /**
     * 查询教职工信息列表
     * 
     * @param sysUserInfo 教职工信息
     * @return 教职工信息集合
     */
    public List<SysUserInfo> selectSysUserInfoList(SysUserInfo sysUserInfo);

    /**
     * 新增教职工信息
     * 
     * @param sysUserInfo 教职工信息
     * @return 结果
     */
    public int insertSysUserInfo(SysUserInfo sysUserInfo);

    /**
     * 修改教职工信息
     * 
     * @param sysUserInfo 教职工信息
     * @return 结果
     */
    public int updateSysUserInfo(SysUserInfo sysUserInfo);

    /**
     * 删除教职工信息
     * 
     * @param dept 教职工信息主键
     * @return 结果
     */
    public int deleteSysUserInfoByDept(String dept);

    /**
     * 批量删除教职工信息
     * 
     * @param depts 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteSysUserInfoByDepts(String[] depts);
}
