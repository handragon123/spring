package com.spring.hello2.service;

import java.util.List;

import com.spring.hello2.dto.MemberDTO;

public interface MemberService {

	List<MemberDTO> list();
	MemberDTO detail(MemberDTO dto);
	int insert(MemberDTO dto);
}
