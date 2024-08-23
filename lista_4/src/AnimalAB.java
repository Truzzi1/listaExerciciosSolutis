public class AnimalAB implements AnimalIF{
    protected String nome;
    protected String tipo;
    protected int idade;
    protected String habitat;
    protected double altura;
    protected double peso;

    public AnimalAB(String nome, String tipo, int idade, String habitat, double altura, double peso){
        this.nome = nome;
        this.tipo = tipo;
        this.idade = idade;
        this.habitat = habitat;
        this.altura = altura;
        this.peso = peso;
    }

    @Override
    public void comer(double quantidade) {
        peso += quantidade;
    }
    @Override
    public void moverse(double distancia) {
        System.out.println(nome + " percorreu: " + distancia + "KM");
    }
    @Override
    public void dormir(int horas) {
        System.out.println("Ele dormiu: " + horas + "h");
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}



