package com.hello.web.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hello.web.dto.BookDTO;

@Repository
public class MemberDAO {

	@Autowired
	SqlSessionTemplate sqlSession;
	
	public MemberDAO() {
		System.out.println("MemberDAO()");
	}
	
	public int join(BookDTO dto) {
		return sqlSession.join("member.join", dto);
	}
}
