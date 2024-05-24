package br.edu.up.Model;

public class Evento {
    private String nome;
    private String data;
    private String local;
    private int lotacaoMaxima;
    private int ingressosVendidos;
    private double precoIngresso;

    
    public Evento(String nome, String data, String local, int lotacaoMaxima, double precoIngresso) {
        this.nome = nome;
        this.data = data;
        this.local = local;
        this.lotacaoMaxima = lotacaoMaxima;
        this.ingressosVendidos = 0; 
        this.precoIngresso = precoIngresso;
    }

    
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getData() { return data; }
    public void setData(String data) { this.data = data; }

    public String getLocal() { return local; }
    public void setLocal(String local) { this.local = local; }

    public int getLotacaoMaxima() { return lotacaoMaxima; }
    public void setLotacaoMaxima(int lotacaoMaxima) {
        if (lotacaoMaxima >= 0) {
            this.lotacaoMaxima = lotacaoMaxima;
        } else {
            System.out.println("Lotação máxima não pode ser negativa.");
        }
    }

    public int getIngressosVendidos() { return ingressosVendidos; }
    public void setIngressosVendidos(int ingressosVendidos) { this.ingressosVendidos = ingressosVendidos; }

    public double getPrecoIngresso() { return precoIngresso; }
    public void setPrecoIngresso(double precoIngresso) { this.precoIngresso = precoIngresso; }

    //venda de ingressos
    public boolean venderIngressos(int quantidade) {
        if(quantidade <= 0 || quantidade + ingressosVendidos > lotacaoMaxima) {
            return false;
        }
        ingressosVendidos += quantidade;
        return true; 
    }
}
