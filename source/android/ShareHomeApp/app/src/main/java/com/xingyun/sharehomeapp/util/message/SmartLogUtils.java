package com.xingyun.sharehomeapp.util.message;

import android.util.Log;

public class SmartLogUtils {

    private final static String DEBUG_TAG="xingyun";
    /***
     * 封装日志打印方法
     * @param  message 打印的消息
     * @param  showMessage 是否显示打印的消息
     * **/
    public static void debugInformation(String message,Boolean showMessage){
        if(showMessage){
            int max_str_length = 2001 - DEBUG_TAG.length();
            //大于4000时
            while (message.length() > max_str_length) {
                Log.e(DEBUG_TAG, message.substring(0, max_str_length));
                message = message.substring(max_str_length);
            }
            //剩余部分
            Log.e(DEBUG_TAG,message);
        }
    }
}
