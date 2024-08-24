package br.edu.ifpe.recife.gcms.WebApp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public @ResponseBody String greeting() {
		return "Hello, World";
	}
	
	@RequestMapping("/gabriel")
	public @ResponseBody String greetingGabriel() {
	return "Pratica 3 GCMS Gabriel Alves!";
	}
	
	@RequestMapping("/pratica3")
	public @ResponseBody String greetingPratica() {
	return "Mudança no original";
	}
}
