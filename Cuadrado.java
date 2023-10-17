import java.util.Scanner;

public class Cuadrado {
    public static void main(String[] args) {
        // Crear un objeto Scanner para la entrada de usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese los lados del cuadrado
        System.out.print("Ingresa la longitud del lado: ");
        double lado = scanner.nextDouble();

        // Calcular el área y el perímetro del cuadrado
        double area = lado * lado;
        double perimetro = 4 * lado;

        // Mostrar los resultados
        System.out.println("Cuadrado:");
        System.out.println("Área: " + area);
        System.out.println("Perímetro: " + perimetro);
        System.out.println("hola");

        // Cerrar el objeto Scanner
        scanner.close();
    }
}