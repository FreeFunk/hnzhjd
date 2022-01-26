package com.edgedo.sys.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.IdType;

@TableName("user")
public class User implements Serializable{
	
		
	/**
	 * 属性描述:id
	 */
	@TableId(value="id",type = IdType.AUTO)
	java.lang.Integer id;
	
	/**
	 * 属性描述:姓名
	 */
	@TableField(value="name",exist=true)
	java.lang.String name;
	
	/**
	 * 属性描述:性别
	 */
	@TableField(value="gender",exist=true)
	Integer gender;
	
	/**
	 * 属性描述:手机
	 */
	@TableField(value="telephone",exist=true)
	java.lang.String telephone;
	
	/**
	 * 属性描述:系统管理员 / 组织管理员 / 普通用户
	 */
	@TableField(value="role_type",exist=true)
	Integer roleType;
	
	/**
	 * 属性描述:组织id
	 */
	@TableField(value="org_id",exist=true)
	java.lang.Integer orgId;
	
	/**
	 * 属性描述:民族
	 */
	@TableField(value="nation",exist=true)
	java.lang.String nation;
	
	/**
	 * 属性描述:职称 以 ,分割
	 */
	@TableField(value="job_title",exist=true)
	java.lang.String jobTitle;
	
	/**
	 * 属性描述:邮箱
	 */
	@TableField(value="email",exist=true)
	java.lang.String email;
	
	/**
	 * 属性描述:备注
	 */
	@TableField(value="remark",exist=true)
	java.lang.String remark;
	
	/**
	 * 属性描述:微信id
	 */
	@TableField(value="wexin_id",exist=true)
	java.lang.String wexinId;
	
	/**
	 * 属性描述:微信token
	 */
	@TableField(value="wexin_token",exist=true)
	java.lang.String wexinToken;
	
	/**
	 * 属性描述:账号
	 */
	@TableField(value="account",exist=true)
	java.lang.String account;
	
	/**
	 * 属性描述:密码
	 */
	@TableField(value="password",exist=true)
	java.lang.String password;
	
	/**
	 * 属性描述:删除状态
	 */
	@TableField(value="deleted",exist=true)
	java.lang.Boolean deleted;
	
	/**
	 * 属性描述:portrait
	 */
	@TableField(value="portrait",exist=true)
	java.lang.String portrait;
	
	
	
	
	
	
	public java.lang.Integer getId(){
		return this.id;
	}
	
	public void setId(java.lang.Integer id){
		this.id=id;
	}
	
	
	public java.lang.String getName(){
		return this.name;
	}
	
	public void setName(java.lang.String name){
		this.name=name;
	}
	
	
	public Integer getGender(){
		return this.gender;
	}
	
	public void setGender(Integer gender){
		this.gender=gender;
	}
	
	
	public java.lang.String getTelephone(){
		return this.telephone;
	}
	
	public void setTelephone(java.lang.String telephone){
		this.telephone=telephone;
	}
	
	
	public Integer getRoleType(){
		return this.roleType;
	}
	
	public void setRoleType(Integer roleType){
		this.roleType=roleType;
	}
	
	
	public java.lang.Integer getOrgId(){
		return this.orgId;
	}
	
	public void setOrgId(java.lang.Integer orgId){
		this.orgId=orgId;
	}
	
	
	public java.lang.String getNation(){
		return this.nation;
	}
	
	public void setNation(java.lang.String nation){
		this.nation=nation;
	}
	
	
	public java.lang.String getJobTitle(){
		return this.jobTitle;
	}
	
	public void setJobTitle(java.lang.String jobTitle){
		this.jobTitle=jobTitle;
	}
	
	
	public java.lang.String getEmail(){
		return this.email;
	}
	
	public void setEmail(java.lang.String email){
		this.email=email;
	}
	
	
	public java.lang.String getRemark(){
		return this.remark;
	}
	
	public void setRemark(java.lang.String remark){
		this.remark=remark;
	}
	
	
	public java.lang.String getWexinId(){
		return this.wexinId;
	}
	
	public void setWexinId(java.lang.String wexinId){
		this.wexinId=wexinId;
	}
	
	
	public java.lang.String getWexinToken(){
		return this.wexinToken;
	}
	
	public void setWexinToken(java.lang.String wexinToken){
		this.wexinToken=wexinToken;
	}
	
	
	public java.lang.String getAccount(){
		return this.account;
	}
	
	public void setAccount(java.lang.String account){
		this.account=account;
	}
	
	
	public java.lang.String getPassword(){
		return this.password;
	}
	
	public void setPassword(java.lang.String password){
		this.password=password;
	}
	
	
	public java.lang.Boolean getDeleted(){
		return this.deleted;
	}
	
	public void setDeleted(java.lang.Boolean deleted){
		this.deleted=deleted;
	}
	
	
	public java.lang.String getPortrait(){
		return this.portrait;
	}
	
	public void setPortrait(java.lang.String portrait){
		this.portrait=portrait;
	}
	
	
	
	
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
			sb.append(", id=").append(id);			
			sb.append(", name=").append(name);			
			sb.append(", gender=").append(gender);			
			sb.append(", telephone=").append(telephone);			
			sb.append(", roleType=").append(roleType);			
			sb.append(", orgId=").append(orgId);			
			sb.append(", nation=").append(nation);			
			sb.append(", jobTitle=").append(jobTitle);			
			sb.append(", email=").append(email);			
			sb.append(", remark=").append(remark);			
			sb.append(", wexinId=").append(wexinId);			
			sb.append(", wexinToken=").append(wexinToken);			
			sb.append(", account=").append(account);			
			sb.append(", password=").append(password);			
			sb.append(", deleted=").append(deleted);			
			sb.append(", portrait=").append(portrait);			
        sb.append("]");
        return sb.toString();
    }

   
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        User other = (User) that;
        boolean flag = true;
        return  flag
        		&&(this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))		
				        		&&(this.getName() == null ? other.getId() == null : this.getName().equals(other.getName()))		
				        		&&(this.getGender() == null ? other.getId() == null : this.getGender().equals(other.getGender()))		
				        		&&(this.getTelephone() == null ? other.getId() == null : this.getTelephone().equals(other.getTelephone()))		
				        		&&(this.getRoleType() == null ? other.getId() == null : this.getRoleType().equals(other.getRoleType()))		
				        		&&(this.getOrgId() == null ? other.getId() == null : this.getOrgId().equals(other.getOrgId()))		
				        		&&(this.getNation() == null ? other.getId() == null : this.getNation().equals(other.getNation()))		
				        		&&(this.getJobTitle() == null ? other.getId() == null : this.getJobTitle().equals(other.getJobTitle()))		
				        		&&(this.getEmail() == null ? other.getId() == null : this.getEmail().equals(other.getEmail()))		
				        		&&(this.getRemark() == null ? other.getId() == null : this.getRemark().equals(other.getRemark()))		
				        		&&(this.getWexinId() == null ? other.getId() == null : this.getWexinId().equals(other.getWexinId()))		
				        		&&(this.getWexinToken() == null ? other.getId() == null : this.getWexinToken().equals(other.getWexinToken()))		
				        		&&(this.getAccount() == null ? other.getId() == null : this.getAccount().equals(other.getAccount()))		
				        		&&(this.getPassword() == null ? other.getId() == null : this.getPassword().equals(other.getPassword()))		
				        		&&(this.getDeleted() == null ? other.getId() == null : this.getDeleted().equals(other.getDeleted()))		
				        		&&(this.getPortrait() == null ? other.getId() == null : this.getPortrait().equals(other.getPortrait()))		
				;
    }

  
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());		
		        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());		
		        result = prime * result + ((getGender() == null) ? 0 : getGender().hashCode());		
		        result = prime * result + ((getTelephone() == null) ? 0 : getTelephone().hashCode());		
		        result = prime * result + ((getRoleType() == null) ? 0 : getRoleType().hashCode());		
		        result = prime * result + ((getOrgId() == null) ? 0 : getOrgId().hashCode());		
		        result = prime * result + ((getNation() == null) ? 0 : getNation().hashCode());		
		        result = prime * result + ((getJobTitle() == null) ? 0 : getJobTitle().hashCode());		
		        result = prime * result + ((getEmail() == null) ? 0 : getEmail().hashCode());		
		        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());		
		        result = prime * result + ((getWexinId() == null) ? 0 : getWexinId().hashCode());		
		        result = prime * result + ((getWexinToken() == null) ? 0 : getWexinToken().hashCode());		
		        result = prime * result + ((getAccount() == null) ? 0 : getAccount().hashCode());		
		        result = prime * result + ((getPassword() == null) ? 0 : getPassword().hashCode());		
		        result = prime * result + ((getDeleted() == null) ? 0 : getDeleted().hashCode());		
		        result = prime * result + ((getPortrait() == null) ? 0 : getPortrait().hashCode());		
		;
        return result;
    }

}
