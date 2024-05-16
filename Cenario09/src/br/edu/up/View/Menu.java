package br.edu.up.View;

import java.util.Scanner;

import br.edu.up.Controller.*;
import br.edu.up.Model.*;

public class Menu {
    private cadastroClientes cadastro;
    private Scanner scanner;

    public Menu(cadastroClientes cadastro) {
        this.cadastro = cadastro;
        this.scanner = new Scanner(System.in);
    }

    public void exibirMenuPrincipal() {
        int opcao;
        do {
            System.out.println("Menu Principal");
            System.out.println("1. Cadastrar Cliente");
            System.out.println("2. Listar Clientes");
            System.out.println("3. Empréstimo");
            System.out.println("4. Devolução");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    exibirMenuCadastro();
                    break;
                case 2:
                    listarClientes();
                    break;
                case 3:
                    exibirMenuEmprestimo();
                    break;
                case 4:
                    exibirMenuDevolucao();
                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 5);
    }

    private void exibirMenuCadastro() {
        int tipoCliente;
		System.out.println("Cadastro de Clientes");
		System.out.println("1. Cliente Pessoa");
		System.out.println("2. Cliente Empresa");
		System.out.print("Escolha o tipo de cliente para cadastro: ");
		tipoCliente = scanner.nextInt();
		scanner.nextLine(); 

		String nome, telefone, email, cpf, cnpj, inscEstadual;
		double peso, altura;
		int anoFundacao;

		switch (tipoCliente) {
			case 1:
				System.out.print("Nome: ");
				nome = scanner.nextLine();
				System.out.print("Telefone: ");
				telefone = scanner.nextLine();
				System.out.print("Email: ");
				email = scanner.nextLine();
				System.out.print("CPF: ");
				cpf = scanner.nextLine();
				System.out.print("Peso: ");
				peso = scanner.nextDouble();
				System.out.print("Altura: ");
				altura = scanner.nextDouble();
				scanner.nextLine(); 
				cadastro.incluirClientePessoa(nome, telefone, email, cpf, peso, altura);
				break;
			case 2:
				System.out.print("Nome: ");
				nome = scanner.nextLine();
				System.out.print("Telefone: ");
				telefone = scanner.nextLine();
				System.out.print("Email: ");
				email = scanner.nextLine();
				System.out.print("CNPJ: ");
				cnpj = scanner.nextLine();
				System.out.print("Inscrição Estadual: ");
				inscEstadual = scanner.nextLine();
				System.out.print("Ano de Fundação: ");
				anoFundacao = scanner.nextInt();
				scanner.nextLine(); 
				cadastro.incluirClienteEmpresa(nome, telefone, email, cnpj, inscEstadual, anoFundacao);
				break;
			default:
				System.out.println("Opção inválida.");
		}
    }

    private void listarClientes() {
        System.out.println("Lista de Clientes:");
		for (Cliente cliente : cadastro.getClientes()) {
			System.out.println(cliente);
		}
    }

    private void exibirMenuEmprestimo() {
        System.out.print("Nome do cliente para empréstimo: ");
		String nome = scanner.nextLine();
		System.out.print("Valor do empréstimo: ");
		double valor = scanner.nextDouble();
		scanner.nextLine(); 
		cadastro.emprestarParaCliente(nome, valor);
    }

    private void exibirMenuDevolucao() {
        System.out.print("Nome do cliente para devolução: ");
		String nome = scanner.nextLine();
		System.out.print("Valor da devolução: ");
		double valor = scanner.nextDouble();
		scanner.nextLine(); 
		cadastro.devolucaoDeCliente(nome, valor);
    }
}
