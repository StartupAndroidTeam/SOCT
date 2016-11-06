package com.volkov.soct.server.model;

/**
 * Created by WoLf on 18.10.2016.
 */
public class User {

    private int mId;
    private String mName;
    private String mPosition;
    private int mTotalRepair;
    private int mTotalRecharge;
    private String mPrinter;

    public User(){

    }

    public User(String name, String position, int totalRepair, int totalRecharge, String printer) {
        this.mName = name;
        this.mPosition = position;
        this.mTotalRepair = totalRepair;
        this.mTotalRecharge = totalRecharge;
        this.mPrinter = printer;
    }

    public User(int id, String name, String position, int totalRepair, int totalRecharge, String printer) {
        this.mId = id;
        this.mName = name;
        this.mPosition = position;
        this.mTotalRepair = totalRepair;
        this.mTotalRecharge = totalRecharge;
        this.mPrinter = printer;
    }

    public int getmId() {
        return mId;
    }

    public void setmId(int id) {
        this.mId = id;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String name) {
        this.mName = name;
    }

    public String getmPosition() {
        return mPosition;
    }

    public void setmPosition(String position) {
        this.mPosition = position;
    }

    public int getmTotalRepair() {
        return mTotalRepair;
    }

    public void setmTotalRepair(int totalRepair) {
        this.mTotalRepair = totalRepair;
    }

    public int getmTotalRecharge() {
        return mTotalRecharge;
    }

    public void setmTotalRecharge(int totalRecharge) {
        this.mTotalRecharge = totalRecharge;
    }

    public String getmPrinter() {
        return mPrinter;
    }

    public void setmPrinter(String printer) {
        this.mPrinter = printer;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ", " + "id: " + mId
                + ", name: " + mName + ", Position: " + mPosition
                + ", Total repair: " + mTotalRepair + ", Total recharge: "
                + mTotalRecharge + ", printer: " + mPrinter;
    }
}
