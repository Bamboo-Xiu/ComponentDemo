package com.daojia.wen.componentdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn_go_find).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 去“发现”组件
            }
        });

        findViewById(R.id.btn_go_mine).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 去“我的”组件

            }
        });

        findViewById(R.id.btn_showUI).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 去“我的”组件中的 UI 页面

            }
        });
    }
}
