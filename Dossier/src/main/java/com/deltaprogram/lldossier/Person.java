package com.deltaprogram.lldossier;

/**
 * Created by realityexpander on 8/7/13.
 */
public class Person {

    private String mFirstName = "unknown";
    private String mLastName = "unknown";
    private int mNumApps = 0;
    private int mAge = 0;
    private String mFavoriteApp = "unknown";
    private String mPrevExperience = "unknown";

    public int getmAge() {
        return mAge;
    }

    public void setmAge(int mAge) {
        this.mAge = mAge;
    }

    public String getmFavoriteApp() {
        return mFavoriteApp;
    }

    public void setmFavoriteApp(String mFavoriteApp) {
        this.mFavoriteApp = mFavoriteApp;
    }

    public String getmPrevExperience() {
        return mPrevExperience;
    }

    public void setmPrevExperience(String mPrevExperience) {
        this.mPrevExperience = mPrevExperience;
    }

    public Person(String mFirstName, String mLastName) {
        this.mFirstName = mFirstName;
        this.mLastName = mLastName;
    }

    public String getmFirstName() {
        return mFirstName;
    }

    public void setmFirstName(String mFirstName) {
        this.mFirstName = mFirstName;
    }

    public String getmLastName() {
        return mLastName;
    }

    public void setmLastName(String mLastName) {
        this.mLastName = mLastName;
    }

    public int getmNumApps() {
        return mNumApps;
    }

    public void setmNumApps(int mNumApps) {
        this.mNumApps = mNumApps;
    }
}
