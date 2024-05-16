package br.edu.up.View;

import java.util.Scanner;

import br.edu.up.Controller.ControladorTrafegoAereo;
import br.edu.up.Model.*;

public class Menu {
    private ControladorTrafegoAereo controlador;
    private Scanner scanner;

    public Menu() {
        controlador = new ControladorTrafegoAereo();
        scanner = new Scanner(System.in);
    }

    public void exibirMenu() {
        int opcao;
        do {
            System.out.println("Controle de Trafego Aereo");
            System.out.println("1. Registrar Pessoa");
            System.out.println("2. Registrar Aeronave");
            System.out.println("3. Buscar Pessoa por RG");
            System.out.println("4. Buscar Aeronave por Codigo");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opcao: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    registrarPessoa();
                    break;
                case 2:
                    registrarAeronave();
                    break;
                case 3:
                    buscarPessoaPorRG();
                    break;
                case 4:
                    buscarAeronavePorCodigo();
                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opcao invalida!");
            }
        } while (opcao != 5);
    }

    private void registrarPessoa() {
        System.out.println("Escolha o tipo de pessoa para registrar:");
        System.out.println("1 - Passageiro");
        System.out.println("2 - Comandante");
        System.out.println("3 - Comissario");
        int opcao = scanner.nextInt();
        scanner.nextLine(); 

        switch (opcao) {
            case 1:
                registrarPassageiro();
                break;
            case 2:
                registrarComandante();
                break;
            case 3:
                registrarComissario();
                break;
            default:
                System.out.println("Opção invalida.");
                break;
        }
    }

    private void registrarPassageiro() {
        System.out.println("Digite o nome do passageiro:");
        String nome = scanner.nextLine();
        System.out.println("Digite o RG do passageiro:");
        String rg = scanner.nextLine();

        System.out.println("Digite o identificadir da bagagem do passageiro:");
        String identificadorBagagem = scanner.nextLine();

        System.out.println("Digite as informacoes da passagem do passageiro:");
        Passagem passagem = Passagem.criarPassagem(scanner.nextLine());

        System.out.println("Digite as informacoes da aeronave do passageiro:");
        Aeronave aeronave = Aeronave.criarAeronave(scanner.nextLine());
        

        Passageiro passageiro = new Passageiro(nome, rg, identificadorBagagem, passagem, aeronave);
        controlador.registrarPassageiro(passageiro);
        System.out.println("Passageiro registrado com sucesso!");
    }

    private void registrarComandante() {
        System.out.println("Digite o nome do comandante:");
        String nome = scanner.nextLine();
        System.out.println("Digite o RG do comandante:");
        String rg = scanner.nextLine();
        
        System.out.println("Digite a identificacao aeronautica do comandante:");
        String identificacaoAeronautica = scanner.nextLine();

        System.out.println("Digite a matricula de funcionario do comandante:");
        String matriculaFuncionario = scanner.nextLine();

        System.out.println("Digite a quantida de horas de voo do comandante:");
        int totalHorasVoo = scanner.nextInt();

        System.out.println("Digite as informacoes da aeronave do comandante:");
        Aeronave aeronave = Aeronave.criarAeronave(scanner.nextLine());
        

        Comandante comandante = new Comandante(nome, rg, identificacaoAeronautica, matriculaFuncionario, totalHorasVoo, aeronave);
        controlador.registrarComandante(comandante);
        System.out.println("Comandante registrado com sucesso!");
    }

    private void registrarComissario() {
        System.out.println("Digite o nome do comissário:");
        String nome = scanner.nextLine();
        System.out.println("Digite o RG do comissário:");
        String rg = scanner.nextLine();
        
        System.out.println("Digite a identificacao aeronautica do comissario:");
        String identificacaoAeronautica = scanner.nextLine();

        System.out.println("Digite a matricula de funcionario do comissario:");
        String matriculaFuncionario = scanner.nextLine();

        System.out.println("Digite os idiomas do comissario:");
        String idiomasInput = scanner.nextLine();
        String[] idiomasFluencia = idiomasInput.split(",");

        System.out.println("Digite as informacoes da aeronave do comissario:");
        Aeronave aeronave = Aeronave.criarAeronave(scanner.nextLine());

        Comissario comissario = new Comissario(nome, rg, identificacaoAeronautica, matriculaFuncionario, idiomasFluencia, aeronave);
        controlador.registrarComissario(comissario);
        System.out.println("Comissário registrado com sucesso!");
    }

    private void registrarAeronave() {
        System.out.println("Digite o codigo da aeronave:");
        String codigo = scanner.nextLine();
        System.out.println("Digite o tipo da aeronave:");
        String tipo = scanner.nextLine();
        System.out.println("Digite a capacidade da aeronave:");
        int capacidade = scanner.nextInt();
        scanner.nextLine(); 

        Aeronave aeronave = new Aeronave(codigo, tipo, capacidade);
        controlador.registrarAeronave(aeronave);
        System.out.println("Aeronave registrada com sucesso!");
    }

    private void buscarPessoaPorRG() {
        System.out.println("Digite o RG da pessoa que deseja buscar:");
        String rg = scanner.nextLine();
    
        Passageiro passageiro = controlador.buscarPassageiroPorRG(rg);
        Comandante comandante = controlador.buscarComandantePorRG(rg);
        Comissario comissario = controlador.buscarComissarioPorRG(rg);
    
        if (passageiro != null) {
            System.out.println("Passageiro encontrado: " + passageiro);
        } else if (comandante != null) {
            System.out.println("Comandante encontrado: " + comandante);
        } else if (comissario != null) {
            System.out.println("Comissário encontrado: " + comissario);
        } else {
            System.out.println("Pessoa nao encontrada.");
        }
    }
    

    private void buscarAeronavePorCodigo() {
        System.out.println("Digite o codigo da aeronave que deseja buscar:");
        String codigo = scanner.nextLine();
        Aeronave aeronave = controlador.buscarAeronavePorCodigo(codigo);

        if (aeronave != null) {
            System.out.println("Aeronave encontrada: " + aeronave);
            
        } else {
            System.out.println("Aeronave nao encontrada.");
        }
    }
}
