package br.edu.up.Model;

public class Comissario extends Tripulacao {
    private String[] idiomasFluencia;
    private Aeronave aeronave;

    public Comissario(String nome, String rg, String identificacaoAeronautica, String matriculaFuncionario, String[] idiomasFluencia, Aeronave aeronave) {
        super(nome, rg, identificacaoAeronautica, matriculaFuncionario);
        this.idiomasFluencia = idiomasFluencia;
        this.aeronave = aeronave;
    }

    
    public Aeronave getAeronave() {
        return aeronave;
    }
    public void setAeronave(Aeronave aeronave) {
        this.aeronave = aeronave;
    }


    public String[] getIdiomasFluencia() { 
        return idiomasFluencia; 
    }
    public void setIdiomasFluencia(String[] idiomasFluencia) { 
        this.idiomasFluencia = idiomasFluencia; 
    }
}