public class Administrador extends Empregado{
    protected double ajudaDeCusto = 0;

    Administrador() {

    }

    Administrador(String nome, String endereco, String telefone, int codigoSetor, double salarioBase){
        super(nome, endereco, telefone, codigoSetor, salarioBase);
    }

    @Override
    public double calcularSalario() {
        return this.ajudaDeCusto + (salarioBase - (salarioBase*imposto));
    }

    public double getAjudaDeCusto() {
        return ajudaDeCusto;
    }

    public void setAjudaDeCusto(double ajudaDeCusto) {
        this.ajudaDeCusto = ajudaDeCusto;
    }
}
