package com.xingyun.sharehomeapp.model;

import com.xingyun.sharehomeapp.model.db.HomeInfo;
import com.xingyun.sharehomeapp.model.db.HomeInfoDevice;
import com.xingyun.sharehomeapp.model.db.HomeInfoPic;

import java.io.Serializable;
import java.util.List;

public class HomeInfoGroupData implements Serializable {

    private static final long serialVersionUID = 1648958096759485840L;

    private HomeInfo homeInfo;

    private List<HomeInfoPic> homeInfoPicList;

    private List<HomeInfoDevice> homeInfoDeviceList;


    public HomeInfoGroupData() {
    }

    public HomeInfoGroupData(HomeInfo homeInfo, List<HomeInfoPic> homeInfoPicList, List<HomeInfoDevice> homeInfoDeviceList) {
        this.homeInfo = homeInfo;
        this.homeInfoPicList = homeInfoPicList;
        this.homeInfoDeviceList = homeInfoDeviceList;
    }

    public HomeInfo getHomeInfo() {
        return homeInfo;
    }

    public void setHomeInfo(HomeInfo homeInfo) {
        this.homeInfo = homeInfo;
    }

    public List<HomeInfoPic> getHomeInfoPicList() {
        return homeInfoPicList;
    }

    public void setHomeInfoPicList(List<HomeInfoPic> homeInfoPicList) {
        this.homeInfoPicList = homeInfoPicList;
    }

    public List<HomeInfoDevice> getHomeInfoDeviceList() {
        return homeInfoDeviceList;
    }

    public void setHomeInfoDeviceList(List<HomeInfoDevice> homeInfoDeviceList) {
        this.homeInfoDeviceList = homeInfoDeviceList;
    }
}
