import java.util.Scanner;

public class ex8 {
        public static boolean palindromo(String palavra){
            int comprimento = palavra.length();

            for (int i = 0; i < comprimento; i++) {
                if (palavra.charAt(i) != palavra.charAt(comprimento - 1 - i)){
                    return false;
                }
            }
            return true;
        }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String palavra = scanner.nextLine();

        palavra = palavra.replaceAll("\\s+", "").toLowerCase();

        if(palindromo(palavra)){
            System.out.println("A palavra \"" + palavra + "\" é um palíndromo.");
        }else{
            System.out.println("A palavra \"" + palavra + "\" não é um palíndromo.");
        }
    }
}
