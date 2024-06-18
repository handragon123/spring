package com.hello.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import lombok.extern.log4j.Log4j;
import lombok.extern.log4j.Log4j2;

@Controller

public class HomeController {
	@RequestMapping(value="/", method = RequestMethod.GET)
	public String home() {
		return "home";
	}
}
