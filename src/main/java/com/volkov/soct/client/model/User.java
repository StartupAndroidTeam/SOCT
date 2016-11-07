package com.volkov.soct.client.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by WoLf on 07.11.2016.
 */
public class User {

    public String printer;
    public String name;
    public int id;
    public String position;
    public int totalRecharge;
    public int totalRepair;

    public String getPrinter() {
        return printer;
    }

    public void setPrinter(String printer) {
        this.printer = printer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getTotalRecharge() {
        return totalRecharge;
    }

    public void setTotalRecharge(int totalRecharge) {
        this.totalRecharge = totalRecharge;
    }

    public int getTotalRepair() {
        return totalRepair;
    }

    public void setTotalRepair(int totalRepair) {
        this.totalRepair = totalRepair;
    }
}
