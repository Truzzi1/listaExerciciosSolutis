public class TesteEmpregado {
    public static void main(String[] args){
        Empregado empregado = new Empregado("Erick", "Santos", "888-888", 676, 2500);
        empregado.setSalarioBase(2000);
        System.out.println(empregado.calcularSalario());
    }
}
