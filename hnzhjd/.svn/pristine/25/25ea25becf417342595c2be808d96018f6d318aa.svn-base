package com.edgedo.sys.queryvo;
import com.edgedo.common.base.QueryObj;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize.Inclusion;

public class HotelQuery extends QueryObj{
	@JsonSerialize(include=Inclusion.NON_EMPTY) 
	private HotelView queryObj = new HotelView();

	public HotelView getQueryObj() {
		return queryObj;
	}

	public void setQueryObj(HotelView queryObj) {
		this.queryObj = queryObj;
	}
}
