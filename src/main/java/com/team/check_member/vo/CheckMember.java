package com.team.check_member.vo;

import java.util.Date;

public class CheckMember {

    Membership membership;
    Date timeCheck;
    boolean checkCome;


    public CheckMember(Membership membership, Date timeCheck, boolean checkCome) {
        this.membership = membership;
        this.timeCheck = timeCheck;
        this.checkCome = checkCome;
    }


    public Membership getMembership() {
        return membership;
    }

    public void setMembership(Membership membership) {
        this.membership = membership;
    }

    public Date getTimeCheck() {
        return timeCheck;
    }

    public void setTimeCheck(Date timeCheck) {
        this.timeCheck = timeCheck;
    }

    public boolean isCheck() {
        return checkCome;
    }

    public void setCheck(boolean checkCome) {
        this.checkCome = checkCome;
    }


}
