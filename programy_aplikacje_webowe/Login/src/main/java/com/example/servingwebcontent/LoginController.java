package com.example.servingwebcontent;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

	@PostMapping("/login")
	public String greeting(Model model,
						   @RequestParam(name="LOGIN", required=true) String LOGIN,
						   @RequestParam(name="PASSWORD", required=true) String password) {
		model.addAttribute("LOGIN", LOGIN);
		model.addAttribute("PASSWORD", password);
		String status = walidator.walidate(LOGIN, password);
		model.addAttribute("status", status);
		return "login";
	}

}
