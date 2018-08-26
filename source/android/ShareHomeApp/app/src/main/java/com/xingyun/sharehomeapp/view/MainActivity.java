package com.xingyun.sharehomeapp.view;

import android.os.Bundle;

import com.xingyun.sharehomeapp.R;
import com.xingyun.sharehomeapp.custom.BottomBar;
import com.xingyun.sharehomeapp.custom.SmartBaseActivity;
import com.xingyun.sharehomeapp.view.fragment.ChatLifeFragment;
import com.xingyun.sharehomeapp.view.fragment.HomeFragment;
import com.xingyun.sharehomeapp.view.fragment.FindJobFragment;
import com.xingyun.sharehomeapp.view.fragment.PersonCenterFragment;

public class MainActivity extends SmartBaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomBar bottomBar = findViewById(R.id.common_bottom_bar);
        bottomBar.setContainer(R.id.common_container)
                .setTitleBeforeAndAfterColor("#515151","#1890ff")
                .addItem(HomeFragment.class,
                        "租个家",
                        R.drawable.bottom_home_normal,
                        R.drawable.bottom_home_press)
                .addItem(FindJobFragment.class,
                        "找工作",
                        R.drawable.bottom_find_job_normal,
                        R.drawable.bottom_find_job_press)
                .addItem(ChatLifeFragment.class,
                        "交朋友",
                        R.drawable.bottom_chat_life_normal,
                        R.drawable.bottom_chat_life_press)
                .addItem(PersonCenterFragment.class,
                        "我的",
                        R.drawable.bottom_person_center_normal,
                        R.drawable.bottom_person_center_press)
                .build();
    }
}
