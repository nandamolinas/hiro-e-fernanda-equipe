package br.edu.up.model;

public class Veiculo {
    private String modelo;
    private String placa;
    private String cor;

    public Veiculo(String modelo, String placa, String cor) {
        this.modelo = modelo;
        this.placa = placa;
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public String getCor() {
        return cor;
    }

    @Override
    public String toString() {
        return "Modelo: " + modelo + ", Placa: " + placa + ", Cor: " + cor;
    }
}
