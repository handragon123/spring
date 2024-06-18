package com.hello.web.service;

import java.util.List;
import java.util.Map;

import com.hello.web.dto.BookDTO;
import com.hello.web.dto.MemberDTO;

public interface MemberService {
	public int join(Map<String, String> map);
	public int join(MemberDTO  dto);
	//public int update(BookDTO dto);
	//public int delete(BookDTO dto);
	//public List<Map<String, Object>> listMap();
	//public List<BookDTO> list();
	//public BookDTO detail(Map<String, String> map);
}
