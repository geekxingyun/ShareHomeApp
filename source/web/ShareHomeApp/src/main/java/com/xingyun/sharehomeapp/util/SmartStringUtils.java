package com.xingyun.sharehomeapp.util;

public class SmartStringUtils {

    /**
     * 检查字符串是否为空
     * @param  checkString
     * @return  boolean true: 字符串不为空  false:字符串为空
     * */
    public static Boolean checkStringEmpty(String checkString){
        if(checkString==null||"".equals(checkString)||checkString.isEmpty()){
            return true;
        }else{
            return false;
        }
    }


}
