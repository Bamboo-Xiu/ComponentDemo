package com.daojia.wen.minecomponent;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

import com.daojia.wen.componentlib.service.IMineService;

/**
 * @author
 * @version 2.6.0
 * @description
 * @date 2019/4/2.
 */
public class MineService implements IMineService {
    @Override
    public void launch(Context context, String targetClass) {
        Intent intent = new Intent(context,MineActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(intent);
    }

    @Override
    public Fragment newUserFragment(FragmentManager fragmentManager, int viewId, Bundle bundle) {
        UserInfoFragment fragment = new UserInfoFragment();
        fragment.setArguments(bundle);
        fragmentManager.beginTransaction().add(viewId,fragment).commit();
        return fragment;
    }
}
