package com.hello.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hello.web.dao.MemberDAO;
import com.hello.web.dto.MemberDTO;

public class MemberServiceImpl implements MemberService{
	
	@Autowired
	MemberDAO memberDAO;
	
	public MemberServiceImpl() {
		System.out.println("MemberServicImpl()");
	}
	
	public int join(MemberDTO dto) {
		return MemberDAO.join(dto);
	}
}
