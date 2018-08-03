package com.udemy.cursomc.dto;

import java.io.Serializable;

public class ClienteNewDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private String nome;
	private String email;
	private String cpfOuCnpj;
	private Integer tipo;
	
	private String logradouro;
	private String numero;
	private String complmento;
	private String bairro;
	private String cep;
	
	private String teleonfe1;
	private String teleonfe2;
	private String teleonfe3;
	
	private Integer cidadeId;
	
	public ClienteNewDTO() {
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCpfOuCnpj() {
		return cpfOuCnpj;
	}

	public void setCpfOuCnpj(String cpfOuCnpj) {
		this.cpfOuCnpj = cpfOuCnpj;
	}

	public Integer getTipo() {
		return tipo;
	}

	public void setTipo(Integer tipo) {
		this.tipo = tipo;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getComplmento() {
		return complmento;
	}

	public void setComplmento(String complmento) {
		this.complmento = complmento;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getTeleonfe1() {
		return teleonfe1;
	}

	public void setTeleonfe1(String teleonfe1) {
		this.teleonfe1 = teleonfe1;
	}

	public String getTeleonfe2() {
		return teleonfe2;
	}

	public void setTeleonfe2(String teleonfe2) {
		this.teleonfe2 = teleonfe2;
	}

	public String getTeleonfe3() {
		return teleonfe3;
	}

	public void setTeleonfe3(String teleonfe3) {
		this.teleonfe3 = teleonfe3;
	}

	public Integer getCidadeId() {
		return cidadeId;
	}

	public void setCidadeId(Integer cidadeId) {
		this.cidadeId = cidadeId;
	}
	
	
}
