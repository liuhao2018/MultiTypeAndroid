package com.myapplication.multitype.entity;

/**
 * Created by liuhao on 2017/4/21.
 */

public class Recommend {
    public int img;
    public String name;
    public String address;
    public String status;
    public String price;

    public Recommend(int img, String name, String address, String status, String price) {
        this.img = img;
        this.name = name;
        this.address = address;
        this.status = status;
        this.price = price;
    }
}
