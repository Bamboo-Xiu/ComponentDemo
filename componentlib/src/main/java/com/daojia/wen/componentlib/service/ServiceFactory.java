package com.daojia.wen.componentlib.service;

/**
 * @author wenjinchao
 * @version 1.0.0
 * @description
 * @date 2019/4/2.
 */
public class ServiceFactory {
    private static final ServiceFactory instance = new ServiceFactory();

    public static ServiceFactory getInstance(){
        return instance;
    }

    private ServiceFactory(){}

    private IFindService mFindService;
    private IMineService mMineService;

    public IFindService getmFindService() {
        if(mFindService == null){
            mFindService = new EmptyFindService();
        }
        return mFindService;
    }

    public void setmFindService(IFindService mFindService) {
        this.mFindService = mFindService;
    }

    public IMineService getmMineService() {
        if(mMineService == null){
            mMineService = new EmptyMineService();
        }
        return mMineService;
    }

    public void setmMineService(IMineService mMineService) {
        this.mMineService = mMineService;
    }
}
