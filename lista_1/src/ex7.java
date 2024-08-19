public class ex7 {
    public static void main(String[] args){
        for (int i = 0; i <= 100; i++) {
            if(i % 3 == 0){
                int resInt = i/2;
                double resDouble = (double) i/2;

                System.out.println("Número: " + i);
                System.out.println("Divisão (int): " + resInt + " | (double): " + resDouble + "!");
                System.out.println();
            }
        }
    }
}
