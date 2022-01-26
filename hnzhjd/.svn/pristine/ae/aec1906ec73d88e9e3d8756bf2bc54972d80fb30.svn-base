package com.edgedo.sys.queryvo;
import com.edgedo.common.base.QueryObj;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize.Inclusion;

public class PickupArrangeQuery extends QueryObj{
	@JsonSerialize(include=Inclusion.NON_EMPTY) 
	private PickupArrangeView queryObj = new PickupArrangeView();

	public PickupArrangeView getQueryObj() {
		return queryObj;
	}

	public void setQueryObj(PickupArrangeView queryObj) {
		this.queryObj = queryObj;
	}
}
