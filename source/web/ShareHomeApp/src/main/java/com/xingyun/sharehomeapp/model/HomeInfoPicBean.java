package com.xingyun.sharehomeapp.model;

import java.io.Serializable;

/**
 * @author fairy
 * @email fairy_xingyun@hotmail.com
 * */
public class HomeInfoPicBean implements Serializable{
	/**
	 *  房屋信息图片表 
	 */
	private static final long serialVersionUID = 1648958096759485840L;
	private Long homeInfoPicId;//房屋图片Id
	private String homeInfoPicLabel;//房屋图片标签名称
	private String homeInfoPicName;//房屋图片名称
	private String homeInfoPicPath;//房屋图片路径
	private String homeInfoPicDesc;//房屋图片描述信息
	public Long getHomeInfoPicId() {
		return homeInfoPicId;
	}
	public void setHomeInfoPicId(Long homeInfoPicId) {
		this.homeInfoPicId = homeInfoPicId;
	}
	public String getHomeInfoPicLabel() {
		return homeInfoPicLabel;
	}
	public void setHomeInfoPicLabel(String homeInfoPicLabel) {
		this.homeInfoPicLabel = homeInfoPicLabel;
	}
	public String getHomeInfoPicName() {
		return homeInfoPicName;
	}
	public void setHomeInfoPicName(String homeInfoPicName) {
		this.homeInfoPicName = homeInfoPicName;
	}
	public String getHomeInfoPicPath() {
		return homeInfoPicPath;
	}
	public void setHomeInfoPicPath(String homeInfoPicPath) {
		this.homeInfoPicPath = homeInfoPicPath;
	}
	public String getHomeInfoPicDesc() {
		return homeInfoPicDesc;
	}
	public void setHomeInfoPicDesc(String homeInfoPicDesc) {
		this.homeInfoPicDesc = homeInfoPicDesc;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}
