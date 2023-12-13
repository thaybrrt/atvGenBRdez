package modulo13;

	import java.util.LinkedList;
	import java.util.Queue;
	import java.util.Scanner;

	public class atv01estruturadadosFila {
	    public static void main(String[] args) {
	        Queue<String> filaClientes = new LinkedList<>();
	        Scanner scanner = new Scanner(System.in);
	        int opcao;

	        do {
	            System.out.println("1: Adicionar cliente na fila | 2: Listar todos os clientes | 3: Retirar Cliente da Fila | 0: Sair\n");
	            System.out.print("Entre com a opção desejada: ");
	            opcao = scanner.nextInt();
	            scanner.nextLine();

	            switch (opcao) {
	                case 1:
	                    System.out.print("Digite o nome: ");
	                    filaClientes.add(scanner.nextLine());
	                    System.out.println("\nFila: " + filaClientes + "\nCliente Adicionado!\n");
	                    break;
	                case 2:
	                    System.out.println("\nFila: " + filaClientes + "\n");
	                    break;
	                case 3:
	                    if (!filaClientes.isEmpty()) {
	                        System.out.println("Fila: " + filaClientes.poll() + "\nO Cliente foi Chamado!\n");
	                    } else {
	                        System.out.println("\nA Fila está vazia!\n");
	                    }
	                    break;
	                case 0:
	                    System.out.println("Programa Finalizado!");
	                    break;
	                default:
	                    System.out.println("Opção inválida! Tente novamente.");
	            }
	        } while (opcao != 0);

	        scanner.close();
	    }
	} 