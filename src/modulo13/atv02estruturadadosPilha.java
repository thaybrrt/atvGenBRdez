package modulo13;

	import java.util.Stack;
	import java.util.Scanner;

	public class atv02estruturadadosPilha {
	    public static void main(String[] args) {
	        Stack<String> pilhaLivros = new Stack<>();
	        Scanner scanner = new Scanner(System.in);
	        int opcao;

	        do {
	            System.out.println("Menu\n");
	            System.out.println("1: Adicionar livro na pilha | 2: Listar todos os livros | 3: Retirar livro da pilha | 0: Sair");
	            System.out.print("\nEntre com a opção desejada: ");
	            opcao = scanner.nextInt();
	            scanner.nextLine();

	            switch (opcao) {
	                case 1:
	                    System.out.print("Digite o nome: ");
	                    pilhaLivros.push(scanner.nextLine());
	                    System.out.println("\nPilha: " + pilhaLivros + "\nLivro adicionado!\n");
	                    break;
	                case 2:
	                    System.out.println("Lista de Livros na Pilha:" + pilhaLivros + "\n");
	                    break;
	                case 3:
	                    if (!pilhaLivros.isEmpty()) {
	                        System.out.println("Pilha: " + pilhaLivros.pop() + "\nUm Livro foi retirado da pilha!\n");
	                    } else {
	                        System.out.println("A Pilha está vazia!\n");
	                    }
	                    break;
	                case 0:
	                    System.out.println("Programa Finalizado!");
	                    break;
	                default:
	                    System.out.println("Opção inválida! Tente novamente.\n");
	            }
	        } while (opcao != 0);

	        scanner.close();
	    }
	}