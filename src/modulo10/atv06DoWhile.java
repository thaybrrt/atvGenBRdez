package modulo10;

	import java.util.Scanner;

	public class atv06DoWhile {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        int num, soma = 0, multiplo = 0;

	        do {
	            System.out.print("Digite um número: ");
	            num = scanner.nextInt(); 

	            if (num != 0 && num % 3 == 0) {
	                soma += num;
	                multiplo++;
	            }
	        } while (num != 0);
	        double media = (multiplo > 0) ? (double) soma / multiplo : 0;

	        System.out.println("\nA média de todos os números múltiplos de 3 é: " + media);
	        scanner.close();
	    }
	} 