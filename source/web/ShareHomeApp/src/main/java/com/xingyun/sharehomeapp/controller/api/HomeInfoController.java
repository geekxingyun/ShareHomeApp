package com.xingyun.sharehomeapp.controller.api;

import com.xingyun.sharehomeapp.constant.AppResponseConstant;
import com.xingyun.sharehomeapp.model.AppResponse;
import com.xingyun.sharehomeapp.model.HomeInfoDataResponse;
import com.xingyun.sharehomeapp.model.HomeInfoGroupData;
import com.xingyun.sharehomeapp.model.db.HomeInfo;
import com.xingyun.sharehomeapp.model.db.HomeInfoDevice;
import com.xingyun.sharehomeapp.model.db.HomeInfoPic;
import com.xingyun.sharehomeapp.repository.HomeInfoDeviceRepository;
import com.xingyun.sharehomeapp.repository.HomeInfoPicRepository;
import com.xingyun.sharehomeapp.repository.HomeInfoRepository;
import com.xingyun.sharehomeapp.util.SmartStringUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import javax.websocket.server.PathParam;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Api(value = "HomeInfoController", description = "房屋信息API")
@RequestMapping(value ="/api/v1")
@RestController
public class HomeInfoController {

    //打印日志
    Logger logger = LoggerFactory.getLogger(HomeInfoDeviceController.class);

    @Autowired
    HomeInfoRepository homeInfoRepository;//房屋信息Service

    @Autowired
    HomeInfoDeviceRepository homeInfoDeviceRepository;//房屋设备Service

    @Autowired
    HomeInfoPicRepository homeInfoPicRepository;//房屋图片Service

    AppResponse appResponse=null;

    /**
     *  GET /api/v1/homeInfo/init
     *  初始化房屋信息虚拟数据
     */
    @ApiIgnore
    @GetMapping(value = "/homeInfo/init")
    public AppResponse initHomeInfo(){

        appResponse = new AppResponse();

        HomeInfo homeInfo=null;
        HomeInfoDevice homeInfoDevice=null;
        HomeInfoPic homeInfoPic=null;
        HomeInfoGroupData homeInfoGroupData=null;
        HomeInfoDataResponse homeInfoDataResponse=null;

        List<HomeInfo> homeInfoList= new ArrayList<HomeInfo>();
        List<HomeInfoDevice> homeInfoDeviceList=new ArrayList<HomeInfoDevice>();
        List<HomeInfoPic> homeInfoPicList=new ArrayList<HomeInfoPic>();
        List<HomeInfoGroupData> homeInfoGroupDataList=new ArrayList<HomeInfoGroupData>();

        Boolean initTag=false;

        try {
            homeInfoList = homeInfoRepository.findAll();
            if(homeInfoList.size()<=0){
                initTag=false;
            }else{
                initTag=true;
            }

        } catch (Exception e) {
            logger.error(e.toString());
            appResponse.setResultStatus(false);
            appResponse.setResultCode(AppResponseConstant.SERVER_EXCEPTION);
            appResponse.setResultMessage(AppResponseConstant.SERVER_EXCEPTION_MSG+e.toString());
            appResponse.setResultData(null);
            appResponse.setExtendField(null);
            return appResponse;
        }

        if(!initTag){
            homeInfoDataResponse=new HomeInfoDataResponse();
            //循环添加20组数据
            for(int i=0;i<6;i++){
                    try {
                        homeInfoGroupData=new HomeInfoGroupData();
                        homeInfoList.clear();
                        //添加房屋基本信息
                        homeInfo=new HomeInfo();
                        homeInfo.setHomeInfoTitle("华腾园3居室 01卧-test"+i);//房源标题
                        homeInfo.setHomeInfoMoneyByOneMonth(3460.0);//月付金额
                        homeInfo.setHomeInfoArea("12平米");//房屋面积
                        homeInfo.setHomeInfoType("3室1厅1卫 合租");//房屋户型
                        homeInfo.setHomeInfoFloor("高楼层 (共24层)");//房屋楼层
                        homeInfo.setHomeInfoOrientation("西");//房屋朝向
                        homeInfo.setHomeInfoSubway("距地铁10号线劲松722米");//房屋地铁
                        homeInfo.setHomeInfoCommunity("华腾园 - 8套出租中");//房屋小区
                        homeInfo.setHomeInfoAddress("朝阳 劲松");//房屋地址
                        homeInfo.setHomeInfoPhone("4008097959 转 2205");//联系电话
                        homeInfo.setHomeInfoPublishTime(System.currentTimeMillis());//发布时间
                        homeInfo.setHomeInfoRentalMethod("合租");//租赁方式
                        homeInfo.setHomeInfoSupportPayMethod("用户可选");//付款方式
                        homeInfo.setHomeInfoCurrentStatus("目前闲置");//房屋现状
                        homeInfo.setHomeInfoHeatingMethod("集中供暖");//供暖方式
                        homeInfo.setHomeInfoDeviceListId(Long.valueOf(i+""));//房屋设备列表Id----外键关联
                        homeInfo.setHomeInfoPicListId(Long.valueOf(i+""));//房屋图片列表Id
                        homeInfoRepository.save(homeInfo);
                        homeInfoList.add(homeInfo);
                        homeInfoGroupData.setHomeInfo(homeInfo);

                        //添加房屋设备信息 11*6
                        homeInfoDeviceList.clear();
                        homeInfoDevice=new HomeInfoDevice();
                        homeInfoDevice.setHomeInfoDeviceId(Long.valueOf(i+""));//设备Id
                        homeInfoDevice.setHomeInfoDeviceLabel("衣柜");
                        homeInfoDevice.setHomeInfoDevicePath("/static/data/home_info_device/yi_gui_yes.png");
                        homeInfoDevice.setHomeInfoDeviceSortId(1);
                        homeInfoDevice.setHomeInfoDeviceSupport(true);
                        homeInfoDeviceRepository.save(homeInfoDevice);
                        homeInfoDeviceList.add(homeInfoDevice);

                        homeInfoDevice=new HomeInfoDevice();
                        homeInfoDevice.setHomeInfoDeviceId(Long.valueOf(i+""));//设备Id
                        homeInfoDevice.setHomeInfoDeviceLabel("桌椅");
                        homeInfoDevice.setHomeInfoDevicePath("/static/data/home_info_device/zhuo_yi_yes.png");
                        homeInfoDevice.setHomeInfoDeviceSortId(2);
                        homeInfoDevice.setHomeInfoDeviceSupport(true);
                        homeInfoDeviceRepository.save(homeInfoDevice);
                        homeInfoDeviceList.add(homeInfoDevice);

                        homeInfoDevice=new HomeInfoDevice();
                        homeInfoDevice.setHomeInfoDeviceId(Long.valueOf(i+""));//设备Id
                        homeInfoDevice.setHomeInfoDeviceLabel("电视");
                        homeInfoDevice.setHomeInfoDevicePath("/static/data/home_info_device/dian_shi_yes.png");
                        homeInfoDevice.setHomeInfoDeviceSortId(3);
                        homeInfoDevice.setHomeInfoDeviceSupport(true);
                        homeInfoDeviceRepository.save(homeInfoDevice);
                        homeInfoDeviceList.add(homeInfoDevice);

                        homeInfoDevice=new HomeInfoDevice();
                        homeInfoDevice.setHomeInfoDeviceId(Long.valueOf(i+""));//设备Id
                        homeInfoDevice.setHomeInfoDeviceLabel("冰箱");
                        homeInfoDevice.setHomeInfoDevicePath("/static/data/home_info_device/bing_xiang_yes.png");
                        homeInfoDevice.setHomeInfoDeviceSortId(4);
                        homeInfoDevice.setHomeInfoDeviceSupport(true);
                        homeInfoDeviceRepository.save(homeInfoDevice);
                        homeInfoDeviceList.add(homeInfoDevice);

                        homeInfoDevice=new HomeInfoDevice();
                        homeInfoDevice.setHomeInfoDeviceId(Long.valueOf(i+""));//设备Id
                        homeInfoDevice.setHomeInfoDeviceLabel("洗衣机");
                        homeInfoDevice.setHomeInfoDevicePath("/static/data/home_info_device/xi_yi_ji_yes.png");
                        homeInfoDevice.setHomeInfoDeviceSortId(5);
                        homeInfoDevice.setHomeInfoDeviceSupport(true);
                        homeInfoDeviceRepository.save(homeInfoDevice);
                        homeInfoDeviceList.add(homeInfoDevice);

                        homeInfoDevice=new HomeInfoDevice();
                        homeInfoDevice.setHomeInfoDeviceId(Long.valueOf(i+""));//设备Id
                        homeInfoDevice.setHomeInfoDeviceLabel("空调");
                        homeInfoDevice.setHomeInfoDevicePath("/static/data/home_info_device/kong_tiao_yes.png");
                        homeInfoDevice.setHomeInfoDeviceSortId(6);
                        homeInfoDevice.setHomeInfoDeviceSupport(true);
                        homeInfoDeviceRepository.save(homeInfoDevice);
                        homeInfoDeviceList.add(homeInfoDevice);

                        homeInfoDevice=new HomeInfoDevice();
                        homeInfoDevice.setHomeInfoDeviceId(Long.valueOf(i+""));//设备Id
                        homeInfoDevice.setHomeInfoDeviceLabel("热水器");
                        homeInfoDevice.setHomeInfoDevicePath("/static/data/home_info_device/re_shui_qi_yes.png");
                        homeInfoDevice.setHomeInfoDeviceSortId(7);
                        homeInfoDevice.setHomeInfoDeviceSupport(true);
                        homeInfoDeviceRepository.save(homeInfoDevice);
                        homeInfoDeviceList.add(homeInfoDevice);

                        homeInfoDevice=new HomeInfoDevice();
                        homeInfoDevice.setHomeInfoDeviceId(Long.valueOf(i+""));//设备Id
                        homeInfoDevice.setHomeInfoDeviceLabel("微波炉");
                        homeInfoDevice.setHomeInfoDevicePath("/static/data/home_info_device/wei_bo_lu_yes.png");
                        homeInfoDevice.setHomeInfoDeviceSortId(8);
                        homeInfoDevice.setHomeInfoDeviceSupport(true);
                        homeInfoDeviceRepository.save(homeInfoDevice);
                        homeInfoDeviceList.add(homeInfoDevice);

                        homeInfoDevice=new HomeInfoDevice();
                        homeInfoDevice.setHomeInfoDeviceId(Long.valueOf(i+""));//设备Id
                        homeInfoDevice.setHomeInfoDeviceLabel("暖气");
                        homeInfoDevice.setHomeInfoDevicePath("/static/data/home_info_device/nuan_qi_yes.png");
                        homeInfoDevice.setHomeInfoDeviceSortId(9);
                        homeInfoDevice.setHomeInfoDeviceSupport(true);
                        homeInfoDeviceRepository.save(homeInfoDevice);
                        homeInfoDeviceList.add(homeInfoDevice);

                        homeInfoDevice=new HomeInfoDevice();
                        homeInfoDevice.setHomeInfoDeviceId(Long.valueOf(i+""));//设备Id
                        homeInfoDevice.setHomeInfoDeviceLabel("宽带");
                        homeInfoDevice.setHomeInfoDevicePath("/static/data/home_info_device/kuan_dai_yes.png");
                        homeInfoDevice.setHomeInfoDeviceSortId(10);
                        homeInfoDevice.setHomeInfoDeviceSupport(true);
                        homeInfoDeviceRepository.save(homeInfoDevice);
                        homeInfoDeviceList.add(homeInfoDevice);

                        homeInfoDevice=new HomeInfoDevice();
                        homeInfoDevice.setHomeInfoDeviceId(Long.valueOf(i+""));//设备Id
                        homeInfoDevice.setHomeInfoDeviceLabel("天然气");
                        homeInfoDevice.setHomeInfoDevicePath("/static/data/home_info_device/tian_ran_qi_yes.png");
                        homeInfoDevice.setHomeInfoDeviceSortId(11);
                        homeInfoDevice.setHomeInfoDeviceSupport(true);
                        homeInfoDeviceRepository.save(homeInfoDevice);
                        homeInfoDeviceList.add(homeInfoDevice);

                        homeInfoGroupData.setHomeInfoDeviceList(homeInfoDeviceList);

                        //设置图片信息
                        homeInfoPicList.clear();
                        homeInfoPic=new HomeInfoPic(Long.valueOf(i+""),"客厅A","/static/data/home_info_pic/sample/ke_ting.png",1);
                        homeInfoPicList.add(homeInfoPic);
                        homeInfoPic=new HomeInfoPic(Long.valueOf(i+""),"客厅B","/static/data/home_info_pic/sample/ke_ting.png",2);
                        homeInfoPicList.add(homeInfoPic);
                        homeInfoPic=new HomeInfoPic(Long.valueOf(i+""),"客厅C","/static/data/home_info_pic/sample/ke_ting.png",3);
                        homeInfoPicList.add(homeInfoPic);
                        homeInfoPic=new HomeInfoPic(Long.valueOf(i+""),"卧室","/static/data/home_info_pic/sample/sleep_houses.png",4);
                        homeInfoPicList.add(homeInfoPic);

                        homeInfoGroupData.setHomeInfoPicList(homeInfoPicList);

                        homeInfoGroupDataList.add(homeInfoGroupData);

                    } catch (Exception e) {
                        logger.error(e.toString());
                        appResponse.setResultStatus(false);
                        appResponse.setResultCode(AppResponseConstant.SERVER_EXCEPTION);
                        appResponse.setResultMessage(AppResponseConstant.SERVER_EXCEPTION_MSG+e.toString());
                        appResponse.setResultData(null);
                        appResponse.setExtendField(null);
                    }//end try catch
                    homeInfoDataResponse.setHomeInfoGroupDataResponse(homeInfoGroupDataList);
            }//end for

           appResponse.setResultStatus(true);
           appResponse.setResultCode(200);
           appResponse.setResultMessage("房屋信息初始化成功");
           appResponse.setResultData(homeInfoDataResponse);
           appResponse.setExtendField(null);
           return appResponse;
       }else{
           appResponse.setResultStatus(false);
           appResponse.setResultCode(200);
           appResponse.setResultMessage("房屋信息已初始化成功");
           appResponse.setResultData(null);
           appResponse.setExtendField(null);
           return appResponse;
       }
    }

    /****
     * POST  /api/v1/homeInfo/
     * 添加一个房屋信息
     */
    @ApiOperation(value="添加一个房屋信息",notes = "此接口字段较多,故采用模拟Form表单方式提交")
    @ApiImplicitParams({
            @ApiImplicitParam(dataType = "String", name = "homeInfoTitle", value = "房屋标题", required = true, paramType = "form"),
            @ApiImplicitParam(dataType = "Double", name = "homeInfoMoneyByOneMonth", value = "房屋月租", required = true, paramType = "form"),
            @ApiImplicitParam(dataType = "String", name = "homeInfoArea", value = "房屋面积", required = true, paramType = "form"),
            @ApiImplicitParam(dataType = "String", name = "homeInfoType", value = "房屋户型", required = true, paramType = "form"),
            @ApiImplicitParam(dataType = "String", name = "homeInfoFloor", value = "房屋楼层", required = true, paramType = "form"),
            @ApiImplicitParam(dataType = "String", name = "homeInfoOrientation", value = "房屋朝向", required = true, paramType = "form"),
            @ApiImplicitParam(dataType = "String", name = "homeInfoSubway", value = "房屋地铁", required = true, paramType = "form"),
            @ApiImplicitParam(dataType = "String", name = "homeInfoCommunity", value = "房屋小区", required = true, paramType = "form"),
            @ApiImplicitParam(dataType = "String", name = "homeInfoAddress", value = "房屋地址", required = true, paramType = "form"),
            @ApiImplicitParam(dataType = "String", name = "homeInfoPhone", value = "联系电话", required = true, paramType = "form"),
            @ApiImplicitParam(dataType = "String", name = "homeInfoRentalMethod", value = "租赁方式", required = true, paramType = "form"),
            @ApiImplicitParam(dataType = "String", name = "homeInfoSupportPayMethod", value = "付款方式", required = true, paramType = "form"),
            @ApiImplicitParam(dataType = "String", name = "homeInfoCurrentStatus", value = "房屋现状", required = true, paramType = "form"),
            @ApiImplicitParam(dataType = "String", name = "homeInfoHeatingMethod", value = "供暖方式", required = true, paramType = "form")
    })
    @PostMapping(value = "/homeInfo")
    public AppResponse addHomeInfo(@PathParam("homeInfoTitle") String homeInfoTitle,
                                   @PathParam("homeInfoMoneyByOneMonth") Double homeInfoMoneyByOneMonth,
                                   @PathParam("homeInfoArea") String homeInfoArea,
                                   @PathParam("homeInfoType") String homeInfoType,
                                   @PathParam("homeInfoFloor") String  homeInfoFloor,
                                   @PathParam("homeInfoOrientation") String homeInfoOrientation,
                                   @PathParam("homeInfoSubway") String homeInfoSubway,
                                   @PathParam("homeInfoCommunity") String homeInfoCommunity,
                                   @PathParam("homeInfoAddress") String homeInfoAddress,
                                   @PathParam("homeInfoPhone") String homeInfoPhone,
                                   @PathParam("homeInfoRentalMethod") String homeInfoRentalMethod,
                                   @PathParam("homeInfoSupportPayMethod") String homeInfoSupportPayMethod,
                                   @PathParam("homeInfoCurrentStatus") String homeInfoCurrentStatus,
                                   @PathParam("homeInfoHeatingMethod") String homeInfoHeatingMethod) {
        appResponse=new AppResponse();
        //数据校验
        if(
                SmartStringUtils.checkStringEmpty(homeInfoTitle)||
                homeInfoMoneyByOneMonth==null||
                SmartStringUtils.checkStringEmpty(homeInfoArea)||
                SmartStringUtils.checkStringEmpty(homeInfoType)||
                SmartStringUtils.checkStringEmpty(homeInfoFloor)||
                SmartStringUtils.checkStringEmpty(homeInfoOrientation)||
                SmartStringUtils.checkStringEmpty(homeInfoSubway)||
                SmartStringUtils.checkStringEmpty(homeInfoCommunity)||
                SmartStringUtils.checkStringEmpty(homeInfoAddress)||
                SmartStringUtils.checkStringEmpty(homeInfoPhone)||
                SmartStringUtils.checkStringEmpty(homeInfoRentalMethod)||
                SmartStringUtils.checkStringEmpty(homeInfoSupportPayMethod)|| SmartStringUtils.checkStringEmpty(homeInfoCurrentStatus)||
                SmartStringUtils.checkStringEmpty(homeInfoHeatingMethod)
        ){
            logger.debug("参数不能为空");
            appResponse.setResultStatus(false);
            appResponse.setResultCode(AppResponseConstant.PARAMS_INVALID);
            appResponse.setResultMessage(AppResponseConstant.PARAMS_INVALID_MSG);
            appResponse.setResultData(null);
            appResponse.setExtendField(null);
            return appResponse;
        }

        try {
            HomeInfo homeInfo=new HomeInfo();
            homeInfo.setHomeInfoTitle(homeInfoTitle);
            homeInfo.setHomeInfoMoneyByOneMonth(homeInfoMoneyByOneMonth);
            homeInfo.setHomeInfoArea(homeInfoArea);
            homeInfo.setHomeInfoType(homeInfoType);
            homeInfo.setHomeInfoFloor(homeInfoFloor);
            homeInfo.setHomeInfoOrientation(homeInfoOrientation);
            homeInfo.setHomeInfoSubway(homeInfoSubway);
            homeInfo.setHomeInfoCommunity(homeInfoCommunity);
            homeInfo.setHomeInfoAddress(homeInfoAddress);
            homeInfo.setHomeInfoPhone(homeInfoPhone);
            homeInfo.setHomeInfoPublishTime(System.currentTimeMillis());
            homeInfo.setHomeInfoRentalMethod(homeInfoRentalMethod);
            homeInfo.setHomeInfoSupportPayMethod(homeInfoSupportPayMethod);
            homeInfo.setHomeInfoHeatingMethod(homeInfoHeatingMethod);
            homeInfo.setHomeInfoDeviceListId(null);
            homeInfo.setHomeInfoPicListId(null);

            homeInfoRepository.save(homeInfo);

            appResponse.setResultStatus(true);
            appResponse.setResultCode(AppResponseConstant.OK_SUCCESS);
            appResponse.setResultMessage("添加一个房屋信息成功");
            appResponse.setResultData(null);
            appResponse.setExtendField(null);
            return appResponse;
        } catch (Exception e) {
            logger.error(e.toString());
            appResponse.setResultStatus(false);
            appResponse.setResultCode(AppResponseConstant.SERVER_EXCEPTION);
            appResponse.setResultMessage(AppResponseConstant.SERVER_EXCEPTION_MSG+e.toString());
            appResponse.setResultData(null);
            appResponse.setExtendField(null);
            return appResponse;
        }
    }

    /**
     * DELETE  /api/v1/homeInfo/{homeInfoId}
     * 删除一个房屋信息
     * */
    @ApiOperation(value="删除一个房屋信息")
    @ApiImplicitParam(name = "homeInfoId",value = "房屋信息Id", dataType = "Long", paramType = "path")
    @DeleteMapping(value = "/homeInfo/{homeInfoId}")
    public AppResponse deleteHomeInfo(@PathVariable("homeInfoId") Long homeInfoId){
        appResponse=new AppResponse();
        if(homeInfoId==null){
            appResponse.setResultStatus(false);
            appResponse.setResultCode(AppResponseConstant.PARAMS_INVALID);
            appResponse.setResultMessage(AppResponseConstant.PARAMS_INVALID_MSG);
            appResponse.setResultData(null);
            appResponse.setExtendField(null);
            return appResponse;
        }
        try {
            homeInfoRepository.deleteById(homeInfoId);
            appResponse.setResultStatus(true);
            appResponse.setResultCode(AppResponseConstant.OK_SUCCESS);
            appResponse.setResultMessage("删除一个房屋信息成功");
            appResponse.setResultData(null);
            appResponse.setExtendField(null);
        } catch (Exception e) {
            logger.error(e.toString());
            appResponse.setResultStatus(false);
            appResponse.setResultCode(AppResponseConstant.SERVER_EXCEPTION);
            appResponse.setResultMessage(AppResponseConstant.SERVER_EXCEPTION_MSG+e.toString());
            appResponse.setResultData(null);
            appResponse.setExtendField(null);
        }
        return appResponse;
    }


    /**
     * PUT  /api/v1/homeInfo/{homeInfoId}
     * 更新一个房屋信息
     * */
    @ApiOperation(value="更新一个房屋信息", notes="homeInfoId 为 URL参数,其他为form表单参数")
    @ApiImplicitParams({
            @ApiImplicitParam(dataType = "Long", name = "homeInfoId", value = "房屋信息Id", required = true, paramType = "path"),
            @ApiImplicitParam(dataType = "String", name = "homeInfoTitle", value = "房屋标题", required = true, paramType = "form"),
            @ApiImplicitParam(dataType = "Double", name = "homeInfoMoneyByOneMonth", value = "房屋月租", required = true, paramType = "form"),
            @ApiImplicitParam(dataType = "String", name = "homeInfoArea", value = "房屋面积", required = true, paramType = "form"),
            @ApiImplicitParam(dataType = "String", name = "homeInfoType", value = "房屋户型", required = true, paramType = "form"),
            @ApiImplicitParam(dataType = "String", name = "homeInfoFloor", value = "房屋楼层", required = true, paramType = "form"),
            @ApiImplicitParam(dataType = "String", name = "homeInfoOrientation", value = "房屋朝向", required = true, paramType = "form"),
            @ApiImplicitParam(dataType = "String", name = "homeInfoSubway", value = "房屋地铁", required = true, paramType = "form"),
            @ApiImplicitParam(dataType = "String", name = "homeInfoCommunity", value = "房屋小区", required = true, paramType = "form"),
            @ApiImplicitParam(dataType = "String", name = "homeInfoAddress", value = "房屋地址", required = true, paramType = "form"),
            @ApiImplicitParam(dataType = "String", name = "homeInfoPhone", value = "联系电话", required = true, paramType = "form"),
            @ApiImplicitParam(dataType = "String", name = "homeInfoRentalMethod", value = "租赁方式", required = true, paramType = "form"),
            @ApiImplicitParam(dataType = "String", name = "homeInfoSupportPayMethod", value = "付款方式", required = true, paramType = "form"),
            @ApiImplicitParam(dataType = "String", name = "homeInfoCurrentStatus", value = "房屋现状", required = true, paramType = "form"),
            @ApiImplicitParam(dataType = "String", name = "homeInfoHeatingMethod", value = "供暖方式", required = true, paramType = "form")
    })
    @PutMapping(value = "/homeInfo/{homeInfoId}")
    public AppResponse modifyHomeInfo(@PathVariable("homeInfoId") Long homeInfoId,
                                      @PathParam("homeInfoTitle") String homeInfoTitle,
                                      @PathParam("homeInfoMoneyByOneMonth") Double homeInfoMoneyByOneMonth,
                                      @PathParam("homeInfoArea") String homeInfoArea,
                                      @PathParam("homeInfoType") String homeInfoType,
                                      @PathParam("homeInfoFloor") String  homeInfoFloor,
                                      @PathParam("homeInfoOrientation") String homeInfoOrientation,
                                      @PathParam("homeInfoSubway") String homeInfoSubway,
                                      @PathParam("homeInfoCommunity") String homeInfoCommunity,
                                      @PathParam("homeInfoAddress") String homeInfoAddress,
                                      @PathParam("homeInfoPhone") String homeInfoPhone,
                                      @PathParam("homeInfoRentalMethod") String homeInfoRentalMethod,
                                      @PathParam("homeInfoSupportPayMethod") String homeInfoSupportPayMethod,
                                      @PathParam("homeInfoCurrentStatus") String homeInfoCurrentStatus,
                                      @PathParam("homeInfoHeatingMethod") String homeInfoHeatingMethod
    ){

        appResponse=new AppResponse();

        //数据校验
        if(homeInfoId==null||
                        SmartStringUtils.checkStringEmpty(homeInfoTitle)||
                        homeInfoMoneyByOneMonth==null||
                        SmartStringUtils.checkStringEmpty(homeInfoArea)||
                        SmartStringUtils.checkStringEmpty(homeInfoType)||
                        SmartStringUtils.checkStringEmpty(homeInfoFloor)||
                        SmartStringUtils.checkStringEmpty(homeInfoOrientation)||
                        SmartStringUtils.checkStringEmpty(homeInfoSubway)||
                        SmartStringUtils.checkStringEmpty(homeInfoCommunity)||
                        SmartStringUtils.checkStringEmpty(homeInfoAddress)||
                        SmartStringUtils.checkStringEmpty(homeInfoPhone)||
                        SmartStringUtils.checkStringEmpty(homeInfoRentalMethod)||
                        SmartStringUtils.checkStringEmpty(homeInfoSupportPayMethod)||
                        SmartStringUtils.checkStringEmpty(homeInfoCurrentStatus)||
                        SmartStringUtils.checkStringEmpty(homeInfoHeatingMethod)

        ){
            logger.debug("参数不能为空");
            appResponse.setResultStatus(false);
            appResponse.setResultCode(AppResponseConstant.PARAMS_INVALID);
            appResponse.setResultMessage(AppResponseConstant.PARAMS_INVALID_MSG);
            appResponse.setResultData(null);
            appResponse.setExtendField(null);
            return appResponse;
        }

       Optional<HomeInfo> modifyHomeInfo=homeInfoRepository.findById(homeInfoId);
        if(modifyHomeInfo.isPresent()){
            modifyHomeInfo.get().setHomeInfoTitle(homeInfoTitle);
            modifyHomeInfo.get().setHomeInfoMoneyByOneMonth(homeInfoMoneyByOneMonth);
            modifyHomeInfo.get().setHomeInfoArea(homeInfoArea);
            modifyHomeInfo.get().setHomeInfoType(homeInfoType);
            modifyHomeInfo.get().setHomeInfoFloor(homeInfoFloor);
            modifyHomeInfo.get().setHomeInfoOrientation(homeInfoOrientation);
            modifyHomeInfo.get().setHomeInfoSubway(homeInfoSubway);
            modifyHomeInfo.get().setHomeInfoCommunity(homeInfoCommunity);
            modifyHomeInfo.get().setHomeInfoAddress(homeInfoAddress);
            modifyHomeInfo.get().setHomeInfoPhone(homeInfoPhone);
            modifyHomeInfo.get().setHomeInfoRentalMethod(homeInfoRentalMethod);
            modifyHomeInfo.get().setHomeInfoSupportPayMethod(homeInfoSupportPayMethod);
            modifyHomeInfo.get().setHomeInfoCurrentStatus(homeInfoCurrentStatus);
            modifyHomeInfo.get().setHomeInfoHeatingMethod(homeInfoHeatingMethod);
            appResponse.setResultStatus(true);
            appResponse.setResultCode(AppResponseConstant.PARAMS_INVALID);
            appResponse.setResultMessage(AppResponseConstant.PARAMS_INVALID_MSG);
            appResponse.setResultData(null);
            appResponse.setExtendField(null);
            return appResponse;
        }else{
            appResponse.setResultStatus(false);
            appResponse.setResultCode(AppResponseConstant.DATA_EMPTY);
            appResponse.setResultMessage(AppResponseConstant.DATA_EMPTY_MSG);
            appResponse.setResultData(null);
            appResponse.setExtendField(null);
            return appResponse;
        }
    }

    /**
     * 查询一个房屋信息
     * GET /api/v1/homeInfo/{homeInfoId}
     * */
    @ApiOperation(value="查询一个房屋信息")
    @ApiImplicitParam(dataType = "Long", name = "homeInfoId", value = "房屋信息Id", required = true, paramType = "path")
    @GetMapping(value = "/homeInfo/{homeInfoId}")
    public AppResponse showHomeInfo(@PathVariable("homeInfoId") Long homeInfoId){
        appResponse=new AppResponse();
        Optional<HomeInfo> homeInfo=null;
        try {
            homeInfo = homeInfoRepository.findById(homeInfoId);
        }catch (Exception e){
            logger.error(e.toString());
            appResponse.setResultStatus(false);
            appResponse.setResultCode(AppResponseConstant.SERVER_EXCEPTION);
            appResponse.setResultMessage(AppResponseConstant.SERVER_EXCEPTION_MSG+e.toString());
            appResponse.setResultData(null);
            appResponse.setExtendField(null);
            return appResponse;
        }

        if(homeInfo.isPresent()){
            appResponse.setResultStatus(true);
            appResponse.setResultCode(AppResponseConstant.OK_SUCCESS);
            appResponse.setResultMessage("查询房屋信息成功");
            appResponse.setResultData(homeInfo.get());
            appResponse.setExtendField(null);
            return appResponse;
        }else{
            appResponse.setResultStatus(false);
            appResponse.setResultCode(AppResponseConstant.DATA_EMPTY);
            appResponse.setResultMessage(AppResponseConstant.DATA_EMPTY_MSG);
            appResponse.setResultData(null);
            appResponse.setExtendField(null);
            return appResponse;
        }
    }

    /*****
     * 显示所有房屋信息列表
     * Get  /api/v1/homeInfo
     * ***********/
    @ApiOperation(value="显示房屋信息列表")
    @GetMapping(value = "/homeInfo")
    public AppResponse showHomeInfoList(){
        try{
            List<HomeInfo> homeInfoList= homeInfoRepository.findAll();
            if(homeInfoList.size()<=0){
                appResponse=new AppResponse();
                appResponse.setResultStatus(false);
                appResponse.setResultCode(AppResponseConstant.DATA_EMPTY);
                appResponse.setResultMessage("房屋信息列表数据为空");
                appResponse.setResultData(null);
                appResponse.setExtendField(null);
                return appResponse;
            }else{
                appResponse=new AppResponse();
                appResponse.setResultStatus(true);
                appResponse.setResultCode(AppResponseConstant.OK_SUCCESS);
                appResponse.setResultMessage("查询房屋信息列表成功");
                appResponse.setResultData(homeInfoList);
                appResponse.setExtendField(null);
                return appResponse;
            }
        }catch (Exception e){
            logger.error(e.toString());
            appResponse.setResultStatus(false);
            appResponse.setResultCode(AppResponseConstant.SERVER_EXCEPTION);
            appResponse.setResultMessage(AppResponseConstant.SERVER_EXCEPTION_MSG+e.toString());
            appResponse.setResultData(null);
            appResponse.setExtendField(null);
            return appResponse;
        }
    }
}
