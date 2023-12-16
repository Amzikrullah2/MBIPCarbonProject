package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/Eletricity")
public class EletricityController {
	
	@ResponseBody
	@GetMapping("/root")
	public String root() {
		return "this is root Eletricity";
	}

}
