package com.xingyun.sharehomeapp.util.message;

import android.content.Context;
import android.widget.Toast;

/**
 * Toast 弹出信息工具类,简化代码编写
 * */
public class SmartToastUtils {
        public static void showLong(Context context, String info) {
            Toast.makeText(context, info, Toast.LENGTH_LONG).show();
        }
        public static void showShort(Context context,String info) {
            Toast.makeText(context, info,Toast.LENGTH_SHORT).show();
        }
}
