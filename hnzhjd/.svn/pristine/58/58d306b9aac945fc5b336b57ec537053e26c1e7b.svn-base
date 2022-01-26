package com.edgedo.sys.queryvo;
import com.edgedo.common.base.QueryObj;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize.Inclusion;

public class UserQuery extends QueryObj{
	@JsonSerialize(include=Inclusion.NON_EMPTY) 
	private UserView queryObj = new UserView();

	public UserView getQueryObj() {
		return queryObj;
	}

	public void setQueryObj(UserView queryObj) {
		this.queryObj = queryObj;
	}
}
