package com.edgedo.sys.queryvo;
import com.edgedo.common.base.QueryObj;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize.Inclusion;

public class RestaurantQuery extends QueryObj{
	@JsonSerialize(include=Inclusion.NON_EMPTY) 
	private RestaurantView queryObj = new RestaurantView();

	public RestaurantView getQueryObj() {
		return queryObj;
	}

	public void setQueryObj(RestaurantView queryObj) {
		this.queryObj = queryObj;
	}
}
