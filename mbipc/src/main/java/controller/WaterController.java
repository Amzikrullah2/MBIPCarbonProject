package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/Water")
public class WaterController {
	
	@ResponseBody
	@GetMapping("/root")
	public String root() {
		return "this is root Water";
	}


}
