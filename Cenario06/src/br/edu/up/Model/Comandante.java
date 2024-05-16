package br.edu.up.Model;

public class Comandante extends Tripulacao {
    private int totalHorasVoo;
    private Aeronave aeronave;

    public Comandante(String nome, String rg, String identificacaoAeronautica, String matriculaFuncionario, int totalHorasVoo, Aeronave aeronave) {
        super(nome, rg, identificacaoAeronautica, matriculaFuncionario);
        this.totalHorasVoo = totalHorasVoo;
        this.aeronave = aeronave;
    }

    
    public Aeronave getAeronave() {
        return aeronave;
    }
    public void setAeronave(Aeronave aeronave) {
        this.aeronave = aeronave;
    }


    public int getTotalHorasVoo() { 
        return totalHorasVoo; 
    }
    public void setTotalHorasVoo(int totalHorasVoo) { 
        this.totalHorasVoo = totalHorasVoo; 
    }
}