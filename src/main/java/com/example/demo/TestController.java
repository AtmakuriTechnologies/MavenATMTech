package com.example.demo;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {

		@RequestMapping("/index.html")
		public ModelAndView indexPage() {
			return new ModelAndView("index");
		}
}
