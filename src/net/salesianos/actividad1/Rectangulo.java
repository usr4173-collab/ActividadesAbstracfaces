package net.salesianos.actividad1;

public class Rectangulo implements CalculoGeometrico {
    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }

    @Override
    public double calcularPerimetro() {
        return (base * 2) + (altura * 2);
    }
}
