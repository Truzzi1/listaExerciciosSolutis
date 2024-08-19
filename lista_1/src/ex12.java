import java.util.Scanner;

public class ex12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int kmTotal = 0;
        int lTotal = 0;

        boolean continuar = true;

        while (continuar) {
            System.out.print("Digite os quilômetros dirigidos: ");
            int km = scanner.nextInt();

            System.out.print("Digite os litros de gasolina consumidos: ");
            int l = scanner.nextInt();

            System.out.println(" ");

            kmTotal += km;
            lTotal += l;

            System.out.printf("Quilometragem combinada: %d km%n", kmTotal);
            System.out.printf("Total de litros consumidos: %d litros%n", lTotal);

            double KmLitro = (double) km / l;
            System.out.printf("Consumo para este tanque: %.2f km/l%n", KmLitro);
            break;
        }

        scanner.close();
    }
}
