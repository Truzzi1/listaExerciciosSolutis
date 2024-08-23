public class Pombo extends AnimalVoadorAB{

    public Pombo(String nome, int idade, String habitat, double altura, double peso, double envergaduraAsa) {
        super(nome, "Pombo", idade, habitat, altura, peso, 2, envergaduraAsa);
    }
    @Override
    public void comer(double quantidade) {
        peso += quantidade * 0.3;
    }
}
