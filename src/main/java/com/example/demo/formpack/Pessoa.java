package com.example.demo.formpack;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Pessoa {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nomedogrupo;
	private String direcaoartistica;
	private String nomedaacademia;
	private String endereco;
	private String cidade;
	private String estado;
	private String pais;
	private int ddd;
	private int telefone;
	private boolean concorrente;
	private String modalidade;
	private String categoria;
	private String coreografia;
	private String nomecoreografo;
	private String tempoduracao;
	private String nomedamusica;
	private String nomedocompositor;
	private String release;


	public Pessoa() {

	}


	public void setId(Long id) {
		this.id = id;
	}

	@Id
	public Long getId() {
		return id;
	}

	public String getNomedogrupo() {
		return nomedogrupo;
	}
	public void setNomedogrupo(String nomedogrupo) {
		this.nomedogrupo = nomedogrupo;
	}
	public String getDirecaoartistica() {
		return direcaoartistica;
	}
	public void setDirecaoartistica(String direcaoartistica) {
		this.direcaoartistica = direcaoartistica;
	}
	public String getNomedaacademia() {
		return nomedaacademia;
	}
	public void setNomedaacademia(String nomedaacademia) {
		this.nomedaacademia = nomedaacademia;
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
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
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
	public String getNomecoreografo() {
		return nomecoreografo;
	}
	public void setNomecoreografo(String nomecoreografo) {
		this.nomecoreografo = nomecoreografo;
	}
	public String getTempoduracao() {
		return tempoduracao;
	}
	public void setTempoduracao(String tempoduracao) {
		this.tempoduracao = tempoduracao;
	}
	public String getNomedamusica() {
		return nomedamusica;
	}
	public void setNomedamusica(String nomedamusica) {
		this.nomedamusica = nomedamusica;
	}
	public String getNomedocompositor() {
		return nomedocompositor;
	}
	public void setNomedocompositor(String nomedocompositor) {
		this.nomedocompositor = nomedocompositor;
	}

	public String getRelease() {
		return release;
	}

	public void setRelease(String release) {
		this.release = release;
	}

	@Override
	public String toString() {
		return "Pessoa{" +
				"nomedogrupo='" + nomedogrupo + '\'' +
				", direcaoartistica='" + direcaoartistica + '\'' +
				", nomedaacademia='" + nomedaacademia + '\'' +
				", endereco='" + endereco + '\'' +
				", cidade='" + cidade + '\'' +
				", estado='" + estado + '\'' +
				", pais='" + pais + '\'' +
				", ddd=" + ddd +
				", telefone=" + telefone +
				", concorrente=" + concorrente +
				", modalidade='" + modalidade + '\'' +
				", categoria='" + categoria + '\'' +
				", coreografia='" + coreografia + '\'' +
				", nomecoreografo='" + nomecoreografo + '\'' +
				", tempoduracao='" + tempoduracao + '\'' +
				", nomedamusica='" + nomedamusica + '\'' +
				", nomedocompositor='" + nomedocompositor + '\'' +
				", release='" + release + '\'' +
				'}';
	}
}
