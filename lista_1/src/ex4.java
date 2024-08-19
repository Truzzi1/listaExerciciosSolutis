import java.util.Scanner;

public class ex4 {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a distância em milhas: ");
        int milhas = scanner.nextInt();

        System.out.println("A distância em quilômetros é: " + milhas*1609 + "km!");
        scanner.close();
    }
}
