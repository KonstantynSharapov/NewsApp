package com.makenews.view;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.makenews.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainNewsActivity extends AppCompatActivity {
    @BindView(R.id.vp_news_list)
    ViewPager vpNewsList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        vpNewsList.setAdapter(new ContentAdapter(getSupportFragmentManager()));
    }


}
