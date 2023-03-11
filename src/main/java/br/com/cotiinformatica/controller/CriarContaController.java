package br.com.cotiinformatica.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CriarContaController {

	@RequestMapping(value = "/criar-conta") // rota de navegação
	public ModelAndView criarConta() {

		// WEB-INF/views/criar-conta.jsp
		ModelAndView modelAndView = new ModelAndView("criar-conta");
		return modelAndView;
	}

}
