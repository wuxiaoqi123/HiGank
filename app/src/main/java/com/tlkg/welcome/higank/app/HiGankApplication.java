package com.tlkg.welcome.higank.app;

import android.app.Application;

/**
 * Created by wuxiaoqi on 2017/7/11.
 */

public class HiGankApplication extends BaseApplication {

    private static HiGankApplication hiGankApplication;

    @Override
    public void onCreate() {
        super.onCreate();
        hiGankApplication = this;
    }

    public static HiGankApplication getInstance() {
        return hiGankApplication;
    }
}
