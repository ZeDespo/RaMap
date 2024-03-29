package com.example.ramap.adapter;

import tabs.InfoFragment;
import tabs.TwitterFragment;
import tabs.FlickrFragment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Joe's Desktop on 12/14/2014.
 */
public class TabsPagerAdapter  extends FragmentPagerAdapter{
    public TabsPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int index) {

        switch (index) {
            case 0:
                // Top Rated fragment activity
                return new FlickrFragment();
            case 1:
                // Games fragment activity
                return new InfoFragment();
            case 2:
                // Movies fragment activity
                return new TwitterFragment();
        }

        return null;
    }

    @Override
    public int getCount() {
        // get item count - equal to number of tabs
        return 3;
    }


}
