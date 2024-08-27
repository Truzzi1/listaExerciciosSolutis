package zoologico;

public class Preguica extends Animal {

  public Preguica(String nome, int idade, boolean som) {
    super(nome, idade, som);
  }

  @Override
  public void emitirSom() {
    System.out.println(nome + " está gritando!");
  }

  @Override
  public String movimentarse() {
    return "Subindo";
  }
}
