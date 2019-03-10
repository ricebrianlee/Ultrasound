package com.example.ultrasound.items;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.ultrasound.ItemListFragment;

public class MainTabFragmentPagerAdapter extends FragmentPagerAdapter {

    private static final int NUM_TABS = 3;
    private static final String[] TAB_TITLES = new String[] {"1", "2", "3"};
    private Context context;

    public MainTabFragmentPagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int i) {
        return ItemListFragment.newInstance(i);
    }

    @Override
    public int getCount() {
        return NUM_TABS;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return TAB_TITLES[position];
    }
}
