package com.daojia.wen.searchcomponent;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

import com.daojia.wen.componentlib.service.ISearchService;

public class SearchService implements ISearchService {
    @Override
    public void launch(Context context, String targetClass) {
        Intent intent = new Intent(context, searchActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(intent);
    }

    @Override
    public Fragment newSearchFragment(FragmentManager fragmentManager, int viewId, Bundle bundle) {
        SearchFragment searchFragment = new SearchFragment();
        searchFragment.setArguments(bundle);
        fragmentManager.beginTransaction().add(viewId,searchFragment).commit();
        return searchFragment;
    }
}
