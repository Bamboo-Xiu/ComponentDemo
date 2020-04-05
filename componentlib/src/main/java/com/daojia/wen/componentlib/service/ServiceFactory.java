package com.daojia.wen.componentlib.service;

/**
 * @author xiuzhizhu
 * @version 1.0.0
 * @description
 * @date 2019/4/2.
 */
public class ServiceFactory {
    private static final ServiceFactory instance = new ServiceFactory();

    public static ServiceFactory getInstance(){
        return instance;
    }

    private IFindService mFindService;
    private IMineService mMineService;
    private ISearchService mSearchService;

    public ISearchService getmSearchService() {
        if(mSearchService == null){
            mSearchService = new EmptySearchService();
        }
        return mSearchService;
    }

    public void setmSearchService(ISearchService mSearchService) {
        this.mSearchService = mSearchService;
    }

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
