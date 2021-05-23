package com.example.servingwebcontent;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {

	@PostMapping("/greetings")
	public String greeting(Model model,
			@RequestParam(name="name", required=true, defaultValue="World") String name,
			@RequestParam(name="surname", required=true, defaultValue="World") String surname) {
		model.addAttribute("name", name);
		model.addAttribute("surname", surname);
		return "greeting";
	}

}
