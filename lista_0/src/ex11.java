import java.util.Random;

public class ex11 {
    public static void main(String[] args){
        String A = "001 ? Parafuso";
        String B = "002 ?Porca";
        String C = "003 ?Prego";
        String D = "XXX ? Diversos";
        Random random = new Random();
        int num = random.nextInt(5);

        if(num == 1){
            System.out.println(A);
        } else if (num == 2) {
            System.out.println(B);
        } else if (num == 3){
            System.out.println(C);
        } else{
            System.out.println(D);
        }
    }
}
