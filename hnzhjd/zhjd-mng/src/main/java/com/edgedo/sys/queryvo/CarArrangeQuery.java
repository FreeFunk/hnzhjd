package com.edgedo.sys.queryvo;
import com.edgedo.common.base.QueryObj;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize.Inclusion;

public class CarArrangeQuery extends QueryObj{
	@JsonSerialize(include=Inclusion.NON_EMPTY) 
	private CarArrangeView queryObj = new CarArrangeView();

	public CarArrangeView getQueryObj() {
		return queryObj;
	}

	public void setQueryObj(CarArrangeView queryObj) {
		this.queryObj = queryObj;
	}
}
