package br.edu.up.Controller;

import java.util.ArrayList;
import java.util.Scanner;

import br.edu.up.Model.*;

public class ApoliceSeguros {
    private ArrayList<Seguro> seguros = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    // Método para incluir um seguro
    public void incluirSeguro() {
        System.out.println("Digite o número da apólice:");
        String apolice = scanner.nextLine();
        System.out.println("Escolha o tipo de seguro (1 para Vida, 2 para Veículo):");
        int tipo = scanner.nextInt();
        scanner.nextLine(); 

        if (tipo == 1) {
            System.out.println("O seguro cobre doença? (true/false):");
            boolean cobreDoenca = scanner.nextBoolean();
            System.out.println("O seguro cobre acidente? (true/false):");
            boolean cobreAcidente = scanner.nextBoolean();
            SeguroVida seguroVida = new SeguroVida(apolice, cobreDoenca, cobreAcidente);
            seguros.add(seguroVida);
        } else if (tipo == 2) {
            System.out.println("Digite o valor da franquia:");
            double vlrFranquia = scanner.nextDouble();
            System.out.println("Tem carro reserva? (true/false):");
            boolean temCarroReserva = scanner.nextBoolean();
            System.out.println("Cobre vidros? (true/false):");
            boolean cobreVidros = scanner.nextBoolean();
            SeguroVeiculo seguroVeiculo = new SeguroVeiculo(apolice, vlrFranquia, temCarroReserva, cobreVidros);
            seguros.add(seguroVeiculo);
        } else {
            System.out.println("Tipo de seguro inválido.");
        }
        System.out.println("Seguro incluído com sucesso.");
    }

    // Método para localizar um seguro
    public void localizarSeguro() {
        System.out.println("Digite o número da apólice:");
        String apolice = scanner.nextLine();
        for (Seguro seguro : seguros) {
            if (seguro.getApolice().equals(apolice)) {
                System.out.println("Seguro encontrado: " + seguro.getDados());
                return;
            }
        }
        System.out.println("Seguro não encontrado.");
    }

    // Método para excluir um seguro
    public void excluirSeguro() {
        System.out.println("Digite o número da apólice para exclusão:");
        String apolice = scanner.nextLine();
        for (Seguro seguro : seguros) {
            if (seguro.getApolice().equals(apolice)) {
                seguros.remove(seguro);
                System.out.println("Seguro excluído com sucesso.");
                return;
            }
        }
        System.out.println("Seguro não encontrado.");
    }

    // Método para excluir todos os seguros
    public void excluirTodosSeguros() {
        System.out.println("Tem certeza que deseja excluir todos os seguros? (S/N)");
        String resposta = scanner.nextLine();
        if (resposta.equalsIgnoreCase("S")) {
            seguros.clear();
            System.out.println("Todos os seguros foram excluídos.");
        } else {
            System.out.println("Operação cancelada.");
        }
    }

    // Método para retornar a quantidade de seguros
    public int quantidadeSeguros() {
        return seguros.size();
    }
    
    
    // Método para listar todos os seguros
    public void listarTodosSeguros() {
        if (seguros.isEmpty()) {
            System.out.println("Não há seguros cadastrados.");
        } else {
            for (Seguro seguro : seguros) {
                System.out.println(seguro.getDados());
            }
        }
    }
    
    //Escolha Menu
    public void executarAcao(int escolha) {
        switch (escolha) {
            case 1:
                // Lógica para incluir seguro
                incluirSeguro();
                System.out.println("Incluindo seguro...");
                break;
            case 2:
                // Lógica para localizar seguro
                localizarSeguro();
                break;
            case 3:
                // Lógica para excluir seguro
                excluirSeguro();
                break;
            case 4:
                // Lógica para excluir todos os seguros
                excluirTodosSeguros();
                break;
            case 5:
                // Lógica para listar todos os seguros
                listarTodosSeguros();
                break;
            case 6:
                // Lógica para ver quantidade de seguros
                quantidadeSeguros();
                break;
            case 7:
                System.out.println("Saindo...");
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }
        
        /* Scanner scanner = new Scanner(System.in);
        int escolha;
        do {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Incluir seguro");
            System.out.println("2. Localizar seguro");
            System.out.println("3. Excluir seguro");
            System.out.println("4. Excluir todos os seguros");
            System.out.println("5. Listar todos os seguros");
            System.out.println("6. Ver quantidade de seguros");
            System.out.println("7. Sair");
            escolha = scanner.nextInt();
            scanner.nextLine();
            
        } while (escolha != 7);
        scanner.close(); */
    }
}