package com.daojia.wen.searchcomponent;

import android.app.Application;

import com.daojia.wen.componentlib.service.IComponentApp;
import com.daojia.wen.componentlib.service.ServiceFactory;

/**
 * @author wenjinchao
 * @version 1.0.0
 * @description
 * @date 2019/05/14.
 */
public class SearchApplication extends Application implements IComponentApp {

    private static Application application;

    @Override
    public void initialize(Application app) {
        application = app;
        ServiceFactory.getInstance().setmSearchService(new SearchService());
    }

    public static Application getApplication(){
        return application;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        initialize(this);
    }
}
