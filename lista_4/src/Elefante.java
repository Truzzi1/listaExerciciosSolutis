public class Elefante extends AnimalTerrestreAB{

    public Elefante(String nome, int idade, String habitat, double altura, double peso) {
        super(nome, "Elefante", idade, habitat, altura, peso, 4);
    }
    @Override
    public void comer(double quantidade) {
        peso += quantidade * 5;
    }
}
