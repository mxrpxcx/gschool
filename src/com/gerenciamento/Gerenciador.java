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
		InputStream input = new FileInputStream("lorem.txt");
		Reader reader = new InputStreamReader(input);
		BufferedReader bfReader = new BufferedReader(reader);
		
		OutputStream output = new FileOutputStream("lorem.txt");
		Writer writer = new OutputStreamWriter(output);
		BufferedWriter bfWriter = new BufferedWriter(writer);
		
		Scanner e = new Scanner(System.in);
		System.out.print("Inicializando Sistema...");
		
		bfReader.close();
		bfWriter.close();
	}

}
