public abstract class AnimalTerrestreAB extends AnimalAB {
    protected int quantidaPatas;

    public AnimalTerrestreAB(String nome, String tipo, int idade, String habitat, double altura, double peso, int quantidaPatas) {
        super(nome, tipo, idade, habitat, altura, peso);
        this.quantidaPatas = quantidaPatas;
    }

    public int getQuantidaPatas() {
        return quantidaPatas;
    }

    public void setQuantidaPatas(int quantidaPatas) {
        this.quantidaPatas = quantidaPatas;
    }

    @Override
    public void moverse(double distancia) {
        System.out.println(nome + " andou: " + distancia + "KM");
    }
}
