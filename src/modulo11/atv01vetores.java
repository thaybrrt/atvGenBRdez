package modulo11;

import java.util.Scanner;

public class atv01vetores {

		    public static void main(String[] args) {
		        int vetor[] = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
		        Scanner leia = new Scanner(System.in);

		       System.out.println("Vetor:");
		        for (int a = 0; a < 10; a++) {
		            System.out.println(a + ": " + vetor[a]);
		        }
		        System.out.println("\nDigite o número que você deseja encontrar:");
		        int num = leia.nextInt();

		        int posicao = -1;
		        for (int b = 0; b < 10; b++) {
		            if (vetor[b] == num) {
		                posicao = b;
		                break;
		            }
		        }

		        if (posicao != -1) {
		            System.out.println("O número " + num + " está localizado na posição: " + posicao);
		        } else {
		            System.out.println("O número " + num + " não foi encontrado!");
		        }
		    }
		}