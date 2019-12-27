package com.updown.spring.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FIrstController {
	
	private static final Logger logger = LoggerFactory.getLogger(FIrstController.class);

	@RequestMapping(value = "/first", method = RequestMethod.GET)
	public ModelAndView home (HttpServletRequest request, HttpServletResponse response) {
		    
		    ModelAndView mav = new ModelAndView();

		    return mav;
	}
	
}
