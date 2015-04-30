package com.peterbekos.smartshoe;

/**
 * Created by peterbekos on 4/29/15.
 */
public class Data {

    private int steps = 0;
    private int calories = 0;
    private float distance = 0;
    private float runTime = 0;
    private float idleTime = 0;


    public Data() {

    }

    public int getSteps() {
        return steps;
    }

    public void setSteps(int steps) {
        this.steps = steps;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public float getDistance() {
        return distance;
    }

    public void setDistance(float distance) {
        this.distance = distance;
    }

    public float getRunTime() {
        return runTime;
    }

    public void setRunTime(float runTime) {
        this.runTime = runTime;
    }

    public float getIdleTime() {
        return idleTime;
    }

    public void setIdleTime(float idleTime) {
        this.idleTime = idleTime;
    }

}
