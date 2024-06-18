package com.hello.web.service;

import java.util.List;
import java.util.Map;

import com.hello.web.dto.BookDTO;
import com.hello.web.dto.UserDTO;

public interface UserService {
	public int insert(Map<String, String> map);
	public int insert(UserDTO dto);
	public UserDTO login(UserDTO dto);
//	public int delete(BookDTO dto);
//	public List<Map<String, Object>> listMap();
//	public List<BookDTO> list();
//	public BookDTO detail(Map<String, String> map);
}
