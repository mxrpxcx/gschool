package com.model;

public class NotaModel {
	
	private int id;
	private AlunoModel aluno;
	private DisciplinaModel disciplina;
	private double nota;
	
	public AlunoModel getAluno() {
		return aluno;
	}
	public void setAluno(AlunoModel aluno) {
		this.aluno = aluno;
	}
	public DisciplinaModel getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(DisciplinaModel disciplina) {
		this.disciplina = disciplina;
	}
	public double getNota() {
		return nota;
	}
	public void setNota(double nota) {
		this.nota = nota;
	}
	
	@Override
	public String toString() {
		return "NotaModel [aluno=" + aluno + ", disciplina=" + disciplina + ", nota=" + nota + "]";
	}
	
	
}
