public class Gato extends AnimalTerrestreAB{
    public Gato(String nome, int idade, String habitat, double altura, double peso) {
        super(nome, "Gato", idade, habitat, altura, peso, 4);
    }
    @Override
    public void comer(double quantidade) {
        peso += quantidade * 0.5;
    }
}
