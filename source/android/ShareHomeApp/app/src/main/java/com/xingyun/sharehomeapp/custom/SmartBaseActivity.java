package com.xingyun.sharehomeapp.custom;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import com.xingyun.sharehomeapp.util.activity.ActivityCollector;

/**
 * 定义此类是为了随时随地知道当前是哪个Activity
 * ***/
public class SmartBaseActivity extends AppCompatActivity{

    private final static String SMART_BASE_ACTIVITY="SmartBaseActivity";
    /**
     * @Nullable 参数可为null
     * 如果可以传入NUll值，则标记为@Nullbale，如果不可以则标注为@Nonnull
     * */
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(SMART_BASE_ACTIVITY,getClass().getSimpleName());
        ActivityCollector.addActivity(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ActivityCollector.removeActivity(this);
    }

    /***
     * 重启应用程序
     * */
    protected void restartApplication() {
        final Intent intent = getPackageManager().getLaunchIntentForPackage(getPackageName());
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
    }
}
