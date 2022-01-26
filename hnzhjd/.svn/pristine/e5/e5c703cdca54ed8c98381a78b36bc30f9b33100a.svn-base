package com.edgedo.sys.queryvo;
import com.edgedo.common.base.QueryObj;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize.Inclusion;

public class DriverQuery extends QueryObj{
	@JsonSerialize(include=Inclusion.NON_EMPTY) 
	private DriverView queryObj = new DriverView();

	public DriverView getQueryObj() {
		return queryObj;
	}

	public void setQueryObj(DriverView queryObj) {
		this.queryObj = queryObj;
	}
}
