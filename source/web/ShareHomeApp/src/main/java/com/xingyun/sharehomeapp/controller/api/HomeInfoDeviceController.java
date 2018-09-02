package com.xingyun.sharehomeapp.controller.api;

import com.xingyun.sharehomeapp.constant.AppResponseConstant;
import com.xingyun.sharehomeapp.model.AppResponse;
import com.xingyun.sharehomeapp.model.db.HomeInfoDevice;
import com.xingyun.sharehomeapp.repository.HomeInfoDeviceRepository;
import io.swagger.annotations.Api;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(value = "HomeInfoDeviceController", description = "房屋设备信息API")
@RequestMapping(value = "/api/v1")
@RestController
public class HomeInfoDeviceController {

    //打印日志
    Logger logger = LoggerFactory.getLogger(HomeInfoDeviceController.class);
    private final static Boolean DEBUG_TAG=true;

    @Autowired
    HomeInfoDeviceRepository homeInfoDeviceRepository;

    AppResponse appResponse;


    @PostMapping(value = "/homeInfoPic/")
    public AppResponse addHomeInfoDevice(){

        return appResponse;
    }

    @DeleteMapping(value = "/homeInfoPic/{homeInfoDeviceId}")
    public AppResponse deleteHomeInfoDevice(@PathVariable("homeInfoDeviceId") Long homeInfoDeviceId){
        appResponse=new AppResponse();
        try {
            homeInfoDeviceRepository.deleteAllByHomeInfoDeviceId(homeInfoDeviceId);
            appResponse.setResultStatus(true);
            appResponse.setResultCode(AppResponseConstant.OK_SUCCESS);
            appResponse.setResultMessage("房屋设备信息删除成功");
            appResponse.setResultData(null);
            appResponse.setExtendField(null);
            return appResponse;
        } catch (Exception e) {
            commonException(e);
            return appResponse;
        }
    }
    @PutMapping(value = "/homeInfoPic/{homeInfoDeviceUid}")
    public AppResponse updateHomeInfoDevice(@PathVariable("homeInfoDeviceUid") Long homeInfoDeviceUid){

        return appResponse;
    }

    @GetMapping(value = "/homeInfoPic/{homeInfoDeviceId}")
    public AppResponse findHomeInfoDeviceByHomeInfoId(@PathVariable("homeInfoDeviceId") Long homeInfoDeviceId){

        appResponse=new AppResponse();

        if(DEBUG_TAG){
            logger.debug(homeInfoDeviceId+"");
        }

        try {
            List<HomeInfoDevice> homeInfoDeviceList=homeInfoDeviceRepository.findAllByHomeInfoDeviceId(homeInfoDeviceId);
            if(homeInfoDeviceList.size()<=0){
                appResponse.setResultStatus(true);
                appResponse.setResultCode(AppResponseConstant.DATA_EMPTY);
                appResponse.setResultMessage(AppResponseConstant.DATA_EMPTY_MSG);
                appResponse.setResultData(null);
                appResponse.setExtendField(null);
                return appResponse;
            }else{
                appResponse.setResultStatus(true);
                appResponse.setResultCode(AppResponseConstant.OK_SUCCESS);
                appResponse.setResultMessage("查找房屋设备信息成功");
                appResponse.setResultData(homeInfoDeviceList);
                appResponse.setExtendField(null);
                return appResponse;
            }
        } catch (Exception e) {
            commonException(e);
            return appResponse;
        }
    }

    private void commonException(Exception e){
        logger.error(e.toString());
        appResponse.setResultStatus(false);
        appResponse.setResultCode(AppResponseConstant.SERVER_EXCEPTION);
        appResponse.setResultMessage(AppResponseConstant.SERVER_EXCEPTION_MSG+e.toString());
        appResponse.setResultData(null);
        appResponse.setExtendField(null);
    }
}
