package com.ruoyi.system.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.system.domain.SysUserInfo;
import com.ruoyi.system.service.ISysUserInfoService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 教职工信息Controller
 * 
 * @author ruoyi
 * @date 2024-10-10
 */
@RestController
@RequestMapping("/system/info")
public class SysUserInfoController extends BaseController
{
    @Autowired
    private ISysUserInfoService sysUserInfoService;

    /**
     * 查询教职工信息列表
     */
    @PreAuthorize("@ss.hasPermi('system:info:list')")
    @GetMapping("/list")
    public TableDataInfo list(SysUserInfo sysUserInfo)
    {
        startPage();
        List<SysUserInfo> list = sysUserInfoService.selectSysUserInfoList(sysUserInfo);
        return getDataTable(list);
    }

    /**
     * 导出教职工信息列表
     */
    @PreAuthorize("@ss.hasPermi('system:info:export')")
    @Log(title = "教职工信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, SysUserInfo sysUserInfo)
    {
        List<SysUserInfo> list = sysUserInfoService.selectSysUserInfoList(sysUserInfo);
        ExcelUtil<SysUserInfo> util = new ExcelUtil<SysUserInfo>(SysUserInfo.class);
        util.exportExcel(response, list, "教职工信息数据");
    }

    /**
     * 获取教职工信息详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:info:query')")
    @GetMapping(value = "/{dept}")
    public AjaxResult getInfo(@PathVariable("dept") String dept)
    {
        return success(sysUserInfoService.selectSysUserInfoByDept(dept));
    }

    /**
     * 新增教职工信息
     */
    @PreAuthorize("@ss.hasPermi('system:info:add')")
    @Log(title = "教职工信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody SysUserInfo sysUserInfo)
    {
        return toAjax(sysUserInfoService.insertSysUserInfo(sysUserInfo));
    }

    /**
     * 修改教职工信息
     */
    @PreAuthorize("@ss.hasPermi('system:info:edit')")
    @Log(title = "教职工信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody SysUserInfo sysUserInfo)
    {
        return toAjax(sysUserInfoService.updateSysUserInfo(sysUserInfo));
    }

    /**
     * 删除教职工信息
     */
    @PreAuthorize("@ss.hasPermi('system:info:remove')")
    @Log(title = "教职工信息", businessType = BusinessType.DELETE)
	@DeleteMapping("/{depts}")
    public AjaxResult remove(@PathVariable String[] depts)
    {
        return toAjax(sysUserInfoService.deleteSysUserInfoByDepts(depts));
    }
}
