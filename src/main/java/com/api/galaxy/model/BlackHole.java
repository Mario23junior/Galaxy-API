package com.api.galaxy.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.validator.constraints.Length;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@Entity
@JsonPropertyOrder({ "id", "nome", "optico", "raioXInfravermelho", "opticoInfravermelho" })
public class BlackHole {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String nome;
	private String raioX;
	private String raioXInfravermelho;
	private String optico;
	private String opticoInfravermelho;
	@Length(max = 2000)
	private String descricao;
	private double redshift;
	private String constelacao;
	private String declinacao;
	private String coordenadas;
	private String estimativaDistancia;
	private String dimensoes;

	public BlackHole() {
		// TODO Auto-generated constructor stub
	}

	public BlackHole(Long id, String nome, String raioX, String raioXInfravermelho, String optico,
			String opticoInfravermelho, @Length(max = 2000) String descricao, double redshift, String constelacao,
			String declinacao, String coordenadas, String estimativaDistancia, String dimensoes) {
		super();
		this.id = id;
		this.nome = nome;
		this.raioX = raioX;
		this.raioXInfravermelho = raioXInfravermelho;
		this.optico = optico;
		this.opticoInfravermelho = opticoInfravermelho;
		this.descricao = descricao;
		this.redshift = redshift;
		this.constelacao = constelacao;
		this.declinacao = declinacao;
		this.coordenadas = coordenadas;
		this.estimativaDistancia = estimativaDistancia;
		this.dimensoes = dimensoes;
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

	public String getRaioX() {
		return raioX;
	}

	public void setRaioX(String raioX) {
		this.raioX = raioX;
	}

	public String getRaioXInfravermelho() {
		return raioXInfravermelho;
	}

	public void setRaioXInfravermelho(String raioXInfravermelho) {
		this.raioXInfravermelho = raioXInfravermelho;
	}

	public String getOptico() {
		return optico;
	}

	public void setOptico(String optico) {
		this.optico = optico;
	}

	public String getOpticoInfravermelho() {
		return opticoInfravermelho;
	}

	public void setOpticoInfravermelho(String opticoInfravermelho) {
		this.opticoInfravermelho = opticoInfravermelho;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getRedshift() {
		return redshift;
	}

	public void setRedshift(double redshift) {
		this.redshift = redshift;
	}

	public String getConstelacao() {
		return constelacao;
	}

	public void setConstelacao(String constelacao) {
		this.constelacao = constelacao;
	}

	public String getDeclinacao() {
		return declinacao;
	}

	public void setDeclinacao(String declinacao) {
		this.declinacao = declinacao;
	}

	public String getCoordenadas() {
		return coordenadas;
	}

	public void setCoordenadas(String coordenadas) {
		this.coordenadas = coordenadas;
	}

	public String getEstimativaDistancia() {
		return estimativaDistancia;
	}

	public void setEstimativaDistancia(String estimativaDistancia) {
		this.estimativaDistancia = estimativaDistancia;
	}

	public String getDimensoes() {
		return dimensoes;
	}

	public void setDimensoes(String dimensoes) {
		this.dimensoes = dimensoes;
	}

}
