package com.xingyun.sharehomeapp.model;

import java.io.Serializable;

/**
 * @author fairy
 * @email fairy_xingyun@hotmail.com
 * */
public class HomeInfoBean implements Serializable{

	/**
	 * 房屋基础信息主表
	 */
	private static final long serialVersionUID = 2373737510633340611L;
	
	private Long homeInfoId;//房屋信息Id
	private String homeInfoTitle;//房源标题
	private String homeInfoMoneyByOneMonth;//月付金额
	private String homeInfoArea;//房屋面积
	private String homeInfoType;//房屋类型
	private String homeInfoFloor;//房屋楼层
	private String homeInfoOrientation;//房屋朝向
	private String homeInfoSubway;//房屋地铁
	private String homeInfoCommunity;//房屋小区
	private String homeInfoAddress;//房屋地址
	private String homeInfoPhone;//联系电话
	private Long homeInfoPublishTime;//发布时间
	private String homeInfoRentalmethod;//租赁方式
	private String homeInfoSupportPayMethod;//付款方式
	private String homeInfoHeatingMethod;//供暖方式
	private Integer homeInfoPicListId;//房屋图片列表Id ----外键关联
	private Integer homeInfoDeviceListId;//房屋设备列表Id----外键关联
	public Long getHomeInfoId() {
		return homeInfoId;
	}
	public void setHomeInfoId(Long homeInfoId) {
		this.homeInfoId = homeInfoId;
	}
	public String getHomeInfoTitle() {
		return homeInfoTitle;
	}
	public void setHomeInfoTitle(String homeInfoTitle) {
		this.homeInfoTitle = homeInfoTitle;
	}
	public String getHomeInfoMoneyByOneMonth() {
		return homeInfoMoneyByOneMonth;
	}
	public void setHomeInfoMoneyByOneMonth(String homeInfoMoneyByOneMonth) {
		this.homeInfoMoneyByOneMonth = homeInfoMoneyByOneMonth;
	}
	public String getHomeInfoArea() {
		return homeInfoArea;
	}
	public void setHomeInfoArea(String homeInfoArea) {
		this.homeInfoArea = homeInfoArea;
	}
	public String getHomeInfoType() {
		return homeInfoType;
	}
	public void setHomeInfoType(String homeInfoType) {
		this.homeInfoType = homeInfoType;
	}
	public String getHomeInfoFloor() {
		return homeInfoFloor;
	}
	public void setHomeInfoFloor(String homeInfoFloor) {
		this.homeInfoFloor = homeInfoFloor;
	}
	public String getHomeInfoOrientation() {
		return homeInfoOrientation;
	}
	public void setHomeInfoOrientation(String homeInfoOrientation) {
		this.homeInfoOrientation = homeInfoOrientation;
	}
	public String getHomeInfoSubway() {
		return homeInfoSubway;
	}
	public void setHomeInfoSubway(String homeInfoSubway) {
		this.homeInfoSubway = homeInfoSubway;
	}
	public String getHomeInfoCommunity() {
		return homeInfoCommunity;
	}
	public void setHomeInfoCommunity(String homeInfoCommunity) {
		this.homeInfoCommunity = homeInfoCommunity;
	}
	public String getHomeInfoAddress() {
		return homeInfoAddress;
	}
	public void setHomeInfoAddress(String homeInfoAddress) {
		this.homeInfoAddress = homeInfoAddress;
	}
	public String getHomeInfoPhone() {
		return homeInfoPhone;
	}
	public void setHomeInfoPhone(String homeInfoPhone) {
		this.homeInfoPhone = homeInfoPhone;
	}
	public Long getHomeInfoPublishTime() {
		return homeInfoPublishTime;
	}
	public void setHomeInfoPublishTime(Long homeInfoPublishTime) {
		this.homeInfoPublishTime = homeInfoPublishTime;
	}
	public String getHomeInfoRentalmethod() {
		return homeInfoRentalmethod;
	}
	public void setHomeInfoRentalmethod(String homeInfoRentalmethod) {
		this.homeInfoRentalmethod = homeInfoRentalmethod;
	}
	public String getHomeInfoSupportPayMethod() {
		return homeInfoSupportPayMethod;
	}
	public void setHomeInfoSupportPayMethod(String homeInfoSupportPayMethod) {
		this.homeInfoSupportPayMethod = homeInfoSupportPayMethod;
	}
	public String getHomeInfoHeatingMethod() {
		return homeInfoHeatingMethod;
	}
	public void setHomeInfoHeatingMethod(String homeInfoHeatingMethod) {
		this.homeInfoHeatingMethod = homeInfoHeatingMethod;
	}
	public Integer getHomeInfoPicListId() {
		return homeInfoPicListId;
	}
	public void setHomeInfoPicListId(Integer homeInfoPicListId) {
		this.homeInfoPicListId = homeInfoPicListId;
	}
	public Integer getHomeInfoDeviceListId() {
		return homeInfoDeviceListId;
	}
	public void setHomeInfoDeviceListId(Integer homeInfoDeviceListId) {
		this.homeInfoDeviceListId = homeInfoDeviceListId;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}
