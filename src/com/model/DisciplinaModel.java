package com.model;

import java.util.ArrayList;

public class DisciplinaModel {
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
	
	@Override
	public String toString() {
		return "DisciplinaModel [alunos=" + alunos + ", professor=" + professor + "]";
	}
	
	
	
	
}
