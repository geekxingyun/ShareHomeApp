package com.xingyun.sharehomeapp.util.activity;

import android.app.Activity;

import java.util.ArrayList;
import java.util.List;

/**
 * @author  fairy
 * @author  http://www.520geek.cn
 * 一键退出App工具类
 * 使用方法：ActivityCollector.finishAll();
 * **/
public class ActivityCollector {

    public static List<Activity> activityList=new ArrayList<>();

    public static void addActivity(Activity activity){
        // 为了避免重复添加，需要判断当前集合是否满足不存在该Activity
        if (!activityList.contains(activity)) {
            activityList.add(activity); // 把当前Activity添加到集合中
        }
    }

    public static void removeActivity(Activity activity){
        // 判断当前集合是否存在该Activity
        if (activityList.contains(activity)) {
            activityList.remove(activity); // 从集合中移除
            if (activity != null){
                activity.finish(); // 销毁当前Activity
            }
        }
    }

    public static void finishAll(){
        // 通过循环，把集合中的所有Activity销毁
        for (Activity activity : activityList) {
            if (activity != null){
                activity.finish();
            }
        }
        //杀死该应用进程
        android.os.Process.killProcess(android.os.Process.myPid());
    }
}
