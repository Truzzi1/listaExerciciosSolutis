package zoologico;

public class Cavalo extends Animal{

    public Cavalo(String nome, int idade, boolean som){
        super(nome, idade, som);
    }

    @Override
    public void emitirSom() {
        System.out.println(nome + " está relinchando!");
    }

    @Override
    public String movimentarse() {
        return "Correndo";
    }
}
