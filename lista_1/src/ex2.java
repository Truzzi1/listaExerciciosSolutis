import java.util.Scanner;

public class ex2 {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um valor: ");

        int val1 = scanner.nextInt();

        System.out.print("Digite outro valor: ");

        int val2 = scanner.nextInt();

        if(val1 < val2){
            System.out.println("O maior valor é: " + val2);

        } else if(val1 > val2){
            System.out.println("O maior valor é: " + val1);

        } else{
            System.out.println("Os valores são iguais!");
        }
        scanner.close();
    }
}
