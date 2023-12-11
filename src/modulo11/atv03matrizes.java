package modulo11;

import java.util.Scanner;

public class atv03matrizes {

	    public static void main(String[] args) {
	        Scanner leia = new Scanner(System.in);
	        int matriz[][] = new int[3][3];

	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++) {
	                System.out.println("Digite o elemento na posição [" + i + "][" + j + "]: ");
	                matriz[i][j] = leia.nextInt();
	            }
	        }
	        System.out.println("\nElementos da Diagonal Principal:");
	        for (int i = 0; i < 3; i++) {
	            System.out.print(matriz[i][i] + " ");
	        }

	        System.out.println("\n\nElementos da Diagonal Secundária:");
	        for (int i = 0; i < 3; i++) {
	            System.out.print(matriz[i][2 - i] + " ");
	        }

	        int principal = 0;
	        for (int i = 0; i < 3; i++) {
	            principal += matriz[i][i];
	        }
	        System.out.println("\n\nSoma dos Elementos da Diagonal Principal:\n" + principal);

	        int secundaria = 0;
	        for (int i = 0; i < 3; i++) {
	            secundaria += matriz[i][2 - i];
	        }
	        System.out.println("\nSoma dos Elementos da Diagonal Secundária:\n" + secundaria);
	    }
	} 