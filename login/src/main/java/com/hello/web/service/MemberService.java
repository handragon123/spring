package com.hello.web.service;

import java.util.Map;

import com.hello.web.dto.MemberDTO;

public class MemberService {
	public int join(MemberDTO dto);
	public int join(Map<String, String> map);
}
