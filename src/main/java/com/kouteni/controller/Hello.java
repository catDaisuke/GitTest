package com.kouteni.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Hello {
	@RequestMapping(value = "/hello")
	// URLは、http://localhost:8080/helloとする
	public String hello(Model model) {

		// viewに表示する discription を設定する
		model.addAttribute("discription", "Hello すぷりんぐ　ぶーと　の世界へ");

		return "hello"; // src/main/resources/templates/hello.html を呼び出す
	}

}