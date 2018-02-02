package com.example.springdemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/other")
public class OtherController {

	@RequestMapping("/showForm")
	public String displayTheForm() {
		return "silly";
	}
}
