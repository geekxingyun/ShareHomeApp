package com.xingyun.sharehomeapp.constant;

public class AppResponseConstant {

    public final static Integer  OK_SUCCESS=200;//响应成功
    public final static String  OK_SUCCESS_MSG= "响应成功";

    public final static Integer  DATA_EMPTY=204;//响应成功,但是数据为空
    public final static String  DATA_EMPTY_MSG="响应成功,但是数据为空";//响应成功,但是数据为空

    public final static Integer  PARAMS_INVALID=400;//参数错误
    public final static String  PARAMS_INVALID_MSG="参数出错";//参数错误

    public final static Integer  FORBIDDEN=403;//无权限
    public final static String  FORBIDDEN_MSG="无权限";//无权限

    public final static Integer NOT_FOUND=404;//找不到
    public final static String NOT_FOUND_MSG="找不到";//找不到

    public final static Integer SERVER_EXCEPTION=500;//服务器内部错误
    public final static String SERVER_EXCEPTION_MSG="服务器内部错误";//服务器内部错误

    public final static Integer SERVER_UNAVAILABLE=503;//服务器已关闭
    public final static String SERVER_UNAVAILABLE_MSG="服务器无响应";//服务器已关闭

}
