package br.edu.up.model;

import java.util.ArrayList;
import java.util.List;

public class Estacionamento {
    private static final int MAX_VAGAS = 10;
    private List<Veiculo> vagas;
    private int entradas;
    private int saidas;

    public Estacionamento() {
        this.vagas = new ArrayList<>();
        this.entradas = 0;
        this.saidas = 0;
    }

    public boolean entradaVeiculo(Veiculo veiculo) {
        if (vagas.size() < MAX_VAGAS) {
            vagas.add(veiculo);
            entradas++;
            return true;
        } else {
            return false;
        }
    }

    public boolean saidaVeiculo(String placa) {
        for (Veiculo veiculo : vagas) {
            if (veiculo.getPlaca().equalsIgnoreCase(placa)) {
                vagas.remove(veiculo);
                saidas++;
                return true;
            }
        }
        return false;
    }

    public List<Veiculo> getVagas() {
        return vagas;
    }

    public int getEntradas() {
        return entradas;
    }

    public int getSaidas() {
        return saidas;
    }

    public double calcularPagamento() {
        return saidas * 5.0;
    }
}

