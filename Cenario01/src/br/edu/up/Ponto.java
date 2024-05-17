package br.edu.up;

public class Ponto {
    private double x;
    private double y;

    public Ponto() {
        this.x = 0;
        this.y = 0;
    }

    public Ponto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getX() {
        return x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getY() {
        return y;
    }

    public double calcularDistancia(double x2, double y2) {
        return Math.sqrt(Math.pow((x - x2), 2) + Math.pow((y - y2), 2));
    }

    public double calcularDistancia(Ponto p) {
        return calcularDistancia(p.getX(), p.getY());
    }
}


