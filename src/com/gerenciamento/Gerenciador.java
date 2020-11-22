package com.gerenciamento;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.util.Scanner;

public class Gerenciador {
	public static void main(String[] args) throws IOException {
		int opcao = -1;
		int subOpcao = -1;
		
		InputStream input = new FileInputStream("lorem.txt");
		Reader reader = new InputStreamReader(input);
		BufferedReader bfReader = new BufferedReader(reader);
		
		OutputStream output = new FileOutputStream("lorem.txt");
		Writer writer = new OutputStreamWriter(output);
		BufferedWriter bfWriter = new BufferedWriter(writer);
		
		Scanner e = new Scanner(System.in);
		
		while(opcao!=0) {
		subOpcao = -1;

		System.out.println("---------------Inicio---------------");
		System.out.println("Qual operação deseja realizar?");
		System.out.println("Cadastro: 1");
		System.out.println("Remoção: 2");
		System.out.println("Atualização: 3");
		System.out.println("Pesquisar: 4");
		System.out.println("Sair: 0");
		System.out.println("*----------------------------------*");
		System.out.println();
		opcao = e.nextInt();
	
		
		switch (opcao) {
		  case 1:
			while(subOpcao!=0) {
			System.out.println("---------------Cadastro---------------");
			System.out.println("Cadastro de aluno: 1");
			System.out.println("Cadastro de professor: 2");
			System.out.println("Cadastro de disciplina: 3");
			System.out.println("Voltar: 0");
			System.out.println("*------------------------------------*");
			System.out.println();
			subOpcao = e.nextInt();
			
			}

		    break;
		    
		  case 2:
			  while(subOpcao!=0) {
			  System.out.println("--------------Remoção---------------");
			  System.out.println("Remoção de aluno: 1");
			  System.out.println("Remoção de professor: 2");
			  System.out.println("Remoção de disciplina: 3");
			  System.out.println("Voltar: 0");
			  System.out.println("*-----------------------------------*");
			  System.out.println();
			  subOpcao = e.nextInt();
			  
			  }
		    break;
		    
		  case 3:
			  while(subOpcao!=0) {
			  System.out.println("---------------Atualização---------------");
			  System.out.println("Atualização de aluno: 1");
			  System.out.println("Atualização de professor: 2");
			  System.out.println("Atualização de disciplina: 3");
			  System.out.println("Voltar: 0");
			  System.out.println("*---------------------------------------*");
			  System.out.println();
			  subOpcao = e.nextInt();
			  
			  }
			  
		    break;
		    
		  case 4:
			  while(subOpcao!=0) {
			  System.out.println("---------------Pesquisa---------------");
			  System.out.println("Pesquisar por aluno: 1");
			  System.out.println("Pesquisar por professor: 2");
			  System.out.println("Pesquisar por disciplina: 3");
			  System.out.println("Voltar: 0");
			  System.out.println("*------------------------------------*");
			  System.out.println();
			  subOpcao = e.nextInt();
			  
			  }
		    break;
		}
		
		
		bfReader.close();
		bfWriter.close();
		}
	}

}
