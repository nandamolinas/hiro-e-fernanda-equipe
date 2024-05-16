package br.edu.up.Model;

public class SeguroVeiculo extends Seguro {
    private double vlrFranquia;
    private boolean temCarroReserva;
    private boolean cobreVidros;
    
    // Construtor
    public SeguroVeiculo(String apolice, double vlrFranquia, boolean temCarroReserva, boolean cobreVidros) {
        super(apolice);
        this.vlrFranquia = vlrFranquia;
        this.temCarroReserva = temCarroReserva;
        this.cobreVidros = cobreVidros;
    }
    

    public SeguroVeiculo(String apolice) {
        super(apolice);
    }

    // Getters e Setters
    public double getVlrFranquia() {
        return vlrFranquia;
    }

    public void setVlrFranquia(double vlrFranquia) {
        this.vlrFranquia = vlrFranquia;
    }

    public boolean isTemCarroReserva() {
        return temCarroReserva;
    }

    public void setTemCarroReserva(boolean temCarroReserva) {
        this.temCarroReserva = temCarroReserva;
    }

    public boolean isCobreVidros() {
        return cobreVidros;
    }

    public void setCobreVidros(boolean cobreVidros) {
        this.cobreVidros = cobreVidros;
    }

    @Override
    public String getDados() {
        return "SeguroVeiculo{" +
                "vlrFranquia=" + vlrFranquia +
                ", temCarroReserva=" + temCarroReserva +
                ", cobreVidros=" + cobreVidros +
                ", apolice='" + getApolice() + '\'' +
                // Incluir outros atributos conforme necessário
                '}';
    }
}