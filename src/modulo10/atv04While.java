package modulo10;

import java.util.Scanner;

public class atv04While {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalBackend = 0, totalFrontendMulheres = 0, totalMobileHomens40 = 0, totalFullStackNaoBinarios30 = 0;
        int totalPessoas = 0, somaIdades = 0;

        char continuar = 'S';

        while (Character.toUpperCase(continuar) == 'S') {
            int idade = lerInteiro(scanner, "Idade: ");
            int identidadeGenero = lerInteiro(scanner, "Identidade de Gênero: ");
            int pessoaDesenvolvedora = lerInteiro(scanner, "Pessoa Desenvolvedora: ");

            if (pessoaDesenvolvedora == 1) totalBackend++;
            if ((identidadeGenero == 1 || identidadeGenero == 4) && pessoaDesenvolvedora == 2) totalFrontendMulheres++;
            if ((identidadeGenero == 2 || identidadeGenero == 5) && pessoaDesenvolvedora == 3 && idade > 40) totalMobileHomens40++;
            if (identidadeGenero == 3 && pessoaDesenvolvedora == 4 && idade < 30) totalFullStackNaoBinarios30++;

            totalPessoas++;
            somaIdades += idade;

            continuar = lerChar(scanner, "Deseja continuar (S/N): ");
        }

        exibirResultados(totalBackend, totalFrontendMulheres, totalMobileHomens40, totalFullStackNaoBinarios30, totalPessoas, somaIdades);

        scanner.close();
    }

    private static int lerInteiro(Scanner scanner, String mensagem) {
        System.out.print(mensagem);
        return scanner.nextInt();
    }

    private static char lerChar(Scanner scanner, String mensagem) {
        System.out.print(mensagem);
        return scanner.next().charAt(0);
    }

    private static void exibirResultados(int totalBackend, int totalFrontendMulheres, int totalMobileHomens40,
            int totalFullStackNaoBinarios30, int totalPessoas, int somaIdades) {
        System.out.printf("\nTotal de pessoas desenvolvedoras Backend: %d%n", totalBackend);
        System.out.printf("Total de Mulheres Cis e Trans desenvolvedoras Frontend: %d%n", totalFrontendMulheres);
        System.out.printf("Total de Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos: %d%n", totalMobileHomens40);
        System.out.printf("Total de Pessoas Não Binárias desenvolvedoras FullStack menores de 30 anos: %d%n", totalFullStackNaoBinarios30);
        System.out.printf("O número total de pessoas que responderam à pesquisa: %d%n", totalPessoas);

        if (totalPessoas > 0) {
            double mediaIdades = (double) somaIdades / totalPessoas;
            System.out.printf("A média de idade das pessoas que responderam à pesquisa: %.2f%n", mediaIdades);
        } else {
            System.out.println("Nenhuma resposta na pesquisa.");
        } 
    }
}  
