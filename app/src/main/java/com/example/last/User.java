package com.example.last;

import com.google.firebase.database.IgnoreExtraProperties;

@IgnoreExtraProperties
public class User {

    public String item;
    public String name;
    public int lostnum;

    public User(String s) {
        // Default constructor required for calls to DataSnapshot.getValue(User.class)
    }

    public User(String item, String name, int lostnum) {
        this.item = item;
        this.name = name;
        this.lostnum = lostnum;
    }

    public String getUserName() {
        return item;
    }

    public void setUserName(String item) {
        this.item = item;
    }

    public String getEmail() {
        return name;
    }

    public void setEmail(String name) {
        this.name = name;
    }

    public int getLostnum() {
        return lostnum;
    }
    public void setLostnum(int lostnum){
        this.lostnum = lostnum;
    }

    @Override
    public String toString() {
        return "User{" +
                "item='" + item + '\'' +
                ", name='" + name + '\'' +

                '}';
    }
}