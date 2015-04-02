package com.peterbekos.smartshoe.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.PagerAdapter;

import com.peterbekos.smartshoe.fragment.InfoTest1Fragment;
import com.peterbekos.smartshoe.fragment.InfoTest2Fragment;
import com.peterbekos.smartshoe.fragment.InfoTest3Fragment;

/**
 * Created by peterbekos on 3/24/15.
 */
public class InfoPagerAdapter extends FragmentStatePagerAdapter {

    public InfoPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        switch (i){
            case 0:
                return new InfoTest1Fragment();
            case 1:
                return new InfoTest2Fragment();
            case 2:
                return new InfoTest3Fragment();
        }


        return null;
    }

    @Override
    public int getCount() {
        return 3;
    }
}
