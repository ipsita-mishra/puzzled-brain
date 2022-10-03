package com.web.webber;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@org.springframework.stereotype.Controller
public class Controller {

	@GetMapping("/")
	public String landing(Model model) {
		String welcome = "Hello Security Champions !!";
		String para = "Welcome to Webber!! Webber has been created with love using a commonly used library.";
		model.addAttribute("welcome", welcome);
		model.addAttribute("para", para);
		return "webber_home";
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