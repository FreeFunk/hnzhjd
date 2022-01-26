package com.edgedo.sys.queryvo;
import com.edgedo.common.base.QueryObj;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize.Inclusion;

public class ReceptionQuery extends QueryObj{
	@JsonSerialize(include=Inclusion.NON_EMPTY) 
	private ReceptionView queryObj = new ReceptionView();

	public ReceptionView getQueryObj() {
		return queryObj;
	}

	public void setQueryObj(ReceptionView queryObj) {
		this.queryObj = queryObj;
	}
}
