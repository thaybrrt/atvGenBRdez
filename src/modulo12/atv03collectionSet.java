package modulo12;

	import java.util.HashSet;
	import java.util.Iterator;
	import java.util.Scanner;
	import java.util.Set;

	public class atv03collectionSet {
	    
		public static void main(String[] args) {
	        Set<Integer> numerosSet = new HashSet<>();
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Digite 10 valores inteiros não repetidos:");

	        for (int i = 0; i < 10; i++) {
	            System.out.print("Valor " + (i + 1) + ": ");
	            int valor = scanner.nextInt();
	            numerosSet.add(valor);
	        }
	        scanner.close();
	        System.out.println("\nListar dados do Set:");
	        Iterator<Integer> iterator = numerosSet.iterator();
	        while (iterator.hasNext()) {
	            System.out.println(iterator.next());
	        }
	    }
	} 