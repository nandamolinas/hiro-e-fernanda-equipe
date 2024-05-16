package br.edu.up.Model;

public class SeguroVida extends Seguro {
    private boolean cobreDoenca;
    private boolean cobreAcidente;
    
    // Construtor
    public SeguroVida(String apolice, boolean cobreDoenca, boolean cobreAcidente) {
        super(apolice);
        this.cobreDoenca = cobreDoenca;
        this.cobreAcidente = cobreAcidente;
    }
    

    public SeguroVida(String apolice) {
        super(apolice);
    }

    // Getters e Setters
    public boolean isCobreDoenca() {
        return cobreDoenca;
    }

    public void setCobreDoenca(boolean cobreDoenca) {
        this.cobreDoenca = cobreDoenca;
    }

    public boolean isCobreAcidente() {
        return cobreAcidente;
    }

    public void setCobreAcidente(boolean cobreAcidente) {
        this.cobreAcidente = cobreAcidente;
    }

    @Override
    public String getDados() {
        // Implementação do método getDados
        return "SeguroVida{" +
            "cobreDoenca=" + cobreDoenca +
            ", cobreAcidente=" + cobreAcidente +
            ", apolice='" + getApolice() + '\'' +
            // Incluir outros atributos conforme necessário
            '}';
    }
}