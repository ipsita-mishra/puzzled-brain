package com.web.webber;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {

	@GetMapping("/")
	public String landing(Model model) {
		String welcome = "Hello Security Champions !!";
		String para = "There is more than 1 flag in this challenge. Good luck finding it! Remember it is always in the format : flag{}";
		model.addAttribute("welcome", welcome);
		model.addAttribute("para", para);
		return "webber_home";
	}

}