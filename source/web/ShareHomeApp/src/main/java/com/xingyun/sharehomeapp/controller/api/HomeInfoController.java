package com.xingyun.sharehomeapp.controller.api;

import com.xingyun.sharehomeapp.model.AppResponse;
import com.xingyun.sharehomeapp.model.HomeInfo;
import com.xingyun.sharehomeapp.repository.HomeInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RequestMapping(value ="/api")
@RestController
public class HomeInfoController {

    @Autowired
    HomeInfoRepository homeInfoRepository;

    @GetMapping(value = "/homeInfo/init")
    public AppResponse addHomeInfo(){

        AppResponse appResponse= null;

        List<HomeInfo> homeInfoList=new ArrayList<HomeInfo>();

        for(int i=0;i<10;i++){
            try {

                appResponse = new AppResponse();
                HomeInfo homeInfo=new HomeInfo();
                homeInfo.setHomeInfoTitle("华腾园3居室 01卧");
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


    @GetMapping(value = "/test")
    public AppResponse test(){

        AppResponse appResponse=new AppResponse();
        appResponse.setResultStatus(true);
        appResponse.setResultCode(200);
        appResponse.setResultMessage("响应成功");
        appResponse.setResultData(null);
        appResponse.setExtendField(null);
        return appResponse;
    }

}
