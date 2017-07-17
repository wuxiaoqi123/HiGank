package com.tlkg.welcome.higank.app;

/**
 * Created by wuxiaoqi on 2017/7/11.
 */

public class MyApp extends BaseApplication {

    private static MyApp hiGankApplication;

    @Override
    public void onCreate() {
        super.onCreate();
        hiGankApplication = this;
    }

    public static MyApp getInstance() {
        return hiGankApplication;
    }
}
