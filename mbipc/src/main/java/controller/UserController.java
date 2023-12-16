package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import entity.User;
import service.Dbservice;




@Controller
@RequestMapping("/User")
public class UserController {
	
	Dbservice dbService;

	public UserController() {
		dbService = new Dbservice();
	}
	
	@ResponseBody
	@GetMapping("/root")
	public String root() {
		return "this is root User";
	}
	
    @GetMapping("/registeruser")
    public String registerUserForm() {
        return "registeruserform";
    }

    @PostMapping("/registeruser")
    public String addUser(@ModelAttribute("user") User user, Model model) {
    	dbService.addUser(user);
        model.addAttribute("user", user);
        return "registrationsuccess";
    }
	
	

}
