package br.edu.up;

import java.util.ArrayList;
import java.util.List;

public class Ano {
    private int ano;
    private boolean bissexto;
    private List<Mes> meses;

    public Ano(int ano, boolean bissexto) {
        this.ano = ano;
        this.bissexto = bissexto;
        this.meses = new ArrayList<>();
    }

    public void adicionarMes(Mes mes) {
        meses.add(mes);
    }

    public void excluirCompromisso(String nomeMes, int diaMes, int hora) {
        for (Mes mes : meses) {
            if (mes.getNome().equalsIgnoreCase(nomeMes)) {
                mes.excluirCompromisso(diaMes, hora);
            }
        }
    }

    public List<Compromisso> listarCompromissos(String nomeMes) {
        for (Mes mes : meses) {
            if (mes.getNome().equalsIgnoreCase(nomeMes)) {
                return mes.listarCompromissos();
            }
        }
        return new ArrayList<>();
    }

    public List<Compromisso> listarCompromissos() {
        List<Compromisso> todosCompromissos = new ArrayList<>();
        for (Mes mes : meses) {
            todosCompromissos.addAll(mes.listarCompromissos());
        }
        return todosCompromissos;
    }
}


