package Test01;

import java.util.Scanner;

public class BreakContinue {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o n�mero m�nomo: ");
		int Min = scan.nextInt();
		
		System.out.println("Digite o n�mero limite: ");
		int Max = scan.nextInt();
		
		
		System.out.println("N�mero devis�vel por 7");
		for(int i = Min; i <= Max; i++) {
			if(i % 7 == 0) {
				System.out.println("O valor de i � igual a: "+i);
				System.out.println("");
				break;
			}
		}
		
		System.out.println("N�meros n�o devis�veis por 7");
		for(int i = Min; i <= Max; i++) {
			if(i % 7 != 0) {
				System.out.println("O valor de i � igual a: "+i);
				continue;
			}
		}
	}

}
