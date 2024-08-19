public class ex6 {
    public static void main(String[] args){
        int proInt = 1;

        float proFloat = 1.0f;

        for (int i = 15; i <= 30; i++){
            if(i % 2 != 0){
                proInt *= i;
                proFloat *= i;
            }
        }
        System.out.println("Produto dos números ímpares de 15 a 30 (int): " + proInt);
        System.out.println("Produto dos números ímpares de 15 a 30 (float): " + proFloat);
    }
}
