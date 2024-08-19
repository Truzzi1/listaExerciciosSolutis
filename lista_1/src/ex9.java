import java.util.Scanner;

public class ex9 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digito o valor do raio: ");
        double raio = scanner.nextDouble();

        double area = Math.PI * Math.pow(raio, 2);

        long arredondada = Math.round(area);

        System.out.println("A área do círculo é: " + arredondada);

        scanner.close();
    }
}
