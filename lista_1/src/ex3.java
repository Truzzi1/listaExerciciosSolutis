import java.util.Scanner;

public class ex3 {
        public static boolean numP(int numero) {
            if (numero <= 1) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    return false;
                }
            }
            return true;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Digite um número inteiro: ");
            int numero = scanner.nextInt();

            System.out.println("Números primos menores que " + numero + ":");
            for (int i = 2; i < numero; i++) {
                if (numP(i)) {
                    System.out.print(i + " ");
                }
            }
            scanner.close();
        }
    }
