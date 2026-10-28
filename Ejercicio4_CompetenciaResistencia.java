import java.util.Scanner;

public class Ejercicio4_CompetenciaResistencia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int RONDAS = 5;
        char repetir;

        do {
            int participantes;

            do {
                System.out.print(
                        "Cantidad de participantes: ");
                participantes = sc.nextInt();

                if (participantes <= 0) {
                    System.out.println(
                            "Debe ingresar al menos uno.");
                }
            } while (participantes <= 0);

            double[] totales = new double[participantes];

            for (int p = 0; p < participantes; p++) {
                System.out.println(
                        "\nParticipante " + (p + 1));

                for (int r = 0; r < RONDAS; r++) {
                    double distancia;

                    do {
                        System.out.print(
                                "Distancia de la ronda "
                                        + (r + 1) + " (km): ");
                        distancia = sc.nextDouble();

                        if (distancia < 0) {
                            System.out.println(
                                    "La distancia no puede ser negativa.");
                        }
                    } while (distancia < 0);

                    totales[p] += distancia;

                    if (distancia < 2) {
                        System.out.println(
                                "Rendimiento: bajo");
                    } else if (distancia <= 4) {
                        System.out.println(
                                "Rendimiento: medio");
                    } else {
                        System.out.println(
                                "Rendimiento: alto");
                    }
                }
            }

            double distanciaGeneral = 0;
            int mejorParticipante = 0;

            for (int p = 0; p < participantes; p++) {
                distanciaGeneral += totales[p];

                if (totales[p] > totales[mejorParticipante]) {
                    mejorParticipante = p;
                }
            }

            double promedio =
                    distanciaGeneral / participantes;

            System.out.println("\nEstadistica que deseas consultar:");
            System.out.println("1. Distancia total general");
            System.out.println("2. Promedio por participante");
            System.out.println("3. Participante con mayor distancia");
            System.out.print("Opcion: ");

            int opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.printf(
                            "Distancia total: %.2f km%n",
                            distanciaGeneral);
                    break;

                case 2:
                    System.out.printf(
                            "Promedio por participante: %.2f km%n",
                            promedio);
                    break;

                case 3:
                    System.out.println(
                            "Participante con mayor distancia: "
                                    + (mejorParticipante + 1));
                    System.out.printf(
                            "Distancia acumulada: %.2f km%n",
                            totales[mejorParticipante]);
                    break;

                default:
                    System.out.println("Opcion no valida.");
            }

            System.out.println("\nResumen de distancias:");

            for (int p = 0; p < participantes; p++) {
                System.out.printf(
                        "Participante %d: %.2f km%n",
                        p + 1, totales[p]);
            }

            System.out.print(
                    "\nDeseas registrar otra competencia? (s/n): ");
            repetir = sc.next().toLowerCase().charAt(0);

        } while (repetir == 's');

        System.out.println("Programa finalizado.");
        sc.close();
    }
}
