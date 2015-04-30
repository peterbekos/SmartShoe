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

    public static Data data = new Data();
    public static Settings settings = new Settings();

    public static float getStepProgress() {
        return 100 * (float)data.getSteps() / (float)settings.getStepGoal();
    }
    public static float getCaloriesProgress() {
        return 100 *  (float)App.data.getCalories() / (float)App.settings.getCalorieGoal();
    }
    public static float getDistanceProgress() {
        return 100 * App.data.getDistance() / App.settings.getDistanceGoal();
    }
    public static float getRunProgress() {
        return 100 * App.data.getRunTime() / App.settings.getRunGoal();
    }
    public static float getIdleProgress() {
        return 100 - (100 * App.data.getIdleTime() / App.settings.getIdleGoal());
    }

}