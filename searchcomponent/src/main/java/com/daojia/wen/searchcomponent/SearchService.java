package com.daojia.wen.searchcomponent;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

import com.daojia.wen.componentlib.service.ISearchService;

public class SearchService implements ISearchService {
    @Override
    public void launch(Context context, String targetClass) {

    }

    @Override
    public Fragment newSearchFragment(FragmentManager fragmentManager, int viewId, Bundle bundle) {
        return null;
    }
}
