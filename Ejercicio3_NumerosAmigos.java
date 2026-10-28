import java.util.Scanner;

public class Ejercicio3_NumerosAmigos {

    public static int sumaDivisoresPropios(int numero) {
        int suma = 0;

        for (int i = 1; i < numero; i++) {
            if (numero % i == 0) {
                suma += i;
            }
        }

        return suma;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char repetir;

        do {
            int a;
            int b;

            do {
                System.out.print("Ingresa el primer entero positivo: ");
                a = sc.nextInt();

                if (a <= 0) {
                    System.out.println("Debe ser positivo.");
                }
            } while (a <= 0);

            do {
                System.out.print("Ingresa el segundo entero positivo: ");
                b = sc.nextInt();

                if (b <= 0) {
                    System.out.println("Debe ser positivo.");
                }
            } while (b <= 0);

            int sumaA = sumaDivisoresPropios(a);
            int sumaB = sumaDivisoresPropios(b);

            boolean sonAmigos =
                    (a != b && sumaA == b && sumaB == a);

            System.out.println("\nQue deseas mostrar?");
            System.out.println("1. Sumas de divisores");
            System.out.println("2. Solo el resultado");
            System.out.print("Opcion: ");

            int opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println(
                            "Suma de divisores de " + a
                                    + ": " + sumaA);
                    System.out.println(
                            "Suma de divisores de " + b
                                    + ": " + sumaB);

                    if (sonAmigos) {
                        System.out.println(
                                "Son numeros amigos.");
                    } else {
                        System.out.println(
                                "No son numeros amigos.");
                    }
                    break;

                case 2:
                    if (sonAmigos) {
                        System.out.println(
                                "Son numeros amigos.");
                    } else {
                        System.out.println(
                                "No son numeros amigos.");
                    }
                    break;

                default:
                    System.out.println("Opcion no valida.");
            }

            System.out.print(
                    "\nDeseas analizar otra pareja? (s/n): ");
            repetir = sc.next().toLowerCase().charAt(0);

        } while (repetir == 's');

        System.out.println("Programa finalizado.");
        sc.close();
    }
}
