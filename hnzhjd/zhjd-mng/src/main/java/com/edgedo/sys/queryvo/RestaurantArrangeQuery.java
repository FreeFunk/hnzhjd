package com.edgedo.sys.queryvo;
import com.edgedo.common.base.QueryObj;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize.Inclusion;

public class RestaurantArrangeQuery extends QueryObj{
	@JsonSerialize(include=Inclusion.NON_EMPTY) 
	private RestaurantArrangeView queryObj = new RestaurantArrangeView();

	public RestaurantArrangeView getQueryObj() {
		return queryObj;
	}

	public void setQueryObj(RestaurantArrangeView queryObj) {
		this.queryObj = queryObj;
	}
}
