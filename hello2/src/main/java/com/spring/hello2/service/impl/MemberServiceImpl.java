package com.spring.hello2.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.hello2.dao.MemberDAO;
import com.spring.hello2.dto.MemberDTO;
import com.spring.hello2.service.MemberService;

@Service
public class MemberServiceImpl implements MemberService{

	MemberDAO dao;
	
	@Autowired
	public MemberServiceImpl(MemberDAO dao) {
		System.out.println("MemberServiceImpl()");
		this.dao = dao;
	}

	@Override
	public List<MemberDTO> list() {		
		return dao.list();
	}

	@Override
	public int insert(MemberDTO dto) {
		
		return dao.insert(dto);
	}

	@Override
	public MemberDTO detail(MemberDTO dto) {
		// TODO Auto-generated method stub
		return dao.detail(dto);
	}
}
