package com.teste;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteLeitura {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		OutputStream fis = new FileOutputStream("lorem2.txt");
		Writer isr = new OutputStreamWriter(fis);
		BufferedWriter br = new BufferedWriter(isr);
		
		
		br.write("Teste");
		br.newLine();
		br.write("teste2");
		
		br.close();
	}

}
