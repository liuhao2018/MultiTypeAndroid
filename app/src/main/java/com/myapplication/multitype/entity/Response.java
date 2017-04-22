package com.myapplication.multitype.entity;

import java.util.List;

/**
 * Created by liuhao on 2017/4/21.
 */

public class Response {
    public Banner banner;
    public Desc desc;
    public List<Item> items;
    public List<Detail> details;
    public List<Ticket> tickets;
    public List<Recommend> recommends;

    public Response(Banner banner, Desc desc, List<Item> items,List<Detail> details, List<Ticket> tickets, List<Recommend> recommends) {
        this.banner = banner;
        this.desc = desc;
        this.items = items;
        this.details = details;
        this.tickets = tickets;
        this.recommends = recommends;
    }
}
