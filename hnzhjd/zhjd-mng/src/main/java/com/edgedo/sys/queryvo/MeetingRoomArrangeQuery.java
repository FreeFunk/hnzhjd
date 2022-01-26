package com.edgedo.sys.queryvo;
import com.edgedo.common.base.QueryObj;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize.Inclusion;

public class MeetingRoomArrangeQuery extends QueryObj{
	@JsonSerialize(include=Inclusion.NON_EMPTY) 
	private MeetingRoomArrangeView queryObj = new MeetingRoomArrangeView();

	public MeetingRoomArrangeView getQueryObj() {
		return queryObj;
	}

	public void setQueryObj(MeetingRoomArrangeView queryObj) {
		this.queryObj = queryObj;
	}
}
