package com.example.demo.formpack.controllers;

import com.example.demo.formpack.Dao.CadastroDAO;
import com.example.demo.formpack.Pessoa;
import com.example.demo.formpack.services.CadastroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;



@Controller
public class PessoaController {

	@Autowired
	private CadastroService service;

	@PostMapping("/salvar")
	public String salvar(Pessoa grupo) {
		System.out.println(grupo.toString());
		grupo.setId(234L);
		service.cadastrarGrupo(grupo);
		return "finalizado";
	}
	
	@GetMapping("exibirindex")
	public String exibirindex() {
		return "index";
	}
}
