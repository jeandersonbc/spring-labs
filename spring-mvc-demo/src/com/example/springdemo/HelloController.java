package com.example.springdemo;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

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
}
