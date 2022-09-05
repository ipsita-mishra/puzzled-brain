package com.web.webber;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@org.springframework.stereotype.Controller
public class Controller {

	@Value("${f1}")
	private String f1;

	@GetMapping("/")
	public String landing(Model model) {
		String welcome = "Hello Security Champions !!";
		String para = "Welcome to Webber!! Webber has been created with love using a library widely used in the organization.";
		model.addAttribute("welcome", welcome);
		model.addAttribute("para", para);
		return "webber_home";
	}

	@GetMapping("/robots.txt")
	public String robots(Model model) {
		model.addAttribute("f1", Arrays.toString(f1.getBytes(StandardCharsets.US_ASCII)));
		return "robots";
	}

	@GetMapping("/feedback")
	public String feedbackForm(Model model) {
		model.addAttribute("feedback", new Feedback());
		return "feedback";
	}

	@PostMapping("/feedback")
	public String feedbackSubmit(@ModelAttribute Feedback feedback, Model model) {
		model.addAttribute("feedback", feedback);
		return "result";
	}

}