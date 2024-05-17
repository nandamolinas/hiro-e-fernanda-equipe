package br.edu.up.controller;

import br.edu.up.model.Estacionamento;
import br.edu.up.model.Veiculo;


public class Estacionamentocontroller {
    private Estacionamento estacionamento;

    public Estacionamentocontroller() {
        this.estacionamento = new Estacionamento();
    }

    public boolean registrarEntrada(String modelo, String placa, String cor) {
        Veiculo veiculo = new Veiculo(modelo, placa, cor);
        return estacionamento.entradaVeiculo(veiculo);
    }

    public boolean registrarSaida(String placa) {
        return estacionamento.saidaVeiculo(placa);
    }

    public Estacionamento getEstacionamento() {
        return estacionamento;
    }
}
