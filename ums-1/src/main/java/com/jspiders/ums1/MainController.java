package com.jspiders.ums1;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class MainController 
{
	@GetMapping("/")
	public String loadWelcomePage()
	{
		return "index";
	}
}
