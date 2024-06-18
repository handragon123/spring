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
import com.hello.web.service.BookService;

@RequestMapping("/book")
@Controller
public class BookController {
	@Autowired
	BookService bookService;
	
	public BookController() {
		System.out.println("BookController()");
	}	
	
	@RequestMapping(value="/create", method = RequestMethod.GET)
	public ModelAndView create() {
		return new ModelAndView("book/create");
	}
	
	@GetMapping("/listMap")
	public ModelAndView listMav() {
		
		List<Map<String, Object>> list = bookService.listMap();
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("list",list);
		mav.setViewName("book/listMap");
		return mav;
	}
	
	@GetMapping("/list")
	public String list(Model model) {
		
		List<BookDTO> list = bookService.list();				
		model.addAttribute("list",list);		
		return "book/list";
	}
	
	@GetMapping("/listJstl")
	public String listJstl(Model model) {
		
		List<BookDTO> list = bookService.list();				
		model.addAttribute("list",list);		
		return "book/listJstl";
	}
	
	@GetMapping("/detail")
	public String detail(Model model, @RequestParam Map map) {
		System.out.println(map);
		BookDTO book = bookService.detail(map);				
		model.addAttribute("book",book);		
		return "book/detail";
	}
	
	@GetMapping("/update")
	public String update(Model model, @RequestParam Map map) {
		System.out.println(map);
		BookDTO book = bookService.detail(map);				
		model.addAttribute("book",book);		
		return "book/update";
	}
	
	@RequestMapping(value="/create", method = RequestMethod.POST)
	public ModelAndView create(@RequestParam Map map, BookDTO dto) {

		System.out.println(map);
		int rs = bookService.insert(dto);
		System.out.println(dto);
		ModelAndView mav = new ModelAndView();
		if(rs == 1) {
			mav.setViewName("redirect:list");
		}else {
			mav.setViewName("redirect:create");
		}
		return mav; 
	}
	
	@PostMapping("/update")
	public String update(Model model, BookDTO  dto) {

		System.out.println(dto);
		int rs = bookService.update(dto);
		
		return "redirect:detail?book_id="+dto.getBook_id(); 
	}
	
	@GetMapping("/delete")
	public String delete(BookDTO  dto) {

		System.out.println(dto);
		int rs = bookService.delete(dto);
		
		return "redirect:listJstl"; 
	}
	
}
