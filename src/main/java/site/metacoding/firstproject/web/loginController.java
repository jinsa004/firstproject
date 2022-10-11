package site.metacoding.firstproject.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class loginController {
	@GetMapping("/main")
	public String main() {
		return "user/main";
	}
}
