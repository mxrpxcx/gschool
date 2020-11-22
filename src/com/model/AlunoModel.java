package com.model;

public class AlunoModel {
	private int id;
	private String nome;
	private int ano;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	@Override
	public String toString() {
		return "AlunoModel [id=" + id + ", nome=" + nome + ", ano=" + ano + "]";
	}
	
	
	
	
	
}
