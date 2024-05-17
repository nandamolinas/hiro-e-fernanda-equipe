package br.edu.up.model;

public class Relatorio {
    public void gerarRelatorio(Estacionamento estacionamento) {
        System.out.println("Relatório do Período:");
        System.out.println("Veículos no estacionamento:");
        for (Veiculo veiculo : estacionamento.getVagas()) {
            System.out.println(veiculo);
        }
        System.out.println("Total de entradas: " + estacionamento.getEntradas());
        System.out.println("Total de saídas: " + estacionamento.getSaidas());
        System.out.println("Valor total de pagamentos: R$ " + estacionamento.calcularPagamento());
    }
}


