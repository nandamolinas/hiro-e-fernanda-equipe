package br.edu.up.Model;

public class ClienteEmpresa extends Cliente {
    private String cnpj;
    private String inscEstadual;
    private int anoFundacao;

    public ClienteEmpresa(String nome, String telefone, String email, String cnpj, String inscEstadual, int anoFundacao) {
        super(nome, telefone, email, 25000); // máximo crédito 
        this.cnpj = cnpj;
        this.inscEstadual = inscEstadual;
        this.anoFundacao = anoFundacao;
    }

    public String getCnpj() { 
        return cnpj; 
    }

    public void setCnpj(String cnpj) { 
        this.cnpj = cnpj; 
    }

    public String getInscEstadual() { 
        return inscEstadual; 
    }

    public void setInscEstadual(String inscEstadual) { 
        this.inscEstadual = inscEstadual; 
    }

    public int getAnoFundacao() { 
        return anoFundacao; 
    }

    public void setAnoFundacao(int anoFundacao) { 
        this.anoFundacao = anoFundacao; 
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
        return "ClienteEmpresa{" +
                "cnpj='" + cnpj + '\'' +
                ", inscEstadual='" + inscEstadual + '\'' +
                ", anoFundacao=" + anoFundacao +
                ", saldo=" + getSaldo() +  
                "} " + super.toString();
    }
}