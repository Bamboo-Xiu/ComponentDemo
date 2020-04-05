package com.daojia.wen.componentdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.daojia.wen.componentlib.service.ServiceFactory;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn_go_find).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 去“发现”组件
                ServiceFactory.getInstance().getmFindService().launch(MainActivity.this, "");
            }
        });

        findViewById(R.id.btn_go_mine).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 去“我的”组件
                ServiceFactory.getInstance().getmMineService().launch(MainActivity.this,"");
            }
        });

        findViewById(R.id.btn_showMineUI).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 去“我的”组件中的 UI 页面
                Bundle bundle = new Bundle();
                ServiceFactory.getInstance().getmMineService().newUserFragment(getSupportFragmentManager(),
                        R.id.container,bundle);
            }
        });

        findViewById(R.id.btn_go_search).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 去“查找”组件
                ServiceFactory.getInstance().getmSearchService().launch(MainActivity.this,"");
            }
        });

        findViewById(R.id.btn_showSearchUI).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 去"查找"组件中的 UI 页面
                Bundle bundle = new Bundle();
                ServiceFactory.getInstance().getmSearchService().newSearchFragment(getSupportFragmentManager(),
                        R.id.container,bundle);
            }
        });
    }
}
