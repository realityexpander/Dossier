package com.deltaprogram.lldossier;

/**
 * Created by realityexpander on 8/18/13.
 */
public class AppsIHaveMade {
    private String mAppName;
    private String mAppDescription;
    private String mAPKName;
    private String mAPKClassName;

    public AppsIHaveMade ( String startAppName, String startDescription, String startAPKName, String startAPKClassName) {
        this.mAppName = startAppName;
        this.mAppDescription = startDescription;
        this.mAPKName = startAPKName;
        this.mAPKClassName = startAPKClassName;
    }

    public String getmAppDescription() {
        return mAppDescription;
    }

    public void setmAppDescription(String mAppDescription) {
        this.mAppDescription = mAppDescription;
    }

    public String getmAppName() {
        return mAppName;
    }

    public void setmAppName(String mAppName) {
        this.mAppName = mAppName;
    }

    public String getmAPKName() {
        return mAPKName;
    }

    public void setmAPKName(String mAPKName) {
        this.mAPKName = mAPKName;
    }

    public String getmAPKClassName() {
        return mAPKClassName;
    }

    public void setmAPKClassName(String mAPKClassName) {
        this.mAPKClassName = mAPKClassName;
    }
}
