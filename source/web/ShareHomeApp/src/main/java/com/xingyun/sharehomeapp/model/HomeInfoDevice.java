package com.xingyun.sharehomeapp.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author fairy
 * @email fairy_xingyun@hotmail.com
 * */
@Table(name = "t_home_info_device")
@Entity
public class HomeInfoDevice implements Serializable{

	/**
	 * 房屋设备信息表
	 */
	private static final long serialVersionUID = 1027321244918003216L;
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long homeInfoDeviceUid;//房屋设备序号Id
	private Long homeInfoDeviceId;//房屋设备Id
	private String homeInfoDeviceLabel;//房屋设备标签名称
	private String homeInfoDeviceName;//房屋设备图片名称
	private String homeInfoDevicePath;//房屋设备图片路径
	private String homeInfoDeviceDesc;//房屋设备描述信息

	public HomeInfoDevice() {
	}

	public HomeInfoDevice(Long homeInfoDeviceId, String homeInfoDeviceLabel, String homeInfoDeviceName, String homeInfoDevicePath, String homeInfoDeviceDesc) {
		this.homeInfoDeviceId = homeInfoDeviceId;
		this.homeInfoDeviceLabel = homeInfoDeviceLabel;
		this.homeInfoDeviceName = homeInfoDeviceName;
		this.homeInfoDevicePath = homeInfoDevicePath;
		this.homeInfoDeviceDesc = homeInfoDeviceDesc;
	}

	public HomeInfoDevice(Long homeInfoDeviceUid, Long homeInfoDeviceId, String homeInfoDeviceLabel, String homeInfoDeviceName, String homeInfoDevicePath, String homeInfoDeviceDesc) {
		this.homeInfoDeviceUid = homeInfoDeviceUid;
		this.homeInfoDeviceId = homeInfoDeviceId;
		this.homeInfoDeviceLabel = homeInfoDeviceLabel;
		this.homeInfoDeviceName = homeInfoDeviceName;
		this.homeInfoDevicePath = homeInfoDevicePath;
		this.homeInfoDeviceDesc = homeInfoDeviceDesc;
	}

	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

	public Long getHomeInfoDeviceUid() {
		return homeInfoDeviceUid;
	}

	public void setHomeInfoDeviceUid(Long homeInfoDeviceUid) {
		this.homeInfoDeviceUid = homeInfoDeviceUid;
	}

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
