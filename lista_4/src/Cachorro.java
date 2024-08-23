public class Cachorro extends AnimalTerrestreAB{

    public Cachorro(String nome, int idade, String habitat, double altura, double peso) {
        super(nome, "Cachorro", idade, habitat, altura, peso, 4);
    }
    @Override
    public void comer(double quantidade) {
        peso += quantidade * 1;
    }
}
