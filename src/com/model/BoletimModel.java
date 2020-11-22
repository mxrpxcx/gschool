package com.model;

import java.util.ArrayList;

public class BoletimModel {
	
	private int id;
	private ArrayList<NotaModel> notas;

	public ArrayList<NotaModel> getNotas() {
		return notas;
	}

	public void setNotas(ArrayList<NotaModel> notas) {
		this.notas = notas;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "BoletimModel [id=" + id + ", notas=" + notas + "]";
	}
	
	
	
}
