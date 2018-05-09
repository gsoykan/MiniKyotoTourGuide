package com.bucketsoft.user.project5tourguideapp;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class AttractionFragmentPagerAdapter extends FragmentPagerAdapter {

    private Context mContext;

    public AttractionFragmentPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {

        if (position == 0) {
            return new AttractionFragment();
        } else if (position == 1) {
            return new FoodFragment();
        } else if (position == 2) {
            return new MuseumFragment();
        } else {
            return new CherryFragment();
        }

    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.attraction_attraction_tab_text);
        } else if (position == 1) {
            return mContext.getString(R.string.attraction_food_tab_text);
        } else if (position == 2) {
            return mContext.getString(R.string.attraction_museum_tab_text);
        } else {
            return mContext.getString(R.string.attraction_cherry_tab_text);
        }
    }
}
