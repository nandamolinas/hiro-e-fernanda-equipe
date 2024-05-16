package br.edu.up.View;

import java.util.Scanner;

import br.edu.up.Controller.*;

public class Menu {
    // Métodos para exibir o menu e capturar a escolha do usuário
    public static void exibirMenu() {
        System.out.println("1. Incluir seguro");
        System.out.println("2. Localizar seguro");
        System.out.println("3. Excluir seguro");
        System.out.println("4. Excluir todos os seguros");
        System.out.println("5. Listar todos os seguros");
        System.out.println("6. Ver quantidade de seguros");
        System.out.println("7. Sair");
    }
    
    
    // Método para processar a escolha do usuário
    public static void processarEscolha(ApoliceSeguros controller) {
        Scanner scanner = new Scanner(System.in);
        int escolha;
        do {
            exibirMenu();
            System.out.print("Escolha uma opção: ");
            escolha = scanner.nextInt();
            scanner.nextLine(); // Consume newline left-over
            switch (escolha) {
                case 1:
                    controller.incluirSeguro();
                    break;
                case 2:
                    controller.localizarSeguro();
                    break;
                case 3:
                    controller.excluirSeguro();
                    break;
                case 4:
                    controller.excluirTodosSeguros();
                    break;
                case 5:
                    controller.listarTodosSeguros();
                    break;
                case 6:
                    controller.quantidadeSeguros();
                    break;
                case 7:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        } while (escolha != 7);
        scanner.close();
    }
}