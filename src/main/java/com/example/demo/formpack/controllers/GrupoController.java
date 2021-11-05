package com.example.demo.formpack.controllers;

import com.example.demo.formpack.Grupo;
import com.example.demo.formpack.services.CadastroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;



@Controller
public class GrupoController {

	@Autowired
	private CadastroService cadastroService;

	@GetMapping("exibirindex")
	public String exibirindex() {
		return "index";
	}

	@GetMapping("/listarcadastros")
	public String exibirLista(Model model) {
		try{
		model.addAttribute("lista", this.cadastroService.findAll(Sort.by("nome")));
			return "lista";
		}catch (Exception e){
			String mensagem = e.getMessage();
			model.addAttribute("erro", mensagem);
			return "erro";
		}
	}
	@PostMapping("/salvar")
	public String salvar(Grupo grupo, Model model) {
		try {

			System.out.println(grupo.toString());
			this.cadastroService.cadastrarGrupo(grupo);
			return "redirect:/listarcadastros";

		} catch (Exception e){
			model.addAttribute("erro", e.getMessage());
			return "erro";

		}
	}

	@GetMapping("/erro")
	public  String erro(){
		return "erro";
	}
	@GetMapping("/error")
	public  String error(){
		return "erro";
	}
}
