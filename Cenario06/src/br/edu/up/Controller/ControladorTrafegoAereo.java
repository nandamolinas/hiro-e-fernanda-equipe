package br.edu.up.Controller;

import java.util.ArrayList;

import br.edu.up.Model.*;

public class ControladorTrafegoAereo {
    private ArrayList<Pessoa> pessoas;
    private ArrayList<Passageiro> passageiros;
    private ArrayList<Comandante> comandantes;
    private ArrayList<Comissario> comissarios;
    private ArrayList<Aeronave> aeronaves;

    public ControladorTrafegoAereo() {
        pessoas = new ArrayList<>();
        passageiros = new ArrayList<>();
        aeronaves = new ArrayList<>();
        comissarios = new ArrayList<>();
        comandantes = new ArrayList<>();
    }

    public void registrarAeronave(Aeronave aeronave) {
        aeronaves.add(aeronave);
    }    
    public Aeronave buscarAeronavePorCodigo(String codigo) {
        for (Aeronave aeronave : aeronaves) {
            if (aeronave.getCodigo().equals(codigo)) {
                return aeronave;
            }
        }
        return null;
    }
    


    public void registrarPassageiro(Passageiro passageiro) {
        passageiros.add(passageiro);
    }
    public Passageiro buscarPassageiroPorRG(String rg) {
        for (Passageiro passageiro : passageiros) {
            if (passageiro.getRg().equals(rg)) {
                return passageiro;
            }
        }
        return null;
    }
    


    public void registrarComandante(Comandante comandante) {
        comandantes.add(comandante);
    }
    public Comandante buscarComandantePorRG(String rg) {
        for (Comandante comandante : comandantes) {
            if (comandante.getRg().equals(rg)) {
                return comandante;
            }
        }
        return null; 
    }



    public void registrarComissario(Comissario comissario) {
        comissarios.add(comissario);
    }
    public Comissario buscarComissarioPorRG(String rg) {
        for (Comissario comissario : comissarios) {
            if (comissario.getRg().equals(rg)) {
                return comissario;
            }
        }
        return null; // Retorna null se não encontrar o comissário com o RG fornecido
    }
}
