import java.util.Scanner;

public class Rectangulo {
    public static void main(String[] args) {
        // Crear un objeto Scanner para la entrada de usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese los lados del rectángulo
        System.out.print("Ingresa la longitud del lado 1: ");
        double lado1 = scanner.nextDouble();

        System.out.print("Ingresa la longitud del lado 2: ");
        double lado2 = scanner.nextDouble();

        // Calcular el área y el perímetro del rectángulo
        double area = lado1 * lado2;
        double perimetro = 2 * (lado1 + lado2);

        // Mostrar los resultados
        System.out.println("Rectángulo:");
        System.out.println("Área: " + area);
        System.out.println("Perímetro: " + perimetro);

        // Cerrar el objeto Scanner
        scanner.close();
    }
}
