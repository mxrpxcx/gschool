package com.model;

import java.util.ArrayList;

public class DisciplinaModel {
	
	private int id;
	private String nome;
	private ArrayList<AlunoModel> alunos;
	private ProfessorModel professor;
	
	public ArrayList<AlunoModel> getAlunos() {
		return alunos;
	}
	public void setAlunos(ArrayList<AlunoModel> alunos) {
		this.alunos = alunos;
	}
	public ProfessorModel getProfessor() {
		return professor;
	}
	public void setProfessor(ProfessorModel professor) {
		this.professor = professor;
	}
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
	@Override
	public String toString() {
		return "DisciplinaModel [id=" + id + ", nome=" + nome + ", alunos=" + alunos + ", professor=" + professor + "]";
	}
	
	
	
	
	
	
}
