public class Peixe extends AnimalMarinhoAB{

    public Peixe(String nome, int idade, String habitat, double altura, double peso, double tamanhoNadadeira) {
        super(nome, "Peixe", idade, habitat, altura, peso, tamanhoNadadeira);
    }
    @Override
    public void comer(double quantidade) {
        peso += quantidade * 0.1;
    }
}
