package com.edgedo.sys.queryvo;
import com.edgedo.common.base.QueryObj;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize.Inclusion;

public class RoomArrangeDetailQuery extends QueryObj{
	@JsonSerialize(include=Inclusion.NON_EMPTY) 
	private RoomArrangeDetailView queryObj = new RoomArrangeDetailView();

	public RoomArrangeDetailView getQueryObj() {
		return queryObj;
	}

	public void setQueryObj(RoomArrangeDetailView queryObj) {
		this.queryObj = queryObj;
	}
}
