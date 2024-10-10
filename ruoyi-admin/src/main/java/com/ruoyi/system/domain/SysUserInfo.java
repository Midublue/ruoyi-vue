package com.ruoyi.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 教职工信息对象 sys_user_info
 * 
 * @author ruoyi
 * @date 2024-10-10
 */
public class SysUserInfo extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 部门 */
    @Excel(name = "部门")
    private String dept;

    /** 工号 */
    @Excel(name = "工号")
    private String ghid;

    /** 姓名 */
    @Excel(name = "姓名")
    private String name;

    /** 入职日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "入职日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date entryDate;

    /** 入职照片 */
    @Excel(name = "入职照片")
    private String image;

    /** 在职状态 */
    @Excel(name = "在职状态")
    private String status;

    /** 状态 */
    @Excel(name = "状态")
    private String type;

    public void setDept(String dept) 
    {
        this.dept = dept;
    }

    public String getDept() 
    {
        return dept;
    }
    public void setGhid(String ghid) 
    {
        this.ghid = ghid;
    }

    public String getGhid() 
    {
        return ghid;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public void setEntryDate(Date entryDate) 
    {
        this.entryDate = entryDate;
    }

    public Date getEntryDate() 
    {
        return entryDate;
    }
    public void setImage(String image) 
    {
        this.image = image;
    }

    public String getImage() 
    {
        return image;
    }
    public void setStatus(String status) 
    {
        this.status = status;
    }

    public String getStatus() 
    {
        return status;
    }
    public void setType(String type) 
    {
        this.type = type;
    }

    public String getType() 
    {
        return type;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("dept", getDept())
            .append("ghid", getGhid())
            .append("name", getName())
            .append("entryDate", getEntryDate())
            .append("image", getImage())
            .append("status", getStatus())
            .append("type", getType())
            .toString();
    }
}
