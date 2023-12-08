package modulo10;

	import java.util.Scanner;

	public class atv05DoWhile {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        int numero;	        int soma = 0;
	        do {
	            System.out.print("Digite um número: ");
	            numero = scanner.nextInt();

	            if (numero > 0) {       soma += numero;
	            }
	        } while (numero != 0); 

	        System.out.println("\nA soma dos números positivos é: " + soma);
	        scanner.close();
	    }
	}  