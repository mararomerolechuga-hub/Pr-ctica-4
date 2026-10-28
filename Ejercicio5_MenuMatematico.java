import java.util.Scanner;

public class Ejercicio5_MenuMatematico {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n=== MENU MATEMATICO ===");
            System.out.println("1. Calcular el cuadrado");
            System.out.println("2. Calcular el cubo");
            System.out.println("3. Determinar si es par o impar");
            System.out.println("4. Sumar los numeros de 1 hasta N");
            System.out.println("5. Salir");
            System.out.print("Selecciona una opcion: ");

            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    double cuadrado;

                    do {
                        System.out.print(
                                "Ingresa un numero positivo: ");
                        cuadrado = sc.nextDouble();

                        if (cuadrado <= 0) {
                            System.out.println(
                                    "El numero debe ser positivo.");
                        }
                    } while (cuadrado <= 0);

                    System.out.println(
                            "Cuadrado: " + (cuadrado * cuadrado));
                    break;

                case 2:
                    double cubo;

                    do {
                        System.out.print(
                                "Ingresa un numero positivo: ");
                        cubo = sc.nextDouble();

                        if (cubo <= 0) {
                            System.out.println(
                                    "El numero debe ser positivo.");
                        }
                    } while (cubo <= 0);

                    System.out.println(
                            "Cubo: " + (cubo * cubo * cubo));
                    break;

                case 3:
                    int numero;

                    do {
                        System.out.print(
                                "Ingresa un entero positivo: ");
                        numero = sc.nextInt();

                        if (numero <= 0) {
                            System.out.println(
                                    "El numero debe ser positivo.");
                        }
                    } while (numero <= 0);

                    if (numero % 2 == 0) {
                        System.out.println("El numero es par.");
                    } else {
                        System.out.println("El numero es impar.");
                    }
                    break;

                case 4:
                    int n;

                    do {
                        System.out.print(
                                "Ingresa un entero positivo N: ");
                        n = sc.nextInt();

                        if (n <= 0) {
                            System.out.println(
                                    "N debe ser positivo.");
                        }
                    } while (n <= 0);

                    int suma = 0;

                    for (int i = 1; i <= n; i++) {
                        suma += i;
                    }

                    System.out.println(
                            "Suma de 1 hasta " + n + ": " + suma);
                    break;

                case 5:
                    System.out.println(
                            "Gracias por utilizar el programa. Hasta luego.");
                    break;

                default:
                    System.out.println(
                            "Error: esa opcion no existe.");
            }

        } while (opcion != 5);

        sc.close();
    }
}
