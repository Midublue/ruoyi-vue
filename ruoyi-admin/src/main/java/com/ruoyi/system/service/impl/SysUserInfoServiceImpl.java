package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.SysUserInfoMapper;
import com.ruoyi.system.domain.SysUserInfo;
import com.ruoyi.system.service.ISysUserInfoService;

/**
 * 教职工信息Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-10-10
 */
@Service
public class SysUserInfoServiceImpl implements ISysUserInfoService 
{
    @Autowired
    private SysUserInfoMapper sysUserInfoMapper;

    /**
     * 查询教职工信息
     * 
     * @param dept 教职工信息主键
     * @return 教职工信息
     */
    @Override
    public SysUserInfo selectSysUserInfoByDept(String dept)
    {
        return sysUserInfoMapper.selectSysUserInfoByDept(dept);
    }

    /**
     * 查询教职工信息列表
     * 
     * @param sysUserInfo 教职工信息
     * @return 教职工信息
     */
    @Override
    public List<SysUserInfo> selectSysUserInfoList(SysUserInfo sysUserInfo)
    {
        return sysUserInfoMapper.selectSysUserInfoList(sysUserInfo);
    }

    /**
     * 新增教职工信息
     * 
     * @param sysUserInfo 教职工信息
     * @return 结果
     */
    @Override
    public int insertSysUserInfo(SysUserInfo sysUserInfo)
    {
        return sysUserInfoMapper.insertSysUserInfo(sysUserInfo);
    }

    /**
     * 修改教职工信息
     * 
     * @param sysUserInfo 教职工信息
     * @return 结果
     */
    @Override
    public int updateSysUserInfo(SysUserInfo sysUserInfo)
    {
        return sysUserInfoMapper.updateSysUserInfo(sysUserInfo);
    }

    /**
     * 批量删除教职工信息
     * 
     * @param depts 需要删除的教职工信息主键
     * @return 结果
     */
    @Override
    public int deleteSysUserInfoByDepts(String[] depts)
    {
        return sysUserInfoMapper.deleteSysUserInfoByDepts(depts);
    }

    /**
     * 删除教职工信息信息
     * 
     * @param dept 教职工信息主键
     * @return 结果
     */
    @Override
    public int deleteSysUserInfoByDept(String dept)
    {
        return sysUserInfoMapper.deleteSysUserInfoByDept(dept);
    }
}
