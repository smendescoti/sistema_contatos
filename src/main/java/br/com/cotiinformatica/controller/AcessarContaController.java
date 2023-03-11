package br.com.cotiinformatica.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AcessarContaController {

	@RequestMapping(value = "/") //raiz do projeto (página inicial)
	public ModelAndView acessarConta() {
		//WEB-INF/views/acessar-conta.jsp
		ModelAndView modelAndView = new ModelAndView("acessar-conta");
		return modelAndView;
	}

}
