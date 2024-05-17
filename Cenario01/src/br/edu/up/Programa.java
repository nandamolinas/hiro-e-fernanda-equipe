package br.edu.up;

public class Programa {
    
    public static void main(String[] args) {
        Ponto ponto1 = new Ponto();
        Ponto ponto2 = new Ponto(2, 5);

        System.out.println("Ponto1: (" + ponto1.getX() + ", " + ponto1.getY() + ")");
        System.out.println("Ponto2: (" + ponto2.getX() + ", " + ponto2.getY() + ")");

        double distanciaPonto1Ponto2 = ponto1.calcularDistancia(ponto2);
        System.out.println("Distancia entre ponto1 e ponto2: " + distanciaPonto1Ponto2);

        double distanciaPonto2Coordenadas = ponto2.calcularDistancia(7, 2);
        System.out.println("Distancia entre ponto2 e (7, 2): " + distanciaPonto2Coordenadas);

        ponto1.setX(10);
        ponto1.setY(3);
        System.out.println("Novas coordenadas do ponto1: (" + ponto1.getX() + ", " + ponto1.getY() + ")");
    }
     
}