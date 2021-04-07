package Arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		//Exibe atletas por ordem de calssifica��o
		//Instancia��o do array e da classe scanner
		ArrayList<String> atleta = new ArrayList<String>();
		Scanner scaner = new Scanner(System.in);
		
		//Adi��o dos elementos no array
		for(int i=3; i>0; i--) {
			System.out.println("Insira o nome do "+i+"� colocado:");
			atleta.add(scaner.next());
		}
		//Ordena��o dos elementos inseridos acima
		Collections.sort(atleta);
		
		//Exibe os elementos ordenados
		System.out.println("Ordem de classifica��o:");
		for(String i : atleta) {			
			System.out.println(i);
		}
	}

}
