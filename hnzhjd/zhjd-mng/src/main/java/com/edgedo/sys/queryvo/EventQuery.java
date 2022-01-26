package com.edgedo.sys.queryvo;
import com.edgedo.common.base.QueryObj;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize.Inclusion;

public class EventQuery extends QueryObj{
	@JsonSerialize(include=Inclusion.NON_EMPTY) 
	private EventView queryObj = new EventView();

	public EventView getQueryObj() {
		return queryObj;
	}

	public void setQueryObj(EventView queryObj) {
		this.queryObj = queryObj;
	}
}
