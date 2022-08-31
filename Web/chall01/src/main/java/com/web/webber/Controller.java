package com.web.webber;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {

	@Value("${f1}")
	private String f1;

	@GetMapping("/")
	public String landing(Model model) {
		String welcome = "Hello Security Champions !!";
		String para = "There is more than 1 flag in this challenge. Good luck finding it! Remember it is always in the format : flag{}";
		model.addAttribute("welcome", welcome);
		model.addAttribute("para", para);
		return "webber_home";
	}

	@GetMapping("/robots.txt")
	public String robots(Model model) {

		model.addAttribute("f1", Arrays.toString(f1.getBytes(StandardCharsets.US_ASCII)));
		return "robots";
	}

}