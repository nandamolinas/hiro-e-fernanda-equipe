package br.edu.up.Model;

import java.time.LocalDate;
import java.util.ArrayList;

public abstract class Seguro {
    private String apolice;
    private ArrayList<Segurado> segurados = new ArrayList<>();
    private double vlrApolice;
    private LocalDate dataInicio;
    private LocalDate dataFim;

    public Seguro(String apolice) {
        this.apolice = apolice;
    }

    // Getters e Setters
    public String getApolice() {
        return apolice;
    }

    public void setApolice(String apolice) {
        this.apolice = apolice;
    }

    public ArrayList<Segurado> getSegurados() {
        return segurados;
    }

    public void setSegurados(ArrayList<Segurado> segurados) {
        this.segurados = segurados;
    }

    public double getVlrApolice() {
        return vlrApolice;
    }

    public void setVlrApolice(double vlrApolice) {
        this.vlrApolice = vlrApolice;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDate getDataFim() {
        return dataFim;
    }

    public void setDataFim(LocalDate dataFim) {
        this.dataFim = dataFim;
    }

    // Método abstrato
    public abstract String getDados();
}