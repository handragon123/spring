package com.hello.web.dao;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hello.web.dto.BookDTO;

@Repository
public class BookDAO {
	
	@Autowired
	SqlSessionTemplate sqlSession;
	
	public BookDAO() {
		System.out.println("BookDAO()");
	}
	
	public int insert(Map<String, String> map) {
		return sqlSession.insert("book.insertMap", map);
	}
	public int insert(BookDTO dto) {
		return sqlSession.insert("book.insert", dto);
	}
	public int update(BookDTO dto) {
		return sqlSession.update("book.update", dto);
	}
	public int delete(BookDTO dto) {
		return sqlSession.delete("book.delete", dto);
	}
	
	public List<Map<String, Object>> listMap() {
		return sqlSession.selectOne("book.listMap");
	}
	
	public List<BookDTO> list() {
		return sqlSession.selectList("book.list");
	}
	
	public BookDTO detail(Map<String, String> map) {
		return sqlSession.selectOne("book.detail", map);
	}
}
