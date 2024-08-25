public class Vendedor extends Empregado{
    protected double valorVendas = 0;
    protected double comissao;

    Vendedor(){

    }

    Vendedor(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double valorVendas){
        super(nome, endereco, telefone, codigoSetor, salarioBase);
        this.comissao = valorVendas*0.5;
        this.valorVendas = valorVendas;
    }

    @Override
    public double calcularSalario() {
        return this.comissao + (salarioBase - (salarioBase*imposto));
    }

    public double getValorVendas() {
        return valorVendas;
    }

    public void setValorVendas(double valorVendas) {
        this.valorVendas = valorVendas;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }
}
