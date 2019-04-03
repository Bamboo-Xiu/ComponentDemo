package com.daojia.wen.componentdemo;

import android.app.Application;

import com.daojia.wen.componentlib.service.AppConfig;
import com.daojia.wen.componentlib.service.IComponentApp;

/**
 * @author wenjinchao
 * @version 1.0.0
 * @description
 * @date 2019/4/2.
 */
public class MainApplication extends Application implements IComponentApp {

    private static Application application;

    public static Application getApplication(){
        return application;
    }

    @Override
    public void initialize(Application application) {
        for(String component: AppConfig.COMPONENTS){
            try{
                // 通过配置文件中的 Application 的路径，实例化，并将 MainApp 的 Application 对象传过去
                Class<?> clazz = Class.forName(component);
                Object object = clazz.newInstance();
                if(object instanceof IComponentApp){
                    ((IComponentApp)object).initialize(this);
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }

    @Override
    public void onCreate() {
        super.onCreate();
        initialize(this);
    }
}
