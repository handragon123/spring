package com.hello.web.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hello.web.dao.MemberDAO;
import com.hello.web.dto.MemberDTO;

@Service
public class MemberServiceImpl implements MemberService{
	
	@Autowired
	MemberDAO MemberDAO;
	
	public MemberServiceImpl() {
		System.out.println("BookServiceImpl()");
	}
	
	public int join(Map<String, String> map) {		
		return MemberDAO.join(map);		
	}
	
	public int join(MemberDTO dto) {		
		return MemberDAO.join(dto);		
	}
//	
	//public int update(BookDTO dto) {		
		//return bookDAO.update(dto);		
	//}
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
	
	

}
