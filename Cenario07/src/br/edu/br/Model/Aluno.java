package br.edu.br.Model;

public class Aluno extends Pessoa {
    private String matricula;
    private int anoIngresso;
    private String curso;
    private String turno;
    private int qtdCompetenciasNecessarias;
    private int qtdCompetenciasComplementares;

    
    public Aluno(String nome, String rg, String matricula, int anoIngresso, String curso, String turno, int qtdCompetenciasNecessarias, int qtdCompetenciasComplementares) {
        super(nome, rg);
        this.matricula = matricula;
        this.anoIngresso = anoIngresso;
        this.curso = curso;
        this.turno = turno;
        this.qtdCompetenciasNecessarias = qtdCompetenciasNecessarias;
        this.qtdCompetenciasComplementares = qtdCompetenciasComplementares;
    }

    
    public String getMatricula() {
        return matricula;
    }

    public int getAnoIngresso() {
        return anoIngresso;
    }

    public String getCurso() {
        return curso;
    }

    public String getTurno() {
        return turno;
    }

    public int getQtdCompetenciasNecessarias() {
        return qtdCompetenciasNecessarias;
    }

    public int getQtdCompetenciasComplementares() {
        return qtdCompetenciasComplementares;
    }
}
