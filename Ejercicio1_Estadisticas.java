import java.util.Scanner;

public class Ejercicio1_Estadisticas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int DIVISOR = 4;
        final int MULTIPLO = 3;
        char repetir;

        do { // Ciclo do-while exterior para repetir todo el análisis
            int n;

            // Validación con while para asegurar que N sea positivo
            do {
                System.out.print("Ingresa un entero positivo N: ");
                n = sc.nextInt();

                if (n <= 0) {
                    System.out.println("Error: N debe ser positivo.");
                }
            } while (n <= 0);

            int sumaDivisibles4 = 0;
            int cantidadMultiplos3 = 0;
            int cantidadDivisiblesAmbos = 0;

            int cantidadPares = 0;
            int sumaPares = 0;

            int cantidadImpares = 0;
            int sumaImpares = 0;

            int cantidadMultiplos5 = 0;
            int sumaMultiplos5 = 0;

            // Recorrido de los números desde 1 hasta N usando for
            for (int i = 1; i <= n; i++) {
                if (i % DIVISOR == 0) {
                    sumaDivisibles4 += i;
                }

                if (i % MULTIPLO == 0) {
                    cantidadMultiplos3++;
                }

                if (i % 4 == 0 && i % 3 == 0) {
                    cantidadDivisiblesAmbos++;
                }

                if (i % 2 == 0) {
                    cantidadPares++;
                    sumaPares += i;
                } else {
                    cantidadImpares++;
                    sumaImpares += i;
                }

                if (i % 5 == 0) {
                    cantidadMultiplos5++;
                    sumaMultiplos5 += i;
                }
            }

            // Resultados generales requeridos
            System.out.println("\n--- ESTADISTICAS ---");
            System.out.println("Suma de divisibles entre 4: " + sumaDivisibles4);
            System.out.println("Cantidad de multiplos de 3: " + cantidadMultiplos3);
            System.out.println("Cantidad divisibles entre 4 y 3: " + cantidadDivisiblesAmbos);

            // Menú interactivo con switch
            System.out.println("\nElige las estadisticas que deseas visualizar:");
            System.out.println("1. Numeros pares");
            System.out.println("2. Numeros impares");
            System.out.println("3. Multiplos de 5");
            System.out.print("Opcion: ");

            int opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Cantidad de pares: " + cantidadPares);
                    System.out.println("Suma de pares: " + sumaPares);
                    break;

                case 2:
                    System.out.println("Cantidad de impares: " + cantidadImpares);
                    System.out.println("Suma de impares: " + sumaImpares);
                    break;

                case 3:
                    System.out.println("Cantidad de multiplos de 5: " + cantidadMultiplos5);
                    System.out.println("Suma de multiplos de 5: " + sumaMultiplos5);
                    break;

                default:
                    System.out.println("Opcion no valida.");
            }

            // Preguntar si se desea repetir el análisis
            System.out.print("\n¿Deseas realizar otro análisis? (s/n): ");
            repetir = sc.next().charAt(0);
            System.out.println();

        } while (repetir == 's' || repetir == 'S');

        System.out.println("¡Programa finalizado con éxito!");
        sc.close();
    }
}