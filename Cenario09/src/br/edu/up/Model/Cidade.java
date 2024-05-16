package br.edu.up.Model;

public class Cidade {
    private String nome;
    private String uf;

    public Cidade(String nome, String uf) {
        this.nome = nome;
        this.uf = uf;
    }

    public String getNome() { 
        return nome; 
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUf() { 
        return uf; 
    }

    public void setUf(String uf) { 
        this.uf = uf; 
    }

    @Override
    public String toString() {
        return "Cidade{" +
                "nome='" + nome + '\'' +
                ", uf='" + uf + '\'' +
                '}';
    }
}