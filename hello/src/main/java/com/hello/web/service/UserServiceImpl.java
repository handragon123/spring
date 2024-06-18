package com.hello.web.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hello.web.dao.UserDAO;
import com.hello.web.dto.UserDTO;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserDAO UserDAO;
	
	public UserServiceImpl() {
		System.out.println("UserServiceImpl()");
	}
	
	public int insert(Map<String, String> map) {		
		return UserDAO.insert(map);		
	}
	
	public int insert(UserDTO dto) {		
		return UserDAO.insert(dto);		
	}
	
	public UserDTO login(UserDTO dto) {		
		return UserDAO.login(dto);		
	}
//	
//	public int delete(BookDTO dto) {		
//		return bookDAO.delete(dto);		
//	}
//
//	@Override
//	public List<Map<String, Object>> listMap() {
//		return bookDAO.listMap();
//	}
//	
//	@Override
//	public List<BookDTO> list() {
//		return bookDAO.list();
//	}
//	
//	@Override
//	public BookDTO detail(Map<String, String> map) {
//		return bookDAO.detail(map);
//	}
//	
	

}
