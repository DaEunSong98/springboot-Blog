package com.page.demo.member.dao;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import com.page.demo.member.dto.MemberDTO;

@Repository
@Mapper
public interface MemberMappers {
	
	@Insert("insert into member values(num_seq.nextval, #{id}, #{pw}, #{name}, #{email}, #{address}, #{mobile})") 
	void insert(MemberDTO dto);

	@Select("select * from member where id=#{id}")
	MemberDTO selectId(String id);

	@Update("update member set pw=#{pw}, name=#{name}, email=#{email}, address=#{address}, mobile=#{mobile} where id=#{id}")
	void update(MemberDTO dto);

	@Delete("delete from member where id=#{id}")
	void delete(String id);
}


