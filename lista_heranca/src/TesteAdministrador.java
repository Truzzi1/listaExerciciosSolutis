public class TesteAdministrador {
    public static void main(String[] args){
        Administrador adm = new Administrador("Jonas", "Guarujá", " 777-777", 676, 2500);
        adm.setAjudaDeCusto(500);
        System.out.println(adm.calcularSalario());
    }
}
