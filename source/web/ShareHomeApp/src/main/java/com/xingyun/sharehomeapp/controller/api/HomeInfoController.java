package com.xingyun.sharehomeapp.controller.api;

import com.xingyun.sharehomeapp.model.AppResponse;
import com.xingyun.sharehomeapp.model.db.HomeInfo;
import com.xingyun.sharehomeapp.repository.HomeInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RequestMapping(value ="/api")
@RestController
public class HomeInfoController {

    @Autowired
    HomeInfoRepository homeInfoRepository;

    AppResponse appResponse=null;

    @GetMapping(value = "/homeInfo/init")
    public AppResponse addHomeInfo(){
        appResponse = new AppResponse();
        List<HomeInfo> homeInfoList=new ArrayList<HomeInfo>();
        for(int i=0;i<10;i++){
            try {
                HomeInfo homeInfo=new HomeInfo();
                homeInfo.setHomeInfoTitle("华腾园3居室 01卧-test"+i);
                homeInfo.setHomeInfoMoneyByOneMonth(3460.0);
                homeInfo.setHomeInfoArea("12平米");
                homeInfo.setHomeInfoType("3室1厅1卫 合租");
                homeInfo.setHomeInfoFloor("高楼层 (共24层)");
                homeInfo.setHomeInfoOrientation("西");
                homeInfo.setHomeInfoSubway("距地铁10号线劲松722米");
                homeInfo.setHomeInfoCommunity("华腾园 - 8套出租中");
                homeInfo.setHomeInfoAddress("朝阳 劲松");
                homeInfo.setHomeInfoPhone("4008097959 转 2205");
                homeInfo.setHomeInfoPublishTime(System.currentTimeMillis());
                homeInfo.setHomeInfoRentalMethod("合租");
                homeInfo.setHomeInfoSupportPayMethod("用户可选");
                homeInfo.setHomeInfoHeatingMethod("集中供暖");
                homeInfo.setHomeInfoDeviceListId(1L);
                homeInfo.setHomeInfoPicListId(1L);
                homeInfoList.add(homeInfo);
                homeInfoRepository.save(homeInfo);
            } catch (Exception e) {
                e.printStackTrace();
                appResponse.setResultStatus(false);
                appResponse.setResultCode(500);
                appResponse.setResultMessage("房屋信息初始化失败");
                appResponse.setResultData(null);
                appResponse.setExtendField(null);
            }
        }
        appResponse.setResultStatus(true);
        appResponse.setResultCode(200);
        appResponse.setResultMessage("房屋信息初始化成功");
        appResponse.setResultData(homeInfoList);
        appResponse.setExtendField(null);
        return appResponse;
    }


    @GetMapping(value = "/homeInfo/test")
    public AppResponse test(){
        appResponse=new AppResponse();
        appResponse.setResultStatus(true);
        appResponse.setResultCode(200);
        appResponse.setResultMessage("房屋信息接口测试成功");
        appResponse.setResultData(null);
        appResponse.setExtendField(null);
        return appResponse;
    }

    @GetMapping(value = "/homeInfo")
    public AppResponse showHomeInfoList(){
        try{
        List<HomeInfo> homeInfoList= homeInfoRepository.findAll();
        if(homeInfoList.size()<=0){
            appResponse=new AppResponse();
            appResponse.setResultStatus(false);
            appResponse.setResultCode(1001);
            appResponse.setResultMessage("房屋信息列表数据为空");
            appResponse.setResultData(null);
            appResponse.setExtendField(null);
        }else{
            appResponse=new AppResponse();
            appResponse.setResultStatus(true);
            appResponse.setResultCode(200);
            appResponse.setResultMessage("查询房屋信息列表成功");
            appResponse.setResultData(homeInfoList);
            appResponse.setExtendField(null);
        }
        }catch (Exception e){
            appResponse=new AppResponse();
            appResponse.setResultStatus(false);
            appResponse.setResultCode(500);
            appResponse.setResultMessage("服务器内部错误");
            appResponse.setResultData(null);
            appResponse.setExtendField(null);
        }
        return appResponse;
    }


    @GetMapping(value = "/homeInfo/{homeInfoId}")
    public AppResponse showHomeInfo(@PathVariable("homeInfoId") Long homeInfoId){
        appResponse=new AppResponse();
        Optional<HomeInfo> homeInfo=null;
        try {
            homeInfo = homeInfoRepository.findById(homeInfoId);
        }catch (Exception e){
            appResponse.setResultStatus(false);
            appResponse.setResultCode(500);
            appResponse.setResultMessage("查询房屋信息失败");
            appResponse.setResultData(null);
            appResponse.setExtendField(null);
        }

        if(homeInfo==null){
            appResponse.setResultStatus(false);
            appResponse.setResultCode(1002);
            appResponse.setResultMessage("未找到查询房屋信息");
            appResponse.setResultData(null);
            appResponse.setExtendField(null);
            return appResponse;
        }
        appResponse.setResultStatus(true);
        appResponse.setResultCode(200);
        appResponse.setResultMessage("查询房屋信息成功");
        appResponse.setResultData(homeInfo);
        appResponse.setExtendField(null);
        return appResponse;
    }


}
