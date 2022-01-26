package com.edgedo.sys.queryvo;
import com.edgedo.common.base.QueryObj;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize.Inclusion;

public class RoomArrangeQuery extends QueryObj{
	@JsonSerialize(include=Inclusion.NON_EMPTY) 
	private RoomArrangeView queryObj = new RoomArrangeView();

	public RoomArrangeView getQueryObj() {
		return queryObj;
	}

	public void setQueryObj(RoomArrangeView queryObj) {
		this.queryObj = queryObj;
	}
}
