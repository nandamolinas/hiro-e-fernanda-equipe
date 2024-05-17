package br.edu.up;

import java.util.List;

public class Agenda {
    private Ano ano;

    public Agenda(int ano, boolean bissexto) {
        this.ano = new Ano(ano, bissexto);
        inicializarMeses();
    }

    private void inicializarMeses() {
        ano.adicionarMes(new Mes(31, "Janeiro"));
        ano.adicionarMes(new Mes(28, "Fevereiro"));
        ano.adicionarMes(new Mes(31, "Março"));
        ano.adicionarMes(new Mes(30, "Abril"));
        ano.adicionarMes(new Mes(31, "Maio"));
        ano.adicionarMes(new Mes(30, "Junho"));
        ano.adicionarMes(new Mes(31, "Julho"));
        ano.adicionarMes(new Mes(31, "Agosto"));
        ano.adicionarMes(new Mes(30, "Setembro"));
        ano.adicionarMes(new Mes(31, "Outubro"));
        ano.adicionarMes(new Mes(30, "Novembro"));
        ano.adicionarMes(new Mes(31, "Dezembro"));
    }

    public void adicionarCompromisso(String nomeMes, int diaMes, String pessoa, String local, String assunto, int hora) {
        for (Compromisso mes : ano.listarCompromissos()) {
            if (mes.getNome().equalsIgnoreCase(nomeMes)) {
                mes.adicionarCompromisso(pessoa, local, assunto, hora, diaMes);
                return;
            }
        }
    }

    public void excluirCompromisso(String nomeMes, int diaMes, int hora) {
        ano.excluirCompromisso(nomeMes, diaMes, hora);
    }

    public void listarCompromissos(String nomeMes) {
        List<Compromisso> compromissos = ano.listarCompromissos(nomeMes);
        for (Compromisso comp : compromissos) {
            System.out.println(comp);
        }
    }

    public void listarCompromissos() {
        List<Compromisso> compromissos = ano.listarCompromissos();
        for (Compromisso comp : compromissos) {
            System.out.println(comp);
        }
    }
}