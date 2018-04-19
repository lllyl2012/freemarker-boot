package top.lllyl2012.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TopController {
	@RequestMapping("/index")
	public String index(Model model){
		model.addAttribute("gaga","aaaaaaaaaaaaaaa");
		return "index";
	}
}
