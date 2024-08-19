import java.util.Scanner;

public class ex5 {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número de 1 a 7: ");
        int vR = scanner.nextInt();

        if(vR-1 <= 6){
            String[] diaS = {"Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábado", "Domingo"};

            System.out.println("O dia da semana é: " + diaS[vR - 1]);
        } else{
            System.out.println("O valor digitado não atendo os requisitos!");
        }
    }
}
