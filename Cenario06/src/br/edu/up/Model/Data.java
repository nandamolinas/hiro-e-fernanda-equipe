package br.edu.up.Model;

public class Data {
    private int dia;
    private int mes;
    private int ano;
    private int hora;
    private int minuto;

    public Data(int dia, int mes, int ano, int hora, int minuto) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.hora = hora;
        this.minuto = minuto;
    }

    
    public int getDia() { 
        return dia; 
    }
    public void setDia(int dia) { 
        this.dia = dia; 
    }


    public int getMes() { 
        return mes; 
    }
    public void setMes(int mes) { 
        this.mes = mes; 
    }


    public int getAno() { 
        return ano; 
    }
    public void setAno(int ano) { 
        this.ano = ano; 
    }


    public int getHora() { 
        return hora; 
    }
    public void setHora(int hora) { 
        this.hora = hora; 
    }


    public int getMinuto() { 
        return minuto; 
    }
    public void setMinuto(int minuto) { 
        this.minuto = minuto; 
    }


    public static Data criarData(String dataString) {
        String[] partesData = dataString.split(" ");
        String[] data = partesData[0].split("/");
        String[] hora = partesData[1].split(":");

        if (data.length == 3 && hora.length == 2) {
            int dia = Integer.parseInt(data[0]);
            int mes = Integer.parseInt(data[1]);
            int ano = Integer.parseInt(data[2]);
            int horaVoo = Integer.parseInt(hora[0]);
            int minutoVoo = Integer.parseInt(hora[1]);

            return new Data(dia, mes, ano, horaVoo, minutoVoo);
        } else {
            throw new IllegalArgumentException("Formato de data e hora invalido.");
        }
    }
}   

/* String dataString = "2024-05-17 10:04";
DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
LocalDateTime dateTime = LocalDateTime.parse(dataString, formatter); */