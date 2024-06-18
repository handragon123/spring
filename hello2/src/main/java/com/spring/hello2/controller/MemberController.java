package com.spring.hello2.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.spring.hello2.dto.MemberDTO;
import com.spring.hello2.service.MemberService;

@RequestMapping("/member")
@Controller
public class MemberController {
	
	MemberService service;
	
	@Autowired
	public MemberController(MemberService service) {
		System.out.println("MemberController");
		this.service = service;
	}
	
	@GetMapping("/list")
	public String list(Model model) {
		String view = "member/list";		
		model.addAttribute("list", service.list());
		
		return view;
	}
	
	@GetMapping("/create")
	public String create() {
		String view = "member/create";
		
		return view;				
	}
	
	@PostMapping("/create")
	public String create(MemberDTO dto, RedirectAttributes rttr) {
		String view = "redirect:list"; 
		System.out.println(dto);	
		
		int rs = service.insert(dto);		
		
		return view;
	}
	
	@GetMapping("/login")
	public String login() {
		String view = "member/login";
		
		return view;				
	}
	
	@PostMapping("/login")
	public String login(MemberDTO dto, HttpSession session) {
		String view = "redirect:login";		
		System.out.println(dto);
		MemberDTO member = service.detail(dto);		
		System.out.println(member);
		if(member != null) {
			if(member.getPw().equals(dto.getPw())) {
				view = "redirect:list";
				session.setAttribute("id", member.getId());
				session.setAttribute("name", member.getName());
				
			}
		}
		
		return view;
	}
	
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		String view = "redirect:list";
		
		session.invalidate();
		
		return view;				
	}
	
}
