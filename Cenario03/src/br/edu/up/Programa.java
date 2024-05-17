package br.edu.up;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Agenda agenda = new Agenda(2024, false);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1 - Adicionar compromisso");
            System.out.println("2 - Excluir compromisso");
            System.out.println("3 - Listar compromissos de um mês");
            System.out.println("4 - Listar todos os compromissos");
            System.out.println("5 - Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            if (opcao == 1) {
                System.out.print("Nome do mês: ");
                String nomeMes = scanner.nextLine();

                System.out.print("Dia do mês: ");
                int diaMes = scanner.nextInt();
                scanner.nextLine(); // Consumir a quebra de linha

                System.out.print("Pessoa: ");
                String pessoa = scanner.nextLine();

                System.out.print("Local: ");
                String local = scanner.nextLine();

                System.out.print("Assunto: ");
                String assunto = scanner.nextLine();

                System.out.print("Hora (0-23): ");
                int hora = scanner.nextInt();

                agenda.adicionarCompromisso(nomeMes, diaMes, pessoa, local, assunto, hora);
                System.out.println("Compromisso adicionado com sucesso!");
            } else if (opcao == 2) {
                System.out.print("Nome do mês: ");
                String nomeMes = scanner.nextLine();

                System.out.print("Dia do mês: ");
                int diaMes = scanner.nextInt();

                System.out.print("Hora (0-23): ");
                int hora = scanner.nextInt();

                agenda.excluirCompromisso(nomeMes, diaMes, hora);
                System.out.println("Compromisso excluído com sucesso!");
            } else if (opcao == 3) {
                System.out.print("Nome do mês: ");
                String nomeMes = scanner.nextLine();

                agenda.listarCompromissos(nomeMes);
            } else if (opcao == 4) {
                agenda.listarCompromissos();
            } else if (opcao == 5) {
                break;
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }

        scanner.close();
    }
}
