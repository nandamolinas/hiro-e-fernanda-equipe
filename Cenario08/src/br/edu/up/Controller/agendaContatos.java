package br.edu.up.Controller;

import java.util.Scanner;

import br.edu.up.Model.*;
import br.edu.up.View.*;

public class agendaContatos {
    private Agenda agenda;
    private Menu menu;

    public agendaContatos() {
        this.agenda = new Agenda();
        this.menu = new Menu(this);
    }

    public void iniciar() {
        menu.exibirMenu();
    }

    public void processarOpcao(int opcao) {
        Scanner scanner = menu.getScanner();
        switch (opcao) {
            case 1:
                // Incluir pessoal
                System.out.print("Digite o código: ");
                int codigoP = scanner.nextInt();
                scanner.nextLine(); 
                System.out.print("Digite o nome: ");
                String nomeP = scanner.nextLine();
                System.out.print("Digite o telefone: ");
                String telefoneP = scanner.nextLine();
                System.out.print("Digite a data de aniversário: ");
                String aniversario = scanner.nextLine();
                Pessoal pessoal = new Pessoal(codigoP, nomeP, telefoneP, aniversario);
                agenda.adicionarContato(pessoal);
                break;
            case 2:
                // Incluir comercial
                System.out.print("Digite o código: ");
                int codigoC = scanner.nextInt();
                scanner.nextLine(); 
                System.out.print("Digite o nome: ");
                String nomeC = scanner.nextLine();
                System.out.print("Digite o telefone: ");
                String telefoneC = scanner.nextLine();
                System.out.print("Digite o CNPJ: ");
                String cnpj = scanner.nextLine();
                Comercial comercial = new Comercial(codigoC, nomeC, telefoneC, cnpj);
                agenda.adicionarContato(comercial);
                break;
            case 3:
                // Excluir 
                System.out.print("Digite o código do contato a ser excluído: ");
                int codigoExcluir = scanner.nextInt();
                agenda.excluirContato(codigoExcluir);
                break;
            case 4:
                // Consultar 
                System.out.print("Digite o código do contato a ser consultado: ");
                int codigoConsultar = scanner.nextInt();
                Contato contato = agenda.getContato(codigoConsultar);
                if (contato != null) {
                    System.out.println("Contato encontrado: " + contato);
                } else {
                    System.out.println("Contato não encontrado.");
                }
                break;
            case 5:
                
                agenda.listarContatos();
                break;
            case 6:
                
                System.out.println("Saindo do programa.");
                scanner.close();
                break;
            default:
                System.out.println("Opção inválida. Tente novamente.");
                break;
        }
    }
}