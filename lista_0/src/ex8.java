import java.util.Random;
public class ex8 {

    public static void main(String[] args){
        Random random = new Random();

        int num = random.nextInt(10);

        if(num % 2 == 0) {
            System.out.println("O numero " + num + " é PAR!");
        } else{
            System.out.println("O numero " + num + " é ÍMPAR!");
        }
    }
}
