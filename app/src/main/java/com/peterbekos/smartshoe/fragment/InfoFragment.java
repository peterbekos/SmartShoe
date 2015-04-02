package com.peterbekos.smartshoe.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.peterbekos.smartshoe.R;
import com.peterbekos.smartshoe.adapter.InfoPagerAdapter;

/**
 * Created by peterbekos on 3/23/15.
 */
public class InfoFragment extends BaseFragment
{
    public static final String SECTION_NAME = "Information";

    @Override
    public String getSectionName() {
        return SECTION_NAME;
    }

    public static InfoFragment newInstance() {
        InfoFragment fragment = new InfoFragment();
        return fragment;
    }

    public InfoFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_info, container, false);

        ViewPager viewPager = (ViewPager) rootView.findViewById(R.id.info_pager);
        viewPager.setAdapter(new InfoPagerAdapter(getFragmentManager()));

        return rootView;
    }


}