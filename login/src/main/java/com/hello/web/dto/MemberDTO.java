package com.hello.web.dto;

import lombok.Data;

@Data
public class MemberDTO {
	String id;
	String password;
	String name;
	String role;
	String regDate;
}
