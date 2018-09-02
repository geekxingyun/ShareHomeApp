package com.xingyun.sharehomeapp.model;

import com.xingyun.sharehomeapp.model.db.HomeInfo;

import java.io.Serializable;
import java.util.List;

public class HomeInfoDataResponse implements Serializable {

    private static final long serialVersionUID = 1648958096759485840L;

    private List<HomeInfoGroupData> HomeInfoGroupDataResponse;

    public HomeInfoDataResponse() {
    }

    public HomeInfoDataResponse(List<HomeInfoGroupData> homeInfoGroupDataResponse) {
        HomeInfoGroupDataResponse = homeInfoGroupDataResponse;
    }

    public List<HomeInfoGroupData> getHomeInfoGroupDataResponse() {
        return HomeInfoGroupDataResponse;
    }

    public void setHomeInfoGroupDataResponse(List<HomeInfoGroupData> homeInfoGroupDataResponse) {
        HomeInfoGroupDataResponse = homeInfoGroupDataResponse;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
