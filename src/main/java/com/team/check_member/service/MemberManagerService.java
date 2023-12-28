package com.team.check_member.service;


import com.team.check_member.mapper.MapperMember;
import com.team.check_member.vo.Membership;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class MemberManagerService {
    private MapperMember mapperMember;



    public MemberManagerService(MapperMember mapperMember){
        this.mapperMember = mapperMember;

    }

    public Membership addMember(String mssv, String name, String role){
        Membership newMember = new Membership(mssv, name, role);
        newMember.setTimeJoin(LocalDateTime.now());



        mapperMember.save(newMember);
        return newMember;
    }

    public List<Membership> getMembers(){
        return mapperMember.findAll();
    }

    public void deleteMember(String mssv){
        mapperMember.deleteMember(mssv);
    }

}
