package com.edgedo.sys.queryvo;
import com.edgedo.common.base.QueryObj;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize.Inclusion;

public class CarQuery extends QueryObj{
	@JsonSerialize(include=Inclusion.NON_EMPTY) 
	private CarView queryObj = new CarView();

	public CarView getQueryObj() {
		return queryObj;
	}

	public void setQueryObj(CarView queryObj) {
		this.queryObj = queryObj;
	}
}
