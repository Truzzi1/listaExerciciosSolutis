public class Fornecedor extends Pessoa{
    protected double valorCredito = 2000;
    protected double valorDivida;

    public Fornecedor(){

    }

    public Fornecedor(String nome, String endereco, String telefone){
        super(nome, endereco, telefone);
    }

    public Fornecedor(String nome, String endereco, String telefone, double valorCredito, double valorDivida){
        super(nome, endereco, telefone);
        this.valorCredito = valorCredito;
        this.valorDivida = valorDivida;
    }

    public double obterSaldo(){
        return this.valorCredito - this.valorDivida;
    }

    public double getValorCredito() {
        return valorCredito;
    }

    public void setValorCredito(double valorCredito) {
        this.valorCredito = valorCredito;
    }

    public double getValorDivida() {
        return valorDivida;
    }

    public void setValorDivida(double valorDivida) {
        this.valorDivida = valorDivida;
    }
}
