package com.team.check_member.mapper;

import com.team.check_member.vo.Membership;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface MapperMember {
    void save(@Param("members")Membership membership);

    List<Membership> findAll();

    void deleteMember(String mssv);


}
