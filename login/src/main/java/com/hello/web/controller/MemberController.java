package com.hello.web.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.hello.web.dto.BookDTO;
import com.hello.web.service.MemberService;

@RequestMapping("/member")
@Controller
public class MemberController {
	@Autowired
	MemberService memberService;
	
	public MemberController() {
		System.out.println("MemberController()");
	}
	
	@RequestMapping(value="/join", method = RequestMethod.GET)
	public ModelAndView join() {
		return new ModelAndView("member/join");
	}
	
	@RequestMapping(value="/join", method = RequestMethod.POST)
	public ModelAndView create(@RequestParam Map map, BookDTO dto) {

		System.out.println(map);
		int rs = memberService.join(dto);
		System.out.println(dto);
		ModelAndView mav = new ModelAndView();
		if(rs == 1) {
			mav.setViewName("redirect:list");
		}else {
			mav.setViewName("redirect:create");
		}
		return mav; 
	}
	
}
