package com.simpleprogrammer;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by lenovo on 01/10/2014.
 */
public class User {
    private int id;
    private String name;
    private ProtinData protinData = new ProtinData();

    private Set<UserHistory> histories = new HashSet<UserHistory>();

    public Set<UserHistory> getHistories() {
        return histories;
    }

    public void setHistories(Set<UserHistory> histories) {
        this.histories = histories;
    }

    public ProtinData getProtinData() {
        return protinData;
    }

    public void setProtinData(ProtinData protinData) {
        this.protinData = protinData;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
