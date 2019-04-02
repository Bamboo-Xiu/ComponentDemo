package com.daojia.wen.componentlib.service;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

/**
 * @author wenjinchao
 * @version 1.0.0
 * @description
 * @date 2019/4/2.
 */
public interface IMineService {

    void launch(Context context, String targetClass);

    Fragment newUserFragment(FragmentManager fragmentManager, int viewId, Bundle bundle);
}
