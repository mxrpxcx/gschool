package com.teste;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class TesteEscrita {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InputStream fis = new FileInputStream("lorem.txt");
		Reader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);
		
		
		String l = br.readLine();
		
		while(l!=null) {
		System.out.println(l);
		l = br.readLine();
		}
		
		br.close();
	}

}
