package com.hello.web.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.hello.web.dto.BookDTO;
import com.hello.web.dto.UserDTO;
import com.hello.web.service.BookService;
import com.hello.web.service.UserService;

@RequestMapping("/user")
@Controller
public class UserController {
	@Autowired
	UserService UserService;
	
	public UserController() {
		System.out.println("UserController()");
	}	
	
	@RequestMapping(value="/join", method = RequestMethod.GET)
	public ModelAndView join() {
		return new ModelAndView("user/join");
	}
	
	@RequestMapping(value="/join", method = RequestMethod.POST)
	public ModelAndView join(@RequestParam Map map, UserDTO dto) {

		System.out.println(map);
		int rs = UserService.insert(dto);
		System.out.println(dto);
		ModelAndView mav = new ModelAndView();
		if(rs == 1) {
			mav.setViewName("redirect:login");
		}else {
			mav.setViewName("redirect:join");
		}
		return mav; 
	}
	
	@RequestMapping(value="/login", method = RequestMethod.GET)
	public ModelAndView login() {
		return new ModelAndView("user/login");
	}
	
	@RequestMapping(value="/login", method = RequestMethod.POST)
	   public ModelAndView login(UserDTO dto, HttpServletRequest request) {
	      
	      UserDTO mdto = new UserDTO();
	      mdto = UserService.login(dto);
	      System.out.println(dto);
	      ModelAndView mav = new ModelAndView();
	      if(mdto != null ) {
	         // 로그인 성공 시 세션에 아이디 값을 저장
	            HttpSession session = request.getSession();
	            session.setAttribute("userId", dto.getId());  // 세션에 아이디 저장
	            mav.setViewName("redirect:list");
	      }else {
	         mav.setViewName("redirect:login");
	      }
	      return mav; 
	   }
	
	@RequestMapping(value="/list", method = RequestMethod.GET)
	public ModelAndView list() {
		return new ModelAndView("user/list");
	}
	
//	@GetMapping("/listMap")
//	public ModelAndView listMav() {
//		
//		List<Map<String, Object>> list = bookService.listMap();
//		
//		ModelAndView mav = new ModelAndView();
//		mav.addObject("list",list);
//		mav.setViewName("book/listMap");
//		return mav;
//	}
//	
//	@GetMapping("/list")
//	public String list(Model model) {
//		
//		List<BookDTO> list = bookService.list();				
//		model.addAttribute("list",list);		
//		return "book/list";
//	}
//	
//	@GetMapping("/listJstl")
//	public String listJstl(Model model) {
//		
//		List<BookDTO> list = bookService.list();				
//		model.addAttribute("list",list);		
//		return "book/listJstl";
//	}
//	
//	@GetMapping("/detail")
//	public String detail(Model model, @RequestParam Map map) {
//		System.out.println(map);
//		BookDTO book = bookService.detail(map);				
//		model.addAttribute("book",book);		
//		return "book/detail";
//	}
//	
//	@GetMapping("/update")
//	public String update(Model model, @RequestParam Map map) {
//		System.out.println(map);
//		BookDTO book = bookService.detail(map);				
//		model.addAttribute("book",book);		
//		return "book/update";
//	}
//	
//	@PostMapping("/update")
//	public String update(Model model, BookDTO  dto) {
//
//		System.out.println(dto);
//		int rs = bookService.update(dto);
//		
//		return "redirect:detail?book_id="+dto.getBook_id(); 
//	}
//	
//	@GetMapping("/delete")
//	public String delete(BookDTO  dto) {
//
//		System.out.println(dto);
//		int rs = bookService.delete(dto);
//		
//		return "redirect:listJstl"; 
//	}
	
}
