package com.peterbekos.smartshoe;

import com.peterbekos.smartshoe.fragment.BaseFragment;
import com.peterbekos.smartshoe.fragment.DemoFragment;
import com.peterbekos.smartshoe.fragment.HomeFragment;
import com.peterbekos.smartshoe.fragment.InfoFragment;
import com.peterbekos.smartshoe.fragment.RunFragment;
import com.peterbekos.smartshoe.fragment.SettingsFragment;
import com.peterbekos.smartshoe.fragment.StatsFragment;
import com.peterbekos.smartshoe.fragment.TestFragment;
import com.peterbekos.smartshoe.fragment.UserModeFragment;

/**
 * Created by peterbekos on 3/9/15.
 */
public enum App {

    INSTANCE;

    public static String[] navDrawerSections = new String[] {
            HomeFragment.SECTION_NAME,
            UserModeFragment.SECTION_NAME,
            RunFragment.SECTION_NAME,
            TestFragment.SECTION_NAME,
            StatsFragment.SECTION_NAME,
            DemoFragment.SECTION_NAME,
            InfoFragment.SECTION_NAME,
            SettingsFragment.SECTION_NAME,
    };

}

/*
public enum SingletonName {
>INSTANCE;
>private static var name;
>public static void setter(var) {
>>SingletonName.name = var
>}
}
 */