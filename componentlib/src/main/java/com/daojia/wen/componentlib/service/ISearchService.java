package com.daojia.wen.componentlib.service;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

/**
 * @author
 * @version
 * @description
 * @date 2019/4/22.
 */
public interface ISearchService {

    void launch(Context context, String targetClass);

    Fragment newSearchFragment(FragmentManager fragmentManager, int viewId, Bundle bundle);

}
