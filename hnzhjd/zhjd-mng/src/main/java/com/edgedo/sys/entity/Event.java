package com.edgedo.sys.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.IdType;

@TableName("event")
public class Event implements Serializable{
	
		
	/**
	 * 属性描述:id
	 */
	@TableId(value="id",type = IdType.AUTO)
	java.lang.Integer id;
	
	/**
	 * 属性描述:接待访问id
	 */
	@TableField(value="reception_id",exist=true)
	java.lang.Integer receptionId;
	
	/**
	 * 属性描述:接待安排活动信息、活动主题
	 */
	@TableField(value="name",exist=true)
	java.lang.String name;
	
	/**
	 * 属性描述:开始时间--主要时间参考，arrange亦有时间安排，作为arrange的更具体的时间，包括同一个event下，不同的arrange，可能起始和终止时间略有不同
	 */
	@TableField(value="start_time",exist=true)
	java.util.Date startTime;
	
	/**
	 * 属性描述:结束时间--可为空，不重要
	 */
	@TableField(value="end_time",exist=true)
	java.util.Date endTime;
	
	/**
	 * 属性描述:0=正常，1=删除
	 */
	@TableField(value="deleted",exist=true)
	java.lang.Boolean deleted;
	
	/**
	 * 属性描述:细节信息，活动的说明信息
	 */
	@TableField(value="details",exist=true)
	java.lang.String details;
	
	/**
	 * 属性描述:类型（航班车次、接机、入住、用餐、会议、午休、自定义内容等）
	 */
	@TableField(value="type",exist=true)
	java.lang.Integer type;
	
	/**
	 * 属性描述:分组名称，对应attendance的group
	 */
	@TableField(value="attendance_group",exist=true)
	java.lang.String attendanceGroup;
	
	
	
	
	
	
	public java.lang.Integer getId(){
		return this.id;
	}
	
	public void setId(java.lang.Integer id){
		this.id=id;
	}
	
	
	public java.lang.Integer getReceptionId(){
		return this.receptionId;
	}
	
	public void setReceptionId(java.lang.Integer receptionId){
		this.receptionId=receptionId;
	}
	
	
	public java.lang.String getName(){
		return this.name;
	}
	
	public void setName(java.lang.String name){
		this.name=name;
	}
	
	
	public java.util.Date getStartTime(){
		return this.startTime;
	}
	
	public void setStartTime(java.util.Date startTime){
		this.startTime=startTime;
	}
	
	
	public java.util.Date getEndTime(){
		return this.endTime;
	}
	
	public void setEndTime(java.util.Date endTime){
		this.endTime=endTime;
	}
	
	
	public java.lang.Boolean getDeleted(){
		return this.deleted;
	}
	
	public void setDeleted(java.lang.Boolean deleted){
		this.deleted=deleted;
	}
	
	
	public java.lang.String getDetails(){
		return this.details;
	}
	
	public void setDetails(java.lang.String details){
		this.details=details;
	}
	
	
	public java.lang.Integer getType(){
		return this.type;
	}
	
	public void setType(java.lang.Integer type){
		this.type=type;
	}
	
	
	public java.lang.String getAttendanceGroup(){
		return this.attendanceGroup;
	}
	
	public void setAttendanceGroup(java.lang.String attendanceGroup){
		this.attendanceGroup=attendanceGroup;
	}
	
	
	
	
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
			sb.append(", id=").append(id);			
			sb.append(", receptionId=").append(receptionId);			
			sb.append(", name=").append(name);			
			sb.append(", startTime=").append(startTime);			
			sb.append(", endTime=").append(endTime);			
			sb.append(", deleted=").append(deleted);			
			sb.append(", details=").append(details);			
			sb.append(", type=").append(type);			
			sb.append(", attendanceGroup=").append(attendanceGroup);
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
        Event other = (Event) that;
        boolean flag = true;
        return  flag
        		&&(this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))		
				        		&&(this.getReceptionId() == null ? other.getId() == null : this.getReceptionId().equals(other.getReceptionId()))		
				        		&&(this.getName() == null ? other.getId() == null : this.getName().equals(other.getName()))		
				        		&&(this.getStartTime() == null ? other.getId() == null : this.getStartTime().equals(other.getStartTime()))		
				        		&&(this.getEndTime() == null ? other.getId() == null : this.getEndTime().equals(other.getEndTime()))		
				        		&&(this.getDeleted() == null ? other.getId() == null : this.getDeleted().equals(other.getDeleted()))		
				        		&&(this.getDetails() == null ? other.getId() == null : this.getDetails().equals(other.getDetails()))		
				        		&&(this.getType() == null ? other.getId() == null : this.getType().equals(other.getType()))		
				        		&&(this.getAttendanceGroup() == null ? other.getId() == null : this.getAttendanceGroup().equals(other.getAttendanceGroup()))
				;
    }

  
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());		
		        result = prime * result + ((getReceptionId() == null) ? 0 : getReceptionId().hashCode());		
		        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());		
		        result = prime * result + ((getStartTime() == null) ? 0 : getStartTime().hashCode());		
		        result = prime * result + ((getEndTime() == null) ? 0 : getEndTime().hashCode());		
		        result = prime * result + ((getDeleted() == null) ? 0 : getDeleted().hashCode());		
		        result = prime * result + ((getDetails() == null) ? 0 : getDetails().hashCode());		
		        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());		
		        result = prime * result + ((getAttendanceGroup() == null) ? 0 : getAttendanceGroup().hashCode());
		;
        return result;
    }

}
