package br.edu.up;

import java.util.ArrayList;
import java.util.List;

public class Mes {
    private String nome;
    private int quantidadeDeDias;
    private List<Dia> dias;

    public Mes(int quantidadeDeDias, String nome) {
        this.quantidadeDeDias = quantidadeDeDias;
        this.nome = nome;
        this.dias = new ArrayList<>();
        for (int i = 1; i <= quantidadeDeDias; i++) {
            dias.add(new Dia(i));
        }
    }

    public void adicionarDia(Dia dia) {
        dias.add(dia);
    }

    public void adicionarCompromisso(Compromisso comp, int diaMes) {
        if (diaMes > 0 && diaMes <= quantidadeDeDias) {
            dias.get(diaMes - 1).adicionarCompromisso(comp);
        }
    }

    public void adicionarCompromisso(String pessoa, String local, String assunto, int hora, int diaMes) {
        Compromisso comp = new Compromisso(pessoa, local, assunto, hora);
        adicionarCompromisso(comp, diaMes);
    }

    public void excluirCompromisso(int diaMes, int hora) {
        if (diaMes > 0 && diaMes <= quantidadeDeDias) {
            dias.get(diaMes - 1).excluirCompromisso(hora);
        }
    }

    public List<Compromisso> listarCompromissos(int diaMes) {
        if (diaMes > 0 && diaMes <= quantidadeDeDias) {
            return dias.get(diaMes - 1).listarCompromissos();
        }
        return new ArrayList<>();
    }

    public List<Compromisso> listarCompromissos() {
        List<Compromisso> todosCompromissos = new ArrayList<>();
        for (Dia dia : dias) {
            todosCompromissos.addAll(dia.listarCompromissos());
        }
        return todosCompromissos;
    }

    public String getNome() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getNome'");
    }
}

