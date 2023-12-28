package com.team.check_member.controller;

import com.team.check_member.service.MemberManagerService;
import com.team.check_member.vo.Membership;
import org.apache.ibatis.annotations.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class ViewMember {
    private MemberManagerService memberManagerService;

    public ViewMember(MemberManagerService memberManagerService){
        this.memberManagerService = memberManagerService;
    }


    @GetMapping(value = "/View_Members")
    public String getMemberList(Model model){
        List<Membership> members = memberManagerService.getMembers();

        model.addAttribute("members", members);

        return "viewMember";
    }

    @GetMapping(value = "/Admin_View")
    public String getMemberstAsAdmin(Model model){
        List<Membership> members = memberManagerService.getMembers();

        model.addAttribute("members", members);

        return "adminView";
    }






}
