package modulo10;

	import java.util.Scanner;

		public class atv02For {		
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        int totalPar = 0;  int totalImpares = 0;

	        for (int i = 1; i <= 10; i++) {
	            System.out.print("Digite o " + i + "º número: ");
	            int numero = scanner.nextInt();

	            if (numero % 2 == 0) {
	                totalPar++;
	            } else { 
	                totalImpares++;
	            }
	        }
	        System.out.println("\nTotal de números pares: " + totalPar);
	        System.out.println("Total de números ímpares: " + totalImpares);
	        scanner.close();
	    } 
	}
