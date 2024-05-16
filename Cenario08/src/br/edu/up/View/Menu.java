package br.edu.up.View;

import java.util.Scanner;
import br.edu.up.Controller.*;

public class Menu {
    private Scanner scanner;
    private agendaContatos agendaContatos;

    public Menu(agendaContatos agendaContatos) {
        this.scanner = new Scanner(System.in);
        this.agendaContatos = agendaContatos;
    }

    public void exibirMenu() {
        int opcao;
        do {
            System.out.println("Menu:");
            System.out.println("1. Incluir um contato pessoal");
            System.out.println("2. Incluir um contato comercial");
            System.out.println("3. Excluir um contato pelo código");
            System.out.println("4. Consultar um contato pelo código");
            System.out.println("5. Listar todos os contatos");
            System.out.println("6. Sair do programa");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            agendaContatos.processarOpcao(opcao);
        } while (opcao != 6);
    }

    public Scanner getScanner() {
        return scanner;
    }
}