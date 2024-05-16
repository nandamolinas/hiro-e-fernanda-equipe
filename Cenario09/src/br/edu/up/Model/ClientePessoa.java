package br.edu.up.Model;

public class ClientePessoa extends Cliente {
    private String cpf;
    private double peso;
    private double altura;

    public ClientePessoa(String nome, String telefone, String email, String cpf, double peso, double altura) {
        super(nome, telefone, email, 10000); //máximo crédito
        this.cpf = cpf;
        this.peso = peso;
        this.altura = altura;
    }

    public String getCpf() { 
        return cpf; 
    }

    public void setCpf(String cpf) { 
        this.cpf = cpf; 
    }

    public double getPeso() { 
        return peso; 
    }

    public void setPeso(double peso) { 
        this.peso = peso; 
    }

    public double getAltura() { 
        return altura; 
    }

    public void setAltura(double altura) { 
        this.altura = altura; 
    }

    @Override
    public double emprestar(double valor) {
        if (valor <= 0 || valor + getVlrEmprestado() > getVlrMaxCredito()) {
            return 0; //não realizado
        }
        setVlrEmprestado(getVlrEmprestado() + valor);
        return valor; //Valor emprestado
    }

    @Override
    public double devolver(double valor) {
        if (valor <= 0 || getVlrEmprestado() - valor < 0) {
            return 0; //não realizada
        }
        setVlrEmprestado(getVlrEmprestado() - valor);
        return valor; //Valor devolvido
    }

    @Override
    public double getSaldo() {
        return getVlrMaxCredito() - getVlrEmprestado();
    }

    @Override
    public String toString() {
        return "ClientePessoa{" +
                "cpf='" + cpf + '\'' +
                ", peso=" + peso +
                ", altura=" + altura +
                ", saldo=" + getSaldo() +  
                "} " + super.toString();
    }
}