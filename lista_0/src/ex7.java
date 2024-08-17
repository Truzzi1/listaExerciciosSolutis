public class ex7 {


    public static void main(String[] args) {
        String A = "Curso Java";
        String B = "Gosto de Java";

        String temp = A;
        A =  B;
        B = temp;

        System.out.println("String A: " + A);
        System.out.println("String B: " + B);
    }
}
