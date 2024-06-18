package com.hello.web.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hello.web.dao.BookDAO;
import com.hello.web.dto.BookDTO;

@Service
public class BookServiceImpl implements BookService{
	
	@Autowired
	BookDAO bookDAO;
	
	public BookServiceImpl() {
		System.out.println("BookServiceImpl()");
	}
	
	public int insert(Map<String, String> map) {		
		return bookDAO.insert(map);		
	}
	
	public int insert(BookDTO dto) {		
		return bookDAO.insert(dto);		
	}
	
	public int update(BookDTO dto) {		
		return bookDAO.update(dto);		
	}
	
	public int delete(BookDTO dto) {		
		return bookDAO.delete(dto);		
	}

	@Override
	public List<Map<String, Object>> listMap() {
		return bookDAO.listMap();
	}
	
	@Override
	public List<BookDTO> list() {
		return bookDAO.list();
	}
	
	@Override
	public BookDTO detail(Map<String, String> map) {
		return bookDAO.detail(map);
	}
	
	

}
