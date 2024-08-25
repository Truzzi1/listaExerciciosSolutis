public class Operario extends Empregado{
    protected double valorProducao = 0;
    protected double comissao;

    Operario(){

    }

    Operario(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double valorProducao){
        super(nome, endereco, telefone, codigoSetor, salarioBase);
        this.comissao = valorProducao*0.5;
        this.valorProducao = valorProducao;
    }

    @Override
    public double calcularSalario() {
        return this.comissao + (salarioBase - (salarioBase*imposto));
    }

    public double getValorProducao() {
        return valorProducao;
    }

    public void setValorProducao(double valorProducao) {
        this.valorProducao = valorProducao;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }
}
