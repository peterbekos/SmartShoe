package com.peterbekos.smartshoe;

import java.util.Date;

/**
 * Created by peterbekos on 4/29/15.
 */
public class PressureDataPoint {

    public static final int MAX_VALUE = 0;
    public static final int MIN_VALUE = 1024;

    public static final int LEFT_HEEL = 0;
    public static final int LEFT_ARCH = 1;
    public static final int LEFT_PRON = 2; //inside
    public static final int LEFT_SUPA = 3; //outside
    public static final int LEFT_TOE = 4;

    public static final int RIGHT_HEEL = 5;
    public static final int RIGHT_ARCH = 6;
    public static final int RIGHT_PRON = 7; //inside
    public static final int RIGHT_SUPA = 8; //outside
    public static final int RIGHT_TOE = 9;

    private int value;
    private Date time;
    private int position;

    public PressureDataPoint() {

    }
}
