package br.edu.up.view;

import br.edu.up.controller.*;
import br.edu.up.model.Relatorio;
import br.edu.up.Programa;


import java.util.Scanner;

public class Menu {
    private Estacionamentocontroller controller;
    private Relatorio relatorio;
    private Scanner scanner;

    public Menu() {
        this.controller = new Estacionamentocontroller();
        this.relatorio = new Relatorio();
        this.scanner = new Scanner(System.in);
    }

    public void exibirMenu() {
        while (true) {
            System.out.println("1. Registrar entrada de veículo");
            System.out.println("2. Registrar saída de veículo");
            System.out.println("3. Gerar relatório");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (opcao) {
                case 1:
                    registrarEntrada();
                    break;
                case 2:
                    registrarSaida();
                    break;
                case 3:
                    gerarRelatorio();
                    break;
                case 4:
                    System.out.println("Saindo do sistema...");
                    return;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }

    private void registrarEntrada() {
        System.out.print("Modelo: ");
        String modelo = scanner.nextLine();
        System.out.print("Placa: ");
        String placa = scanner.nextLine();
        System.out.print("Cor: ");
        String cor = scanner.nextLine();

        boolean sucesso = controller.registrarEntrada(modelo, placa, cor);
        if (sucesso) {
            System.out.println("Veículo registrado com sucesso.");
        } else {
            System.out.println("Estacionamento lotado.");
        }
    }

    private void registrarSaida() {
        System.out.print("Placa: ");
        String placa = scanner.nextLine();

        boolean sucesso = controller.registrarSaida(placa);
        if (sucesso) {
            System.out.println("Veículo removido com sucesso.");
        } else {
            System.out.println("Veículo não encontrado.");
        }
    }

    private void gerarRelatorio() {
        relatorio.gerarRelatorio(controller.getEstacionamento());
    }
}
