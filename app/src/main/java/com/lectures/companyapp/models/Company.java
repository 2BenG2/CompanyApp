package com.lectures.companyapp.models;

import java.io.Serializable;
import java.util.HashMap;

public class Company implements Serializable {
    private String name;
    private String date;
    private int imdId;
    private int companyId;
    private String info;

    public Company(String name, String date, int imdId, int companyId, String info) {
        this.name = name;
        this.date = date;
        this.imdId = imdId;
        this.companyId = companyId;
        this.info = info;
    }

    public String getInfo() {
        return info;
    }

    public int getCompanyId() {
        return companyId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setImdId(int imdId) {
        this.imdId = imdId;
    }

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }

    public int getImdId() {
        return imdId;
    }

}
