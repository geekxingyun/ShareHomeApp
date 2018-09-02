package com.xingyun.sharehomeapp.model.db;

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
	@Column(name = "homeInfoDeviceUid")
	private Long homeInfoDeviceUid;//房屋设备序号Id
	@Column(name = "homeInfoDeviceId")
	private Long homeInfoDeviceId;//房屋设备Id
	@Column(name = "homeInfoDeviceLabel")
	private String homeInfoDeviceLabel;//房屋设备标签名称
	@Column(name = "homeInfoDevicePath")
	private String homeInfoDevicePath;//房屋设备图片路径
    @Column(name = "homeInfoDeviceSortId")
    private Integer homeInfoDeviceSortId;//房屋信息排序Id
	@Column(name = "homeInfoDeviceSupport")
	private Boolean homeInfoDeviceSupport;//房屋设备是否支持


	public HomeInfoDevice() {
	}

    public HomeInfoDevice(Long homeInfoDeviceId, String homeInfoDeviceLabel, String homeInfoDevicePath, Integer homeInfoDeviceSortId, Boolean homeInfoDeviceSupport) {
        this.homeInfoDeviceId = homeInfoDeviceId;
        this.homeInfoDeviceLabel = homeInfoDeviceLabel;
        this.homeInfoDevicePath = homeInfoDevicePath;
        this.homeInfoDeviceSortId = homeInfoDeviceSortId;
        this.homeInfoDeviceSupport = homeInfoDeviceSupport;
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

    public String getHomeInfoDevicePath() {
        return homeInfoDevicePath;
    }

    public void setHomeInfoDevicePath(String homeInfoDevicePath) {
        this.homeInfoDevicePath = homeInfoDevicePath;
    }

    public Integer getHomeInfoDeviceSortId() {
        return homeInfoDeviceSortId;
    }

    public void setHomeInfoDeviceSortId(Integer homeInfoDeviceSortId) {
        this.homeInfoDeviceSortId = homeInfoDeviceSortId;
    }

    public Boolean getHomeInfoDeviceSupport() {
        return homeInfoDeviceSupport;
    }

    public void setHomeInfoDeviceSupport(Boolean homeInfoDeviceSupport) {
        this.homeInfoDeviceSupport = homeInfoDeviceSupport;
    }

    @Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}
