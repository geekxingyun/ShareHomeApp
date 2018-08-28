package com.xingyun.sharehomeapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 首页
 * @author  fairy
 * @email fairy_xingyun@hotmail.com
 * */
@Controller
public class HomeController {

	/**
	 * 拦截URL请求返回首页
	 * 多个URL映射
	 * */
	@GetMapping(value= {"/",
			"index","index.html","index.do","index.jsp","index.php","index.jspx","index.aspx",
			"home","home.html","home.do","home.jsp","home.php","home.jspx","home.aspx"})
	public String home() {
		return "index";
	}
}
