package com.example.demo.formpack;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;



@Controller
public class PessoaController {
	
	
	@PostMapping("/salvar")
	public String salvar(Pessoa pessoa) {
		System.out.println("Nome do grupo: " + pessoa.getNomedogrupo());
		System.out.println("Direção Artistica : " + pessoa.getDirecaoartistica());
		System.out.println("Nome da academia: " + pessoa.getNomedaacademia());
		System.out.println("Endereço: " + pessoa.getEndereco());
		System.out.println("cidade: " + pessoa.getCidade());
		System.out.println("Estado: " + pessoa.getEstado());
		System.out.println("País: " + pessoa.getPais());
		System.out.println("DDD: " + pessoa.getDdd());
		System.out.println("Telefone: " + pessoa.getTelefone());
		System.out.println("Concorrente: " + pessoa.isConcorrente());
		System.out.println("Modalidade: " + pessoa.getModalidade());
		System.out.println("Categoria: " + pessoa.getCategoria());
		System.out.println("Nome da coreografia: " + pessoa.getCategoria());
		System.out.println("Nome do coreografo: " + pessoa.getNomecoreografo());
		System.out.println("Tempo de duração em minutos: " + pessoa.getTempoduracao());
		System.out.println("Nome da musica: " + pessoa.getNomedamusica());
		System.out.println("Nome do compositor: " + pessoa.getNomedocompositor());
		System.out.println("Release: " + pessoa.getRelease());
		
		
		return "finalizado";
	}
	
	@GetMapping("exibirindex")
	public String exibirindex() {
		return "index";
	}
}
