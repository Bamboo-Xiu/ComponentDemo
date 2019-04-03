package com.daojia.wen.findcomponent;

import android.content.Context;
import android.content.Intent;

import com.daojia.wen.componentlib.service.IFindService;

/**
 * @author wenjinchao
 * @version 1.0.0
 * @description
 * @date 2019/4/2.
 */
public class FindService implements IFindService {
    @Override
    public void launch(Context context, String targetClass) {
        Intent intent = new Intent(context,FindActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(intent);
    }
}
