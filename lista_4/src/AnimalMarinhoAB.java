public abstract class AnimalMarinhoAB extends AnimalAB {
    protected double tamanhoNadadeira;

    public AnimalMarinhoAB(String nome, String tipo, int idade, String habitat, double altura, double peso, double tamanhoNadadeira) {
        super(nome, tipo, idade, habitat, altura, peso);
    }

    @Override
    public void moverse(double distancia) {
        System.out.println(nome + " nadou: " + distancia + "KM");
    }
}
