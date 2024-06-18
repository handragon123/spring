package com.hello.web.dao;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hello.web.dto.MemberDTO;

@Repository
public class MemberDAO {
	
	@Autowired
	SqlSessionTemplate sqlSession;
	
	public MemberDAO() {
		System.out.println("MemberDAO()");
	}
	
	public int join(Map<String, String> map) {
		return sqlSession.insert("Member.joinMap", map);
	}
	public int join(MemberDTO dto) {
		return sqlSession.insert("Member.join", dto);
	}
//	public int update(BookDTO dto) {
//		return sqlSession.update("book.update", dto);
//	}
//	public int delete(BookDTO dto) {
//		return sqlSession.delete("book.delete", dto);
//	}
//	
//	public List<Map<String, Object>> listMap() {
//		return sqlSession.selectOne("book.listMap");
//	}
//	
//	public List<BookDTO> list() {
//		return sqlSession.selectList("book.list");
//	}
//	
//	public BookDTO detail(Map<String, String> map) {
//		return sqlSession.selectOne("book.detail", map);
//	}
}
