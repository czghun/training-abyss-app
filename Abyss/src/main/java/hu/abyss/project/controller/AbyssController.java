package hu.abyss.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AbyssController {
	
	@RequestMapping("/index")
	public String mainPage() {
		return "index";
	}
	
	@RequestMapping("/")
	public String index() {
		return "index";
	}
	

}
