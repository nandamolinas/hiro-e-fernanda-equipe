package br.edu.up.Model;

public class Passagem {
    private String numeroAcento;
    private String classeAcento;
    private Data dataVoo;

    public Passagem(String numeroAcento, String classeAcento, Data dataVoo) {
        this.numeroAcento = numeroAcento;
        this.classeAcento = classeAcento;
        this.dataVoo = dataVoo;
    }

    
    public String getNumeroAcento() { 
        return numeroAcento; 
    }
    public void setNumeroAcento(String numeroAcento) { 
        this.numeroAcento = numeroAcento; 
    }


    public String getClasseAcento() { 
        return classeAcento; 
    }
    public void setClasseAcento(String classeAcento) { 
        this.classeAcento = classeAcento; 
    }


    public Data getDataVoo() { 
        return dataVoo; 
    }
    public void setDataVoo(Data dataVoo) { 
        this.dataVoo = dataVoo; 
    }


    public static Passagem criarPassagem(String dadosPassagem) {
        String[] partes = dadosPassagem.split(";");
        if (partes.length == 3) {
            String numeroAcento = partes[0];
            String classeAcento = partes[1];
            Data dataVoo = Data.criarData(partes[2]); 
            return new Passagem(numeroAcento, classeAcento, dataVoo);
        } else {
            throw new IllegalArgumentException("Formato de dados da passagem invalido.");
        }
    }
}