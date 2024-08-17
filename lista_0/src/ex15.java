import java.util.Random;

public class ex15 {
    public static void main(String[] args) {
        Random random = new Random();

        double soma = 0;
        int contador = 0;

        do {
            int numero = random.nextInt(101);
            System.out.println("Número gerado: " + numero);

            soma += numero;
            contador++;
        } while (contador < 50);

        double media = soma / 50;

        System.out.println("A média é: " + media);
    }
}
