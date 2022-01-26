package com.edgedo.sys.queryvo;

import com.edgedo.sys.entity.Org;

public class OrgView extends Org {
    //名称模糊搜索
    private String nameSearch;
    //区域名称搜索
    private String areaStr;

    public String getNameSearch() {
        return nameSearch;
    }

    public void setNameSearch(String nameSearch) {
        this.nameSearch = nameSearch;
    }

    public String getAreaStr() {
        return areaStr;
    }

    public void setAreaStr(String areaStr) {
        this.areaStr = areaStr;
    }
}
