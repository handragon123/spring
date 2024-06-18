package com.hello.web.dao;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hello.web.dto.BookDTO;
import com.hello.web.dto.UserDTO;

@Repository
public class UserDAO {
	
	@Autowired
	SqlSessionTemplate sqlSession;
	
	public UserDAO() {
		System.out.println("UserDAO()");
	}
	
	public int insert(Map<String, String> map) {
		return sqlSession.insert("user.insertMap", map);
	}
	public int insert(UserDTO dto) {
		return sqlSession.insert("user.insert", dto);
	}
	public UserDTO login(UserDTO dto) {
		return sqlSession.selectOne("user.login", dto);
	}
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
