package net.salesianos.actividad2;

public class CocheCombustion extends Vehiculo {

    private boolean motorEncendido;
    private int litrosCombustible;

    public static final String ROJO = "\u001B[31m";
    public static final String RESET = "\u001B[0m";

    public CocheCombustion(String color, int numeroPuertas, int numeroRuedas,
            String modelo, String matricula, int litrosCombustible) {

        super(color, numeroPuertas, numeroRuedas, modelo, matricula);

        this.litrosCombustible = litrosCombustible;
        this.motorEncendido = false;
    }

    public int getLitrosCombustible() {
        return litrosCombustible;
    }

    public void setLitrosCombustible(int litrosCombustible) {
        this.litrosCombustible = litrosCombustible;
    }

    @Override
    public void arrancar() {

        if (litrosCombustible > 0) {

            litrosCombustible--;
            motorEncendido = true;

            System.out.println("Motor arrancado.");

        } else {

            System.out.println("No hay gasoflina.");
        }
    }

    @Override
    public void pararMotor() {

        motorEncendido = false;

        System.out.println("Motor apagado.");
    }

    @Override
    public void mover() {

        if (!motorEncendido) {

            System.out.println("El coche no se mueve.");
            return;
        }

        if (litrosCombustible <= 0) {

            System.out.println("Sin gasofa.");
            pararMotor();
            return;
        }

        litrosCombustible--;

        System.out.println("Has movido el coche.");
    }

    public void mostrarDatos() {

        System.out.println(
                ROJO +
                "Color: " + color +
                        "\nPuertas: " + numeroPuertas +
                        "\nRuedas: " + numeroRuedas +
                        "\nModelo: " + modelo +
                        "\nMatrícula: " + matricula +
                        "\nMotor encendido: " + motorEncendido +
                        "\nCombustible: " + litrosCombustible + " litros"
                    + RESET);
    }

}