package br.edu.up.Model;

import java.util.ArrayList;

public abstract class Cliente {
    private String email;
    private String nome;
    private String telefone;
    private ArrayList<Endereco> enderecos;
    private double vlrMaxCredito;
    private double vlrEmprestado;

    public Cliente(String nome, String telefone, String email, double vlrMaxCredito) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.vlrMaxCredito = vlrMaxCredito;
        this.enderecos = new ArrayList<>();
        this.vlrEmprestado = 0;
    }

    public String getEmail() { 
        return email; 
    }

    public void setEmail(String email) { 
        this.email = email; 
    }

    public String getNome() { 
        return nome; 
    }

    public void setNome(String nome) { 
        this.nome = nome; 
    }

    public String getTelefone() { 
        return telefone; 
    }

    public void setTelefone(String telefone) { 
        this.telefone = telefone; 
    }

    public ArrayList<Endereco> getEnderecos() { 
        return enderecos; 
    }

    public void setEnderecos(ArrayList<Endereco> enderecos) { 
        this.enderecos = enderecos; 
    }

    public double getVlrMaxCredito() { 
        return vlrMaxCredito; 
    }

    public void setVlrMaxCredito(double vlrMaxCredito) { 
        this.vlrMaxCredito = vlrMaxCredito; 
    }

    public double getVlrEmprestado() { 
        return vlrEmprestado; 
    }

    public void setVlrEmprestado(double vlrEmprestado) { 
        this.vlrEmprestado = vlrEmprestado; 
    }



    public abstract double emprestar(double valor);
    public abstract double devolver(double valor);
    public abstract double getSaldo();
}