package com.example.layoutdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        setContentView(R.layout.book_layout);
//        // 1.根布局为线性布局
//        LinearLayout ll = new LinearLayout(this);
//        // 2.设置宽高(和屏幕一样大)                                               匹配父容器
//        ll.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
//                ViewGroup.LayoutParams.MATCH_PARENT));
//        // 3.设置背景颜色为红色
//        ll.setBackgroundColor(Color.RED);
//        // 4.指定此Activity的内容视图为该线性布局
//        setContentView(ll);
    }
}
