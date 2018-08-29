package com.xingyun.sharehomeapp.model.db;

import java.io.Serializable;

import javax.persistence.*;


/**
 * @author fairy
 * @email fairy_xingyun@hotmail.com
 * */
@Table(name = "t_home_info")
@Entity
public class HomeInfo implements Serializable{

	/**
	 * 房屋基础信息主表
	 */
	private static final long serialVersionUID = 2373737510633340611L;

	//设为主键自增长
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "homeInfoId")
	private Long homeInfoId;//房屋信息Id
	@Column(name = "homeInfoTitle")
	private String homeInfoTitle;//房源标题
	@Column(name = "homeInfoMoneyByOneMonth")
	private Double homeInfoMoneyByOneMonth;//月付金额
	@Column(name = "homeInfoArea")
	private String homeInfoArea;//房屋面积
	@Column(name = "homeInfoType")
	private String homeInfoType;//房屋户型
	@Column(name = "homeInfoFloor")
	private String homeInfoFloor;//房屋楼层
	@Column(name = "homeInfoOrientation")
	private String homeInfoOrientation;//房屋朝向
	@Column(name = "homeInfoSubway")
	private String homeInfoSubway;//房屋地铁
	@Column(name = "homeInfoCommunity")
	private String homeInfoCommunity;//房屋小区
	@Column(name = "homeInfoAddress")
	private String homeInfoAddress;//房屋地址
	@Column(name = "homeInfoPhone")
	private String homeInfoPhone;//联系电话
	@Column(name = "homeInfoPublishTime")
	private Long homeInfoPublishTime;//发布时间
	@Column(name = "homeInfoRentalMethod")
	private String homeInfoRentalMethod;//租赁方式
	@Column(name = "homeInfoSupportPayMethod")
	private String homeInfoSupportPayMethod;//付款方式
	@Column(name = "homeInfoHeatingMethod")
	private String homeInfoHeatingMethod;//供暖方式
	@Column(name="homeInfoDeviceListId")
	private Long homeInfoDeviceListId;//房屋设备列表Id----外键关联
	@Column(name = "homeInfoPicListId")
	private  Long homeInfoPicListId;//房屋图片列表Id

	public HomeInfo() {
	}

	public HomeInfo(String homeInfoTitle, Double homeInfoMoneyByOneMonth, String homeInfoArea, String homeInfoType, String homeInfoFloor, String homeInfoOrientation, String homeInfoSubway, String homeInfoCommunity, String homeInfoAddress, String homeInfoPhone, Long homeInfoPublishTime, String homeInfoRentalMethod, String homeInfoSupportPayMethod, String homeInfoHeatingMethod, Long homeInfoDeviceListId, Long homeInfoPicListId) {
		this.homeInfoTitle = homeInfoTitle;
		this.homeInfoMoneyByOneMonth = homeInfoMoneyByOneMonth;
		this.homeInfoArea = homeInfoArea;
		this.homeInfoType = homeInfoType;
		this.homeInfoFloor = homeInfoFloor;
		this.homeInfoOrientation = homeInfoOrientation;
		this.homeInfoSubway = homeInfoSubway;
		this.homeInfoCommunity = homeInfoCommunity;
		this.homeInfoAddress = homeInfoAddress;
		this.homeInfoPhone = homeInfoPhone;
		this.homeInfoPublishTime = homeInfoPublishTime;
		this.homeInfoRentalMethod = homeInfoRentalMethod;
		this.homeInfoSupportPayMethod = homeInfoSupportPayMethod;
		this.homeInfoHeatingMethod = homeInfoHeatingMethod;
		this.homeInfoDeviceListId = homeInfoDeviceListId;
		this.homeInfoPicListId = homeInfoPicListId;
	}

	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

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

	public Double getHomeInfoMoneyByOneMonth() {
		return homeInfoMoneyByOneMonth;
	}

	public void setHomeInfoMoneyByOneMonth(Double homeInfoMoneyByOneMonth) {
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

	public String getHomeInfoRentalMethod() {
		return homeInfoRentalMethod;
	}

	public void setHomeInfoRentalMethod(String homeInfoRentalMethod) {
		this.homeInfoRentalMethod = homeInfoRentalMethod;
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

	public Long getHomeInfoDeviceListId() {
		return homeInfoDeviceListId;
	}

	public void setHomeInfoDeviceListId(Long homeInfoDeviceListId) {
		this.homeInfoDeviceListId = homeInfoDeviceListId;
	}

	public Long getHomeInfoPicListId() {
		return homeInfoPicListId;
	}

	public void setHomeInfoPicListId(Long homeInfoPicListId) {
		this.homeInfoPicListId = homeInfoPicListId;
	}

	@Override
	public String toString() {
		return super.toString();
	}
}
