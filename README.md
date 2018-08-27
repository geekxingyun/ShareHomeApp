# ShareHomeApp
致力于开发一个免费无中介直租共享房源平台App项目~

开发进行中。。。

## 任务分配

1. Web 后台模块 -------

租个家模块 -------待分配

找工作模块-------待分配

交朋友模块-------待分配

个人中心模块-------待分配

2. Android 端

租个家模块 -------待分配

找工作模块-------待分配

交朋友模块-------待分配

个人中心模块-------待分配

3. IOS -------Pendding

## 进度更新

Android 框架初始化完成

![Alt text](/preview/android_preview.png)

## 目录层级说明

source -------------源码

source/web----------Web后台源码

source/android-----------Android 源码

source/ios-----------IOS源码

## 表说明

房屋信息主表

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
