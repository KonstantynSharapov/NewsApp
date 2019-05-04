package com.makenews.view;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;

public class ContentAdapter extends FragmentPagerAdapter {
    public ContentAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        return ContentNews.newInstance(i);
    }

    @Override
    public int getCount() {
        return 10;
    }
}
