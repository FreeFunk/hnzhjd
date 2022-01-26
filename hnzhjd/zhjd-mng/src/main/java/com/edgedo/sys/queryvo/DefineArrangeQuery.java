package com.edgedo.sys.queryvo;
import com.edgedo.common.base.QueryObj;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize.Inclusion;

public class DefineArrangeQuery extends QueryObj{
	@JsonSerialize(include=Inclusion.NON_EMPTY) 
	private DefineArrangeView queryObj = new DefineArrangeView();

	public DefineArrangeView getQueryObj() {
		return queryObj;
	}

	public void setQueryObj(DefineArrangeView queryObj) {
		this.queryObj = queryObj;
	}
}
