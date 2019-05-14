package com.daojia.wen.searchcomponent;

import android.app.Application;

/**
 * @author wenjinchao
 * @version 1.0.0
 * @description
 * @date 2019/05/14.
 */
public class SearchApplication extends Application {

    private static Application application;

    public static Application getApplication(){
        return application;
    }

    @Override
    public void onCreate() {
        super.onCreate();
    }
}
