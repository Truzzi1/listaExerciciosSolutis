import java.util.Scanner;

public class ex10 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine();

        int vogais = 0, consoantes = 0, espacos = 0;

        frase = frase.toLowerCase();

        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);

            if(c == 'a' || c == 'e' || c== 'i' || c == 'o' || c == 'u'){
                vogais++;
            } else if (c== ' ') {
                espacos++;
            } else if (c >= 'a' && c <= 'z') {
                consoantes++;
            }
        }
        System.out.println("Quantidade de vogais: " + vogais);
        System.out.println("Quantidade de consoantes: " + consoantes);
        System.out.println("Quantidade de espaços: " + espacos);
    }
}
