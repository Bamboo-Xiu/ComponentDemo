package com.daojia.wen.findcomponent;

import android.app.Application;

import com.daojia.wen.componentlib.service.IComponentApp;
import com.daojia.wen.componentlib.service.ServiceFactory;

/**
 * @author wenjinchao
 * @version 1.0.0
 * @description
 * @date 2019/4/2.
 */
public class FindApplication extends Application implements IComponentApp {

    private static Application application;

    public static Application getApplication(){
        return application;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        initialize(this);
    }

    @Override
    public void initialize(Application app) {
        application = app;
        ServiceFactory.getInstance().setmFindService(new FindService());
    }
}
