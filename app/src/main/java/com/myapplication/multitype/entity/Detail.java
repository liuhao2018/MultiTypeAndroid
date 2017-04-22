package com.myapplication.multitype.entity;

/**
 * Created by liuhao on 2017/4/21.
 */

public class Detail {
    public String name;
    public String content;
    public int img;

    public Detail() {
    }

    public Detail(int img,String name, String content) {
        this.img = img;
        this.name = name;
        this.content = content;
    }
}
