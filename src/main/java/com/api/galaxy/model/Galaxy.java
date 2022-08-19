package com.api.galaxy.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Galaxy {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String urlImg;
	private Double magnitude;
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
	private String coordenadas;

	public Galaxy(Long id, String nome, String urlImg, Double magnitude, String declinacao, String distancia,
			String desvioVermelho, String descricao, Double rotacao, Double dimensoes, Double raio,
			Integer idadeEstimada, Double massa, Integer estrelas, String satelitesNaturais, String coordenadas) {
		super();
		this.id = id;
		this.nome = nome;
		this.urlImg = urlImg;
		this.magnitude = magnitude;
		this.declinacao = declinacao;
		this.distancia = distancia;
		this.desvioVermelho = desvioVermelho;
		this.descricao = descricao;
		this.rotacao = rotacao;
		this.dimensoes = dimensoes;
		this.raio = raio;
		IdadeEstimada = idadeEstimada;
		this.massa = massa;
		this.estrelas = estrelas;
		this.satelitesNaturais = satelitesNaturais;
		this.coordenadas = coordenadas;
	}

	public Galaxy() {
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

	public Double getMagnitude() {
		return magnitude;
	}

	public void setMagnitude(Double magnitude) {
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

	public String getCoordenadas() {
		return coordenadas;
	}

	public void setCoordenadas(String coordenadas) {
		this.coordenadas = coordenadas;
	}

}
