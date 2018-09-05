package com.xingyun.sharehomeapp.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import springfox.documentation.annotations.ApiIgnore;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * 首页
 * @author  fairy
 * @email fairy_xingyun@hotmail.com
 * */
@ApiIgnore
@Controller
public class HomeController {
	//打印日志
	Logger logger = LoggerFactory.getLogger(HomeController.class);
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

	@GetMapping(value = "/upload")
	public String uploadFile(){
		return "view/upload_file";
	}
}
