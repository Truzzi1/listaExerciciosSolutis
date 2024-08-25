public class TesteOperario {
    public static void main(String[] args){
        Operario operario = new Operario("Denilson", "Mirassol", "666-666", 676, 2000, 600);
        System.out.println(operario.calcularSalario());
    }
}
