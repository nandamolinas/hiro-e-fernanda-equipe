package br.edu.up.View;

import java.util.Scanner;

import br.edu.up.Controller.*;
import br.edu.up.Model.*;

public class EventoView {
    private EventoController controller;
    
    public EventoView(EventoController controller) {
        this.controller = controller;
    }
    
    public void printDetalhesEvento(Evento evento) {
        System.out.println("Evento: " + evento.getNome());
        System.out.println("Data: " + evento.getData());
        System.out.println("Local: " + evento.getLocal());
        System.out.println("Lotação Máxima: " + evento.getLotacaoMaxima());
        System.out.println("Ingressos Vendidos: " + evento.getIngressosVendidos());
        System.out.println("Preço do Ingresso: " + evento.getPrecoIngresso());
    }

    public void printDetalhesReserva(Reserva reserva) {
        System.out.println("Reserva em nome de: " + reserva.getNomeResponsavel());
        System.out.println("Quantidade de Pessoas: " + reserva.getQuantidadePessoas());
        System.out.println("Data da Reserva: " + reserva.getDataReserva());
        System.out.println("Valor Total: " + reserva.getValorTotal());
    }
    
   
    public void displayMenu(Scanner scanner) {
        int opcao = 0;
        do {
            System.out.println("\n--- Menu Principal ---");
            System.out.println("1. Incluir Evento");
            System.out.println("2. Listar Eventos");
            System.out.println("3. Alterar Evento");
            System.out.println("4. Excluir Evento");
            System.out.println("5. Realizar Reserva");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    controller.incluirEvento(scanner);
                    break;
                case 2:
                    controller.listarEventos();
                    break;
                case 3:
                    controller.alterarDadosEvento(scanner);
                    break;
                case 4:
                    controller.excluirEvento(scanner);
                    break;
                case 5:
                    controller.realizarReserva(scanner);
                    break;
                case 6:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 6);
    }
}
