package com.dio.santander.bankline.api.model;

public class Correntista {
    private Integer id;
    private String cpf;
    private Sting nome;
    private Conta conta;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Sting getNome() {
		return nome;
	}
	public void setNome(Sting nome) {
		this.nome = nome;
	}
    
    
}
