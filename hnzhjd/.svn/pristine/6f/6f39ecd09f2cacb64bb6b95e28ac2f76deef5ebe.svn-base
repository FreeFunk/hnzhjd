package com.edgedo.sys.queryvo;
import com.edgedo.common.base.QueryObj;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize.Inclusion;

public class AttendanceQuery extends QueryObj{
	@JsonSerialize(include=Inclusion.NON_EMPTY) 
	private AttendanceView queryObj = new AttendanceView();

	public AttendanceView getQueryObj() {
		return queryObj;
	}

	public void setQueryObj(AttendanceView queryObj) {
		this.queryObj = queryObj;
	}
}
