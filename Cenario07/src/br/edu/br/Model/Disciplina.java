package br.edu.br.Model;

public class Disciplina {
    private String nome;
    private String identificador;
    private String curriculo;
    private Professor professor;
    private int cargaHorariaTeorica;
    private int cargaHorariaPratica;

    
    public Disciplina(String nome, String identificador, String curriculo, Professor professor, int cargaHorariaTeorica, int cargaHorariaPratica) {
        this.nome = nome;
        this.identificador = identificador;
        this.curriculo = curriculo;
        this.professor = professor;
        this.cargaHorariaTeorica = cargaHorariaTeorica;
        this.cargaHorariaPratica = cargaHorariaPratica;
    }

    
    public String getNome() {
        return nome;
    }

    public String getIdentificador() {
        return identificador;
    }

    public String getCurriculo() {
        return curriculo;
    }

    public Professor getProfessor() {
        return professor;
    }

    public int getCargaHorariaTeorica() {
        return cargaHorariaTeorica;
    }

    public int getCargaHorariaPratica() {
        return cargaHorariaPratica;
    }
}
