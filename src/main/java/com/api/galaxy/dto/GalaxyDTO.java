package com.api.galaxy.dto;

public class GalaxyDTO {

	private Long id;
	private String nome;
	private String urlImg;
	private String magnitude;
	private String declinacao;
	private String distancia;
	private String desvioVermelho;
	private String descricao;
	private Double rotacao;
	private Double dimensoes;
	private Double raio;
	private Integer IdadeEstimada;
	private Double massa;
	private Integer estrelas;
	private String satelitesNaturais;
	private Double numeroEstrelas;

	public GalaxyDTO() {
		// TODO Auto-generated constructor stub
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

	public String getUrlImg() {
		return urlImg;
	}

	public void setUrlImg(String urlImg) {
		this.urlImg = urlImg;
	}

	public String getMagnitude() {
		return magnitude;
	}

	public void setMagnitude(String magnitude) {
		this.magnitude = magnitude;
	}

	public String getDeclinacao() {
		return declinacao;
	}

	public void setDeclinacao(String declinacao) {
		this.declinacao = declinacao;
	}

	public String getDistancia() {
		return distancia;
	}

	public void setDistancia(String distancia) {
		this.distancia = distancia;
	}

	public String getDesvioVermelho() {
		return desvioVermelho;
	}

	public void setDesvioVermelho(String desvioVermelho) {
		this.desvioVermelho = desvioVermelho;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Double getRotacao() {
		return rotacao;
	}

	public void setRotacao(Double rotacao) {
		this.rotacao = rotacao;
	}

	public Double getDimensoes() {
		return dimensoes;
	}

	public void setDimensoes(Double dimensoes) {
		this.dimensoes = dimensoes;
	}

	public Double getRaio() {
		return raio;
	}

	public void setRaio(Double raio) {
		this.raio = raio;
	}

	public Integer getIdadeEstimada() {
		return IdadeEstimada;
	}

	public void setIdadeEstimada(Integer idadeEstimada) {
		IdadeEstimada = idadeEstimada;
	}

	public Double getMassa() {
		return massa;
	}

	public void setMassa(Double massa) {
		this.massa = massa;
	}

	public Integer getEstrelas() {
		return estrelas;
	}

	public void setEstrelas(Integer estrelas) {
		this.estrelas = estrelas;
	}

	public String getSatelitesNaturais() {
		return satelitesNaturais;
	}

	public void setSatelitesNaturais(String satelitesNaturais) {
		this.satelitesNaturais = satelitesNaturais;
	}

	public Double getNumeroEstrelas() {
		return numeroEstrelas;
	}

	public void setNumeroEstrelas(Double numeroEstrelas) {
		this.numeroEstrelas = numeroEstrelas;
	}
}
