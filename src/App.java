import java.util.Scanner;
import net.salesianos.actividad1.Rectangulo;
import net.salesianos.actividad1.Circulo;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner usuario = new Scanner(System.in);

        // Clase rectángulo:

        System.out.println("Dime la base de un rectángulo: ");
        double baseRec = usuario.nextDouble();

        System.out.println("Dime la base de un rectángulo: ");
        double baseAlt= usuario.nextDouble();

        Rectangulo rec = new Rectangulo(baseRec, baseAlt);

        System.out.println("Base: " + baseRec +
            "\nAltura: " + baseAlt + "\nÁrea: " + rec.calcularArea()); 
        System.out.println("Perímetro: " + rec.calcularPerimetro());

        //Clase círculo:

        System.out.println("\nDime el área de un círculo:");
        double radio = usuario.nextDouble();

        Circulo circ = new Circulo(radio);

        System.out.println("Radio: " + radio +
            "\nÁrea: " + circ.calcularArea() + "\nÁrea: " + circ.calcularArea()); 
        System.out.println("Perímetro: " + circ.calcularPerimetro());

        usuario.close();
    }
}
