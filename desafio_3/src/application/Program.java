package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		
		String[] linhas = new String[n]; 
		
		for (int i = 0; i < n; i++) {
			linhas[i] = sc.nextLine();
		}
		
		for (int i = 0; i < linhas.length; i++) {
			String a = decifrar(linhas[i]);
			System.out.println(a);
		}
		sc.close();
	}
	
	public static String decifrar(String linha) {
		int tamanho = (linha.length()) / 2;
		String[] partes = {linha.substring(0, tamanho), linha.substring(tamanho)}; //Divide a linha ao meio e em seguida inverte cada parte
		partes[0] = new StringBuilder(partes[0]).reverse().toString();
		partes[1] = new StringBuilder(partes[1]).reverse().toString();
		linha = partes[0].concat(partes[1]);
		return linha;
	}

}
