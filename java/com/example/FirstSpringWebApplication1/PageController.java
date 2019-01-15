package com.example.FirstSpringWebApplication1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
  
	@RequestMapping("web")
	public String home()
	{
		return "web.jsp";
	}
}
