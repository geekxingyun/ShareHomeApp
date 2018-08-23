package com.xingyun.sharehomeapp.model;

import java.io.Serializable;
/**
 * @author fairy
 * @email fairy_xingyun@hotmail.com
 * */
public class HomeInfoDeviceBean implements Serializable{

	/**
	 * 房屋设备信息表
	 */
	private static final long serialVersionUID = 1027321244918003216L;
	private Long homeInfoDeviceId;
	private String homeInfoDeviceLabel;//房屋设备标签名称
	private String homeInfoDeviceName;//房屋设备图片名称
	private String homeInfoDevicePath;//房屋设备图片路径
	private String homeInfoDeviceDesc;//房屋设备描述信息
	public Long getHomeInfoDeviceId() {
		return homeInfoDeviceId;
	}
	public void setHomeInfoDeviceId(Long homeInfoDeviceId) {
		this.homeInfoDeviceId = homeInfoDeviceId;
	}
	public String getHomeInfoDeviceLabel() {
		return homeInfoDeviceLabel;
	}
	public void setHomeInfoDeviceLabel(String homeInfoDeviceLabel) {
		this.homeInfoDeviceLabel = homeInfoDeviceLabel;
	}
	public String getHomeInfoDeviceName() {
		return homeInfoDeviceName;
	}
	public void setHomeInfoDeviceName(String homeInfoDeviceName) {
		this.homeInfoDeviceName = homeInfoDeviceName;
	}
	public String getHomeInfoDevicePath() {
		return homeInfoDevicePath;
	}
	public void setHomeInfoDevicePath(String homeInfoDevicePath) {
		this.homeInfoDevicePath = homeInfoDevicePath;
	}
	public String getHomeInfoDeviceDesc() {
		return homeInfoDeviceDesc;
	}
	public void setHomeInfoDeviceDesc(String homeInfoDeviceDesc) {
		this.homeInfoDeviceDesc = homeInfoDeviceDesc;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}
