public abstract class AnimalVoadorAB extends AnimalAB {
    int quantidadeAsas;
    double envergaduraAsa;

    public AnimalVoadorAB(String nome, String tipo, int idade, String habitat, double altura, double peso, int quantidadeAsas, double envergaduraAsa) {
        super(nome, tipo, idade, habitat, altura, peso);
    }

    @Override
    public void moverse(double distancia) {
        System.out.println(nome + " voou: " + distancia + "KM");
    }
}
