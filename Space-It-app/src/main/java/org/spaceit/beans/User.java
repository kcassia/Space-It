package org.spaceit.beans;

/**
 * Created by gkstn_000 on 2015-11-21.
 */


public class User {

    private String gender =null;

    private String time=null;

    private String addr=null;


    public User(){

    }
    public User(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }
}