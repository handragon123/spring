package com.spring.hello2.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.hello2.dto.MemberDTO;

@Repository
public class MemberDAO {
	
	SqlSessionTemplate sqlSession;
	
	@Autowired
	public MemberDAO(SqlSessionTemplate sqlSession) {
		System.out.println("MemberDAO()");
		this.sqlSession = sqlSession;
	}
	
	public List<MemberDTO> list(){
		return sqlSession.selectList("member.list");
	}
	
	public MemberDTO detail(MemberDTO dto){
		return sqlSession.selectOne("member.detail", dto);
	}
	
	public int insert(MemberDTO dto){
		return sqlSession.insert("member.insert", dto);
	}
	
}
