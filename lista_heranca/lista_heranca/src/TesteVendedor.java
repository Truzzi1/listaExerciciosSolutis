public class TesteVendedor {
    public static void main(String[] args){
        Vendedor vendedor = new Vendedor("Diego", "Brasília", "666-666", 676, 2000, 800);
        System.out.println(vendedor.calcularSalario());
    }
}