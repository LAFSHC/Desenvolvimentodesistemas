import java.util.LinkedList;

public class aplicacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> carros = new LinkedList<String>();
		
		carros.add("Volkswagem");
		carros.add("Fiat");
		carros.add("Ford");
		carros.addFirst("Ferrari");
		System.out.println(carros);
		System.out.println("");
		
		System.out.println("Removendo o primeiro FERRARI");
		carros.removeFirst();
		System.out.println(carros);
		System.out.println("");
		
		System.out.println("Removendo o ultimo FORD");
		carros.removeLast();
		System.out.println(carros);
		System.out.println("");
		
		System.out.println("MOSTRANDO O PRIMEIRO");
		System.out.println(carros.getFirst());
		System.out.println("");
		
		System.out.println("MOSTRANDO ULTIMO");
		System.out.println(carros.getLast());
		System.out.println("");
	}

}
