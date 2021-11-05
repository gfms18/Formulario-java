package com.example.demo.formpack;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Grupo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String direcaoArtistica;
	private String nomeAcademia;
	private String endereco;
	private String cidade;
	private String estado;
	private String pais;
	private int ddd;
	private String telefone;
	private boolean concorrente;
	private String modalidade;
	private String categoria;
	private String coreografia;
	private String nomeCoreografo;
	private Double tempoDuracao;
	private String nomeMusica;
	private String nomeCompositor;
	private String release;


	public Grupo() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDirecaoArtistica() {
		return direcaoArtistica;
	}

	public void setDirecaoArtistica(String direcaoArtistica) {
		this.direcaoArtistica = direcaoArtistica;
	}

	public String getNomeAcademia() {
		return nomeAcademia;
	}

	public void setNomeAcademia(String nomeAcademia) {
		this.nomeAcademia = nomeAcademia;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public int getDdd() {
		return ddd;
	}

	public void setDdd(int ddd) {
		this.ddd = ddd;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public boolean isConcorrente() {
		return concorrente;
	}

	public void setConcorrente(boolean concorrente) {
		this.concorrente = concorrente;
	}

	public String getModalidade() {
		return modalidade;
	}

	public void setModalidade(String modalidade) {
		this.modalidade = modalidade;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getCoreografia() {
		return coreografia;
	}

	public void setCoreografia(String coreografia) {
		this.coreografia = coreografia;
	}

	public String getNomeCoreografo() {
		return nomeCoreografo;
	}

	public void setNomeCoreografo(String nomeCoreografo) {
		this.nomeCoreografo = nomeCoreografo;
	}

	public Double getTempoDuracao() {
		return tempoDuracao;
	}

	public void setTempoDuracao(Double tempoDuracao) {
		this.tempoDuracao = tempoDuracao;
	}

	public String getNomeMusica() {
		return nomeMusica;
	}

	public void setNomeMusica(String nomeMusica) {
		this.nomeMusica = nomeMusica;
	}

	public String getNomeCompositor() {
		return nomeCompositor;
	}

	public void setNomeCompositor(String nomeCompositor) {
		this.nomeCompositor = nomeCompositor;
	}

	public String getRelease() {
		return release;
	}

	public void setRelease(String release) {
		this.release = release;
	}

}
