package com.simpleprogrammer;

import java.util.Date;

/**
 * Created by lenovo on 01/10/2014.
 */
public class UserHistory {

    private Date entryTime;
    private String entry;

    public UserHistory() {
    }

    public UserHistory(Date entryTime, String entry) {
        this.entryTime = entryTime;
        this.entry = entry;
    }

    public Date getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(Date entryTime) {
        this.entryTime = entryTime;
    }

    public String getEntry() {
        return entry;
    }

    public void setEntry(String entry) {
        this.entry = entry;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserHistory that = (UserHistory) o;

        if (!entry.equals(that.entry)) return false;
        if (!entryTime.equals(that.entryTime)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = entryTime.hashCode();
        result = 31 * result + entry.hashCode();
        return result;
    }
}
