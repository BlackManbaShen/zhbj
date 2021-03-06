package com.example.liang.zhbj74.base.impl;

import android.app.Activity;
import android.graphics.Color;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;

import com.example.liang.zhbj74.base.BasePager;

//首页
public class GovAffairsPager extends BasePager {
    public GovAffairsPager(Activity activity) {
        super(activity);
    }

    @Override
    public void initData() {
        //要给帧布局填充布局对象
        TextView view=new TextView(mActivity);
        view.setText("政府");
        view.setTextColor(Color.RED);
        view.setTextSize(22);
        view.setGravity(Gravity.CENTER);
        fl_content.addView(view);
        tvTitle.setText("人口管理");
        btnMenu.setVisibility(View.VISIBLE);
    }
}
