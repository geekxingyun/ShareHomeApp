package com.xingyun.sharehomeapp.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author fairy
 * @email fairy_xingyun@hotmail.com
 * */
@Table(name = "t_home_info_pic")
@Entity
public class HomeInfoPic implements Serializable{
	/**
	 *  房屋信息图片表 
	 */
	private static final long serialVersionUID = 1648958096759485840L;

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long homeInfoPicUid;//房屋图片主键Id
	private Long homeInfoPicId;//房屋图片Id
	private String homeInfoPicLabel;//房屋图片标签名称
	private String homeInfoPicName;//房屋图片名称
	private String homeInfoPicPath;//房屋图片路径
	private String homeInfoPicDesc;//房屋图片描述信息

	public HomeInfoPic() {
	}

	public HomeInfoPic(Long homeInfoPicId, String homeInfoPicLabel, String homeInfoPicName, String homeInfoPicPath, String homeInfoPicDesc) {
		this.homeInfoPicId = homeInfoPicId;
		this.homeInfoPicLabel = homeInfoPicLabel;
		this.homeInfoPicName = homeInfoPicName;
		this.homeInfoPicPath = homeInfoPicPath;
		this.homeInfoPicDesc = homeInfoPicDesc;
	}

	public HomeInfoPic(Long homeInfoPicUid, Long homeInfoPicId, String homeInfoPicLabel, String homeInfoPicName, String homeInfoPicPath, String homeInfoPicDesc) {
		this.homeInfoPicUid = homeInfoPicUid;
		this.homeInfoPicId = homeInfoPicId;
		this.homeInfoPicLabel = homeInfoPicLabel;
		this.homeInfoPicName = homeInfoPicName;
		this.homeInfoPicPath = homeInfoPicPath;
		this.homeInfoPicDesc = homeInfoPicDesc;
	}

	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

	public Long getHomeInfoPicUid() {
		return homeInfoPicUid;
	}

	public void setHomeInfoPicUid(Long homeInfoPicUid) {
		this.homeInfoPicUid = homeInfoPicUid;
	}

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
