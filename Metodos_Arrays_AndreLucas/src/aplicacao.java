import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class aplicacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random presenca = new Random();
		Scanner scan = new Scanner(System.in);
		ArrayList listAluno = new ArrayList();
		Aluno aluno = new Aluno();
		
		listAluno.add("André");
		listAluno.add("Thiago");
		listAluno.add("Barbara");
		
		listAluno.sort(null);
		System.out.println(listAluno);
	}

}
