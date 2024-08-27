package zoologico;

public class Cachorro extends Animal{

    public Cachorro(String nome, int idade, boolean som){
        super(nome, idade, som);
    }

    @Override
    public void emitirSom() {
        System.out.println(nome + " está latindo!");
    }

    @Override
    public String movimentarse() {
        return "Correndo";
    }
}
