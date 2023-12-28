package com.team.check_member.controller;

import com.team.check_member.service.MemberManagerService;
import com.team.check_member.vo.Membership;
import org.springframework.web.bind.annotation.*;

@RestController
public class setMember {
    private final MemberManagerService memberManagerService;

    public setMember(MemberManagerService memberManagerService){
        this.memberManagerService = memberManagerService;
    }

    @PostMapping(value = "/Admin_View")
    @ResponseBody
    public String addMember(@RequestParam(name = "mssv") String mssv,
                                @RequestParam(name = "name") String name,
                                @RequestParam(name = "role") String role){
        Membership newMember = memberManagerService.addMember(mssv, name, role);
//        return newMember;
        return "<script>window.location.href = '/Admin_View';</script>";
    }

    @DeleteMapping(value = "/Admin_View/{mssv}")
    @ResponseBody
    public String deleteMember(@PathVariable("mssv") String mssv){
        memberManagerService.deleteMember(mssv);
        return "<script>window.location.href = '/Admin_View';</script>";
    }
}
