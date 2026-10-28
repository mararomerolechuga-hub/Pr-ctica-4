import java.util.Scanner;

public class Ejercicio2_SimuladorAhorro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double inicial;
        double meta;
        double ahorroMensual;

        do {
            System.out.print("Dinero inicial: ");
            inicial = sc.nextDouble();

            if (inicial <= 0) {
                System.out.println("Debe ser mayor que cero.");
            }
        } while (inicial <= 0);

        do {
            System.out.print("Meta de ahorro: ");
            meta = sc.nextDouble();

            if (meta <= 0) {
                System.out.println("Debe ser mayor que cero.");
            }
        } while (meta <= 0);

        do {
            System.out.print("Ahorro mensual fijo: ");
            ahorroMensual = sc.nextDouble();

            if (ahorroMensual <= 0) {
                System.out.println("Debe ser mayor que cero.");
            }
        } while (ahorroMensual <= 0);

        char repetir = 's';

        do {
            System.out.println("\nSelecciona el plazo:");
            System.out.println("1. 6 meses");
            System.out.println("2. 12 meses");
            System.out.println("3. 24 meses");
            System.out.print("Opcion: ");

            int opcion = sc.nextInt();
            int meses;

            switch (opcion) {
                case 1:
                    meses = 6;
                    break;
                case 2:
                    meses = 12;
                    break;
                case 3:
                    meses = 24;
                    break;
                default:
                    System.out.println("Opcion no valida.");
                    continue;
            }

            double saldo = inicial;
            double interesesGenerados = 0;
            int mesMeta = -1;

            for (int mes = 1; mes <= meses; mes++) {
                saldo += ahorroMensual;

                double interesMes = saldo * 0.01;
                saldo += interesMes;
                interesesGenerados += interesMes;

                if (mesMeta == -1 && saldo >= meta) {
                    mesMeta = mes;
                }
            }

            System.out.printf(
                    "\nSaldo final: $%.2f%n", saldo);
            System.out.printf(
                    "Intereses generados: $%.2f%n",
                    interesesGenerados);

            if (saldo >= meta) {
                System.out.println("Se alcanzo la meta.");

                if (mesMeta != -1) {
                    System.out.println(
                            "Mes en que se alcanzo la meta: "
                                    + mesMeta);
                }
            } else {
                System.out.println(
                        "No se alcanzo la meta en "
                                + meses + " meses.");
            }

            System.out.print(
                    "Deseas otra simulacion? (s/n): ");
            repetir = sc.next().toLowerCase().charAt(0);

        } while (repetir == 's');

        System.out.println("Simulacion finalizada.");
        sc.close();
    }
}
