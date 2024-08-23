public class Leao extends AnimalTerrestreAB{

    public Leao(String nome, int idade, String habitat, double altura, double peso) {
        super(nome, "Leão", idade, habitat, altura, peso, 4);
    }
    @Override
    public void comer(double quantidade) {
        peso += quantidade * 4;
    }
}
