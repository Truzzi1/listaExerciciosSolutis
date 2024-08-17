import java.util.Random;

public class ex14 {
    public static void main(String[] args) {
        Random random = new Random();

        double soma = 0;
        int contador = 0;

        while (contador < 50) {
            int numero = random.nextInt(101);
            System.out.println("Número gerado: " + numero);

            soma += numero;
            contador++;
        }
        double media = soma / 50;

        System.out.println("A média é: " + media);
    }
}
