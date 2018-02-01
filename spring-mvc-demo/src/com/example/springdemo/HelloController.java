package com.example.springdemo;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

	@RequestMapping("/")
	public String helloPage() {
		return "landing-page";
	}

	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}

	@RequestMapping("/processForm")
	public String process(HttpServletRequest request, Model model) {
		String name = request.getParameter("studentName");
		String message = name.toUpperCase();
		model.addAttribute("message", message);
		return "process-form";
	}

	/*
	 * RequestParam is a shortcut to access the HTTP Request and get the parameter
	 * from the request. It automatically binds to the given variable.
	 */
	@RequestMapping("/processFormTwo")
	public String processTwo(@RequestParam("studentName") String name, Model model) {
		String message = String.format("Hey %s!", name.toUpperCase());
		model.addAttribute("message", message);
		return "process-form";
	}
}
