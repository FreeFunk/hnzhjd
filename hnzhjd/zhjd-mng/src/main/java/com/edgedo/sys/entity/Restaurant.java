package com.edgedo.sys.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.IdType;

@TableName("restaurant")
public class Restaurant implements Serializable{
	
		
	/**
	 * 属性描述:id
	 */
	@TableId(value="id",type = IdType.AUTO)
	java.lang.Integer id;
	
	/**
	 * 属性描述:组织id
	 */
	@TableField(value="org_id",exist=true)
	java.lang.Integer orgId;
	
	/**
	 * 属性描述:场所名称。“XXX餐厅”之类
	 */
	@TableField(value="name",exist=true)
	java.lang.String name;
	
	/**
	 * 属性描述:电话
	 */
	@TableField(value="telephone",exist=true)
	java.lang.String telephone;
	
	/**
	 * 属性描述:地址
	 */
	@TableField(value="address",exist=true)
	java.lang.String address;
	
	/**
	 * 属性描述:经纬度 1000.333,39.111
	 */
	@TableField(value="geo",exist=true)
	java.lang.String geo;
	
	/**
	 * 属性描述:备注，支持多个，可考虑json，与其他保持一致
	 */
	@TableField(value="remark",exist=true)
	java.lang.String remark;
	/**
	 * 楼层
	 */
	@TableField(value="floor_num",exist=true)
	Integer  floorNum;
	/**
	 * 属性描述:容纳人数
	 */
	@TableField(value="seating_capacity",exist=true)
	Integer seatingCapacity;
	/**
	 * 包间的名字
	 */
	@TableField(value="room_name",exist=true)
	java.lang.String roomName;
	/**
	 * 包间的名字
	 */
	@TableField(value="res_photo",exist=true)
	java.lang.String resPhoto;

	/**
	 * 属性描述:设置为默认
	 */
	@TableField(value="as_default",exist=true)
	java.lang.Boolean asDefault;

	/**
	 * 属性描述:0=正常 1=删除
	 */
	@TableField(value="deleted",exist=true)
	java.lang.Boolean deleted;

	public String getResPhoto() {
		return resPhoto;
	}

	public void setResPhoto(String resPhoto) {
		this.resPhoto = resPhoto;
	}

	public Integer getFloorNum() {
		return floorNum;
	}

	public void setFloorNum(Integer floorNum) {
		this.floorNum = floorNum;
	}

	public Integer getSeatingCapacity() {
		return seatingCapacity;
	}

	public void setSeatingCapacity(Integer seatingCapacity) {
		this.seatingCapacity = seatingCapacity;
	}

	public String getRoomName() {
		return roomName;
	}

	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}

	public Boolean getDeleted() {
		return deleted;
	}

	public void setDeleted(Boolean deleted) {
		this.deleted = deleted;
	}

	public java.lang.Integer getId(){
		return this.id;
	}
	
	public void setId(java.lang.Integer id){
		this.id=id;
	}
	
	
	public java.lang.Integer getOrgId(){
		return this.orgId;
	}
	
	public void setOrgId(java.lang.Integer orgId){
		this.orgId=orgId;
	}
	
	
	public java.lang.String getName(){
		return this.name;
	}
	
	public void setName(java.lang.String name){
		this.name=name;
	}
	
	
	public java.lang.String getTelephone(){
		return this.telephone;
	}
	
	public void setTelephone(java.lang.String telephone){
		this.telephone=telephone;
	}
	
	
	public java.lang.String getAddress(){
		return this.address;
	}
	
	public void setAddress(java.lang.String address){
		this.address=address;
	}
	
	
	public java.lang.String getGeo(){
		return this.geo;
	}
	
	public void setGeo(java.lang.String geo){
		this.geo=geo;
	}
	
	
	public java.lang.String getRemark(){
		return this.remark;
	}
	
	public void setRemark(java.lang.String remark){
		this.remark=remark;
	}
	
	
	public java.lang.Boolean getAsDefault(){
		return this.asDefault;
	}
	
	public void setAsDefault(java.lang.Boolean asDefault){
		this.asDefault=asDefault;
	}
	
	
	
	
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
			sb.append(", id=").append(id);			
			sb.append(", orgId=").append(orgId);			
			sb.append(", name=").append(name);			
			sb.append(", telephone=").append(telephone);			
			sb.append(", address=").append(address);			
			sb.append(", geo=").append(geo);			
			sb.append(", remark=").append(remark);			
			sb.append(", asDefault=").append(asDefault);			
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
        Restaurant other = (Restaurant) that;
        boolean flag = true;
        return  flag
        		&&(this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))		
				        		&&(this.getOrgId() == null ? other.getId() == null : this.getOrgId().equals(other.getOrgId()))		
				        		&&(this.getName() == null ? other.getId() == null : this.getName().equals(other.getName()))		
				        		&&(this.getTelephone() == null ? other.getId() == null : this.getTelephone().equals(other.getTelephone()))		
				        		&&(this.getAddress() == null ? other.getId() == null : this.getAddress().equals(other.getAddress()))		
				        		&&(this.getGeo() == null ? other.getId() == null : this.getGeo().equals(other.getGeo()))		
				        		&&(this.getRemark() == null ? other.getId() == null : this.getRemark().equals(other.getRemark()))		
				        		&&(this.getAsDefault() == null ? other.getId() == null : this.getAsDefault().equals(other.getAsDefault()))		
				;
    }

  
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());		
		        result = prime * result + ((getOrgId() == null) ? 0 : getOrgId().hashCode());		
		        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());		
		        result = prime * result + ((getTelephone() == null) ? 0 : getTelephone().hashCode());		
		        result = prime * result + ((getAddress() == null) ? 0 : getAddress().hashCode());		
		        result = prime * result + ((getGeo() == null) ? 0 : getGeo().hashCode());		
		        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());		
		        result = prime * result + ((getAsDefault() == null) ? 0 : getAsDefault().hashCode());		
		;
        return result;
    }

}
