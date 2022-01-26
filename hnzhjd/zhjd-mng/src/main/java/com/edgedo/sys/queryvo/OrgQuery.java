package com.edgedo.sys.queryvo;
import com.edgedo.common.base.QueryObj;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize.Inclusion;

public class OrgQuery extends QueryObj{
	@JsonSerialize(include=Inclusion.NON_EMPTY) 
	private OrgView queryObj = new OrgView();

	public OrgView getQueryObj() {
		return queryObj;
	}

	public void setQueryObj(OrgView queryObj) {
		this.queryObj = queryObj;
	}
}
