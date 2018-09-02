package com.xingyun.sharehomeapp.controller.api;

import com.xingyun.sharehomeapp.constant.AppResponseConstant;
import com.xingyun.sharehomeapp.model.AppResponse;
import com.xingyun.sharehomeapp.model.db.HomeInfoPic;
import com.xingyun.sharehomeapp.repository.HomeInfoPicRepository;
import io.swagger.annotations.Api;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Api(value = "HomeInfoPicController", description = "房屋图片信息API")
@RequestMapping("/api/v1")
@RestController
public class HomeInfoPIcController {

    //打印日志
    Logger logger = LoggerFactory.getLogger(HomeInfoPIcController.class);
    private final static Boolean DEBUG_TAG=true;

    @Autowired
    HomeInfoPicRepository homeInfoPicRepository;

    AppResponse appResponse=null;

    /**
     * 添加一个房屋图片信息
     * POST   api/v1/homeInfoPic/{homeInfoPicId}/{homeInfoPicLabel}
     */
    @PostMapping("/homeInfoPic/{homeInfoPicId}/{homeInfoPicLabel}")
    public AppResponse addHomeInfoPic(@PathVariable("homeInfoPicId")Long homeInfoPicId,@PathVariable("homeInfoPicLabel") String homeInfoPicLabel,@RequestParam("homeInfoPicUploadFile") MultipartFile homeInfoPicUploadFile){

        appResponse=new AppResponse();

        if(DEBUG_TAG){
            logger.debug("---------添加图片信息 start-----------------------------");
            logger.debug(homeInfoPicId+"");
            logger.debug(homeInfoPicLabel);
            logger.debug(homeInfoPicUploadFile.getOriginalFilename());
            logger.debug("---------添加图片信息 end-----------------------------");
        }

        if(homeInfoPicId==null||homeInfoPicId==0 ||
                homeInfoPicLabel==null||"".equals(homeInfoPicLabel.trim())||
                homeInfoPicUploadFile==null
        ){
            logger.info("参数错误");
            appResponse.setResultStatus(false);
            appResponse.setResultCode(AppResponseConstant.PARAMS_INVALID);
            appResponse.setResultMessage(AppResponseConstant.PARAMS_INVALID_MSG);
            appResponse.setResultData(null);
            appResponse.setExtendField(null);
            return appResponse;
        }

        HomeInfoPic homeInfoPic;
        try {
            List<HomeInfoPic> homeInfoPicList=homeInfoPicRepository.findALLByHomeInfoPicId(homeInfoPicId);
            if(homeInfoPicList.size()<=0){
                homeInfoPic=new HomeInfoPic();
                homeInfoPic.setHomeInfoPicId(homeInfoPicId);
                homeInfoPic.setHomeInfoPicLabel(homeInfoPicLabel);
                homeInfoPic.setHomeInfoPicPath(getHomePicPath(homeInfoPicUploadFile));
                homeInfoPic.setHomeInfoPicSortId(1);
                homeInfoPicRepository.save(homeInfoPic);
                appResponse.setResultStatus(true);
                appResponse.setResultCode(AppResponseConstant.OK_SUCCESS);
                appResponse.setResultMessage("添加房子图片信息成功!");
                appResponse.setResultData(null);
                appResponse.setExtendField(null);
                return appResponse;
            }else{
                homeInfoPic=new HomeInfoPic();
                homeInfoPic.setHomeInfoPicId(homeInfoPicId);
                homeInfoPic.setHomeInfoPicLabel(homeInfoPicLabel);
                homeInfoPic.setHomeInfoPicPath(getHomePicPath(homeInfoPicUploadFile));
                homeInfoPic.setHomeInfoPicSortId(homeInfoPicList.size()+1);
                homeInfoPicRepository.save(homeInfoPic);
                appResponse.setResultStatus(true);
                appResponse.setResultCode(AppResponseConstant.OK_SUCCESS);
                appResponse.setResultMessage("添加房子图片信息成功!");
                appResponse.setResultData(null);
                appResponse.setExtendField(null);
                return appResponse;
            }
        } catch (Exception e) {
            logger.error(e.toString());
            appResponse.setResultStatus(false);
            appResponse.setResultCode(AppResponseConstant.SERVER_EXCEPTION);
            appResponse.setResultMessage(AppResponseConstant.SERVER_EXCEPTION_MSG);
            appResponse.setResultData(null);
            appResponse.setExtendField(null);
            return appResponse;
        }
    }
    private String getHomePicPath(MultipartFile multipartFile){
        return "";
    }

    /**
     * 删除一个房屋图片信息
     * DELETE  /api/v1/homeInfoPic/{homeInfoPicUid}
     * ********/
    @DeleteMapping(value = "/homeInfoPic/{homeInfoPicUid}")
    public AppResponse  deleteHomeInfoPicById(@PathVariable("homeInfoPicUid")Long homeInfoPicUid){
        appResponse=new AppResponse();
        if(DEBUG_TAG){
            logger.debug("-------------删除图片信息start------------------------");
            logger.debug(homeInfoPicUid+"");
            logger.debug("-------------删除图片信息end------------------------");
        }
        try {
            homeInfoPicRepository.deleteById(homeInfoPicUid);
            appResponse.setResultStatus(true);
            appResponse.setResultCode(AppResponseConstant.OK_SUCCESS);
            appResponse.setResultMessage("添加房子图片信息成功!");
            appResponse.setResultData(null);
            appResponse.setExtendField(null);
        } catch (Exception e) {
            logger.error(e.toString());
            appResponse.setResultStatus(false);
            appResponse.setResultCode(AppResponseConstant.SERVER_EXCEPTION);
            appResponse.setResultMessage(AppResponseConstant.SERVER_EXCEPTION_MSG);
            appResponse.setResultData(null);
            appResponse.setExtendField(null);
        }
        return appResponse;
    }

    @GetMapping(value = "/homeInfoPic/{homeInfoPicId}")
    public AppResponse findHomeInfoPicList(@PathVariable("homeInfoPicId")Long homeInfoPicId){

        appResponse=new AppResponse();
        if(DEBUG_TAG){
            logger.debug("-------------删除图片信息start------------------------");
            logger.debug(homeInfoPicId+"");
            logger.debug("-------------删除图片信息end------------------------");
        }
        try {
            List<HomeInfoPic> homeInfoPicList=homeInfoPicRepository.findALLByHomeInfoPicId(homeInfoPicId);
            if(homeInfoPicList.size()<=0){
                appResponse.setResultStatus(true);
                appResponse.setResultCode(AppResponseConstant.DATA_EMPTY);
                appResponse.setResultMessage(AppResponseConstant.DATA_EMPTY_MSG);
                appResponse.setResultData(null);
                appResponse.setExtendField(null);
            }else{
                appResponse.setResultStatus(true);
                appResponse.setResultCode(AppResponseConstant.OK_SUCCESS);
                appResponse.setResultMessage("获取房子图片信息列表成功!");
                appResponse.setResultData(homeInfoPicList);
                appResponse.setExtendField(null);
            }
        } catch (Exception e) {
            logger.error(e.toString());
            appResponse.setResultStatus(true);
            appResponse.setResultCode(AppResponseConstant.SERVER_EXCEPTION);
            appResponse.setResultMessage(AppResponseConstant.SERVER_EXCEPTION_MSG);
            appResponse.setResultData(null);
            appResponse.setExtendField(null);
        }
        return appResponse;
    }
}
