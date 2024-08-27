package zoologico;

public class Animal {
    protected String nome;
    protected int idade;
    protected boolean som;

    Animal(String nome, int idade, boolean som){
        this.nome = nome;
        this.idade = idade;
        this.som = som;
    }

    public String movimentarse(){
        return "Movimentando";
    }

    public void emitirSom(){
        System.out.println(nome + " emitindo som!");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public boolean isSom() {
        return som;
    }

    public void setSom(boolean som) {
        this.som = som;
    }
}
