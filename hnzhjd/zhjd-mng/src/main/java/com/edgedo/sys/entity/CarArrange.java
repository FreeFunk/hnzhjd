package com.edgedo.sys.entity;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.IdType;

@TableName("car_arrange")
public class CarArrange implements Serializable{
	
		
	/**
	 * 属性描述:id
	 */
	@TableId(value="id",type = IdType.AUTO)
	java.lang.Integer id;
	
	/**
	 * 属性描述:name
	 */
	@TableField(value="name",exist=true)
	java.lang.String name;
	
	/**
	 * 属性描述:出发地
	 */
	@TableField(value="start_address",exist=true)
	java.lang.String startAddress;
	
	/**
	 * 属性描述:返回地点
	 */
	@TableField(value="end_address",exist=true)
	java.lang.String endAddress;
	
	/**
	 * 属性描述:用车日期
	 */
	@TableField(value="use_time",exist=true)
	java.util.Date useTime;
	
	/**
	 * 属性描述:结束日期
	 */
	@TableField(value="end_time",exist=true)
	java.util.Date endTime;
	
	/**
	 * 属性描述:汽车id
	 */
	@TableField(value="car_ids",exist=true)
	java.lang.String carIds;
	
	/**
	 * 属性描述:司机id。对应attendance_id
	 */
	@TableField(value="driver_ids",exist=true)
	java.lang.String driverIds;
	
	/**
	 * 属性描述:安保负责人。对应attendance_id
	 */
	@TableField(value="guard_attendance_id",exist=true)
	java.lang.Integer guardAttendanceId;
	
	/**
	 * 属性描述:接待负责人。对应attendance_id
	 */
	@TableField(value="charger_attendance_id",exist=true)
	java.lang.Integer chargerAttendanceId;
	
	/**
	 * 属性描述:接机人员，多个则逗号分隔
	 */
	@TableField(value="leaders",exist=true)
	java.lang.String leaders;
	
	/**
	 * 属性描述:访问人员，多个则逗号分隔
	 */
	@TableField(value="visitors",exist=true)
	java.lang.String visitors;
	
	/**
	 * 属性描述:uuid分组，同一次添加可分为一组
	 */
	@TableField(value="group_",exist=true)
	java.lang.String group_;
	
	/**
	 * 属性描述:来访id
	 */
	@TableField(value="reception_id",exist=true)
	java.lang.Integer receptionId;
	
	/**
	 * 属性描述:活动id
	 */
	@TableField(value="event_id",exist=true)
	java.lang.Integer eventId;

	/**
	 * 属性描述:0=正常 1=删除
	 */
	@TableField(value="deleted",exist=true)
	java.lang.Boolean deleted;

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
	
	
	public java.lang.String getName(){
		return this.name;
	}
	
	public void setName(java.lang.String name){
		this.name=name;
	}
	
	
	public java.lang.String getStartAddress(){
		return this.startAddress;
	}
	
	public void setStartAddress(java.lang.String startAddress){
		this.startAddress=startAddress;
	}
	
	
	public java.lang.String getEndAddress(){
		return this.endAddress;
	}
	
	public void setEndAddress(java.lang.String endAddress){
		this.endAddress=endAddress;
	}

	public Date getUseTime() {
		return useTime;
	}

	public void setUseTime(Date useTime) {
		this.useTime = useTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public java.lang.String getCarIds(){
		return this.carIds;
	}
	
	public void setCarIds(java.lang.String carIds){
		this.carIds=carIds;
	}
	
	
	public java.lang.String getDriverIds(){
		return this.driverIds;
	}
	
	public void setDriverIds(java.lang.String driverIds){
		this.driverIds=driverIds;
	}
	
	
	public java.lang.Integer getGuardAttendanceId(){
		return this.guardAttendanceId;
	}
	
	public void setGuardAttendanceId(java.lang.Integer guardAttendanceId){
		this.guardAttendanceId=guardAttendanceId;
	}
	
	
	public java.lang.Integer getChargerAttendanceId(){
		return this.chargerAttendanceId;
	}
	
	public void setChargerAttendanceId(java.lang.Integer chargerAttendanceId){
		this.chargerAttendanceId=chargerAttendanceId;
	}
	
	
	public java.lang.String getLeaders(){
		return this.leaders;
	}
	
	public void setLeaders(java.lang.String leaders){
		this.leaders=leaders;
	}
	
	
	public java.lang.String getVisitors(){
		return this.visitors;
	}
	
	public void setVisitors(java.lang.String visitors){
		this.visitors=visitors;
	}

	public String getGroup_() {
		return group_;
	}

	public void setGroup_(String group_) {
		this.group_ = group_;
	}

	public java.lang.Integer getReceptionId(){
		return this.receptionId;
	}
	
	public void setReceptionId(java.lang.Integer receptionId){
		this.receptionId=receptionId;
	}
	
	
	public java.lang.Integer getEventId(){
		return this.eventId;
	}
	
	public void setEventId(java.lang.Integer eventId){
		this.eventId=eventId;
	}
	
	
	
	
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
			sb.append(", id=").append(id);			
			sb.append(", name=").append(name);			
			sb.append(", startAddress=").append(startAddress);			
			sb.append(", endAddress=").append(endAddress);			
			sb.append(", useTime=").append(useTime);
			sb.append(", endTime=").append(endTime);
			sb.append(", carIds=").append(carIds);			
			sb.append(", driverIds=").append(driverIds);			
			sb.append(", guardAttendanceId=").append(guardAttendanceId);			
			sb.append(", chargerAttendanceId=").append(chargerAttendanceId);			
			sb.append(", leaders=").append(leaders);			
			sb.append(", visitors=").append(visitors);			
			sb.append(", group_=").append(group_);
			sb.append(", receptionId=").append(receptionId);			
			sb.append(", eventId=").append(eventId);			
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
        CarArrange other = (CarArrange) that;
        boolean flag = true;
        return  flag
        		&&(this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))		
				        		&&(this.getName() == null ? other.getId() == null : this.getName().equals(other.getName()))		
				        		&&(this.getStartAddress() == null ? other.getId() == null : this.getStartAddress().equals(other.getStartAddress()))		
				        		&&(this.getEndAddress() == null ? other.getId() == null : this.getEndAddress().equals(other.getEndAddress()))		
				        		&&(this.getUseTime() == null ? other.getId() == null : this.getUseTime().equals(other.getUseTime()))
				        		&&(this.getEndTime() == null ? other.getId() == null : this.getEndTime().equals(other.getEndTime()))
				        		&&(this.getCarIds() == null ? other.getId() == null : this.getCarIds().equals(other.getCarIds()))		
				        		&&(this.getDriverIds() == null ? other.getId() == null : this.getDriverIds().equals(other.getDriverIds()))		
				        		&&(this.getGuardAttendanceId() == null ? other.getId() == null : this.getGuardAttendanceId().equals(other.getGuardAttendanceId()))		
				        		&&(this.getChargerAttendanceId() == null ? other.getId() == null : this.getChargerAttendanceId().equals(other.getChargerAttendanceId()))		
				        		&&(this.getLeaders() == null ? other.getId() == null : this.getLeaders().equals(other.getLeaders()))		
				        		&&(this.getVisitors() == null ? other.getId() == null : this.getVisitors().equals(other.getVisitors()))		
				        		&&(this.getGroup_() == null ? other.getId() == null : this.getGroup_().equals(other.getGroup_()))
				        		&&(this.getReceptionId() == null ? other.getId() == null : this.getReceptionId().equals(other.getReceptionId()))		
				        		&&(this.getEventId() == null ? other.getId() == null : this.getEventId().equals(other.getEventId()))		
				;
    }

  
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());		
		        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());		
		        result = prime * result + ((getStartAddress() == null) ? 0 : getStartAddress().hashCode());		
		        result = prime * result + ((getEndAddress() == null) ? 0 : getEndAddress().hashCode());		
		        result = prime * result + ((getUseTime() == null) ? 0 : getUseTime().hashCode());
		        result = prime * result + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
		        result = prime * result + ((getCarIds() == null) ? 0 : getCarIds().hashCode());		
		        result = prime * result + ((getDriverIds() == null) ? 0 : getDriverIds().hashCode());		
		        result = prime * result + ((getGuardAttendanceId() == null) ? 0 : getGuardAttendanceId().hashCode());		
		        result = prime * result + ((getChargerAttendanceId() == null) ? 0 : getChargerAttendanceId().hashCode());		
		        result = prime * result + ((getLeaders() == null) ? 0 : getLeaders().hashCode());		
		        result = prime * result + ((getVisitors() == null) ? 0 : getVisitors().hashCode());		
		        result = prime * result + ((getGroup_() == null) ? 0 : getGroup_().hashCode());
		        result = prime * result + ((getReceptionId() == null) ? 0 : getReceptionId().hashCode());		
		        result = prime * result + ((getEventId() == null) ? 0 : getEventId().hashCode());		
		;
        return result;
    }

}
