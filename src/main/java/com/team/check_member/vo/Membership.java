package com.team.check_member.vo;

import java.time.LocalDateTime;

public class Membership {
    private String mssv;
    private String name;
    private String role;
    private LocalDateTime timeJoin;

    public Membership(){
        this.timeJoin = LocalDateTime.now();
    }

    public Membership(String mssv, String name, String role) {
        this.mssv = mssv;
        this.name = name;
        this.role = role;
    }

    public String getMssv() {
        return mssv;
    }

    public void setMssv(String mssv) {
        this.mssv = mssv;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public LocalDateTime getTimeJoin() {
        return timeJoin;
    }

    public void setTimeJoin(LocalDateTime timeJoin) {
        this.timeJoin = LocalDateTime.now();
    }
}
