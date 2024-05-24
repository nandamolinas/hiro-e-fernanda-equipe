package br.edu.up.Model;

public class Reserva {
    private String nomeResponsavel;
    private int quantidadePessoas;
    private String dataReserva;
    private double valorTotal;

    
    public Reserva(String nomeResponsavel, int quantidadePessoas, String dataReserva, double valorTotal) {
        this.nomeResponsavel = nomeResponsavel;
        this.quantidadePessoas = quantidadePessoas;
        this.dataReserva = dataReserva;
        this.valorTotal = valorTotal;
    }

    
    public String getNomeResponsavel() { return nomeResponsavel; }
    public void setNomeResponsavel(String nomeResponsavel) { this.nomeResponsavel = nomeResponsavel; }

    public int getQuantidadePessoas() { return quantidadePessoas; }
    public void setQuantidadePessoas(int quantidadePessoas) { this.quantidadePessoas = quantidadePessoas; }

    public String getDataReserva() { return dataReserva; }
    public void setDataReserva(String dataReserva) { this.dataReserva = dataReserva; }

    public double getValorTotal() { return valorTotal; }
    public void setValorTotal(double valorTotal) { this.valorTotal = valorTotal; }
}
