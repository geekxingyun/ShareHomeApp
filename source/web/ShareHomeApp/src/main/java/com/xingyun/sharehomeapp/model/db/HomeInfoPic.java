package com.xingyun.sharehomeapp.model.db;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;

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
	@Column(name = "homeInfoPicUid")
	private Long homeInfoPicUid;//房屋图片主键Id
	@Column(name = "homeInfoPicId")
	private Long homeInfoPicId;//房屋图片Id
	@Column(name = "homeInfoPicLabel")
	private String homeInfoPicLabel;//房屋图片标签名称
	@Column(name = "homeInfoPicPath")
	private String homeInfoPicPath;//房屋图片路径
	@Column(name = "homeInfoPicSortId")
	private Integer homeInfoPicSortId;//房屋图片排序Id

	public HomeInfoPic() {
	}

	public HomeInfoPic(Long homeInfoPicId, String homeInfoPicLabel, String homeInfoPicPath, Integer homeInfoPicSortId) {
		this.homeInfoPicId = homeInfoPicId;
		this.homeInfoPicLabel = homeInfoPicLabel;
		this.homeInfoPicPath = homeInfoPicPath;
		this.homeInfoPicSortId = homeInfoPicSortId;
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

	public String getHomeInfoPicPath() {
		return homeInfoPicPath;
	}

	public void setHomeInfoPicPath(String homeInfoPicPath) {
		this.homeInfoPicPath = homeInfoPicPath;
	}

	public Integer getHomeInfoPicSortId() {
		return homeInfoPicSortId;
	}

	public void setHomeInfoPicSortId(Integer homeInfoPicSortId) {
		this.homeInfoPicSortId = homeInfoPicSortId;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}
