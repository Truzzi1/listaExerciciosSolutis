package empresa;

public class Funcionario {

  protected String nome;
  protected int codigo;
  protected double salarioBase;
  protected Comissao comissao;

  Funcionario(String nome, int codigo, double acrescimo) {
    this.nome = nome;
    this.codigo = codigo;
    this.salarioBase = 1000 * acrescimo;
  }

  Funcionario(String nome, int codigo) {
    this.nome = nome;
    this.codigo = codigo;
    this.salarioBase = 1000;
  }

  Funcionario(String nome, int codigo, double acrescimo, Comissao comissao) {
    this.nome = nome;
    this.codigo = codigo;
    this.salarioBase = 1000 * acrescimo + comissao.bonus;
    this.comissao = comissao;
  }

  public double getSalarioBase() {
    return salarioBase;
  }

  public void setSalarioBase(double salarioBase) {
    this.salarioBase = salarioBase;
  }

  @Override
  public String toString() {
    return "Funcionario{" +
        "nome='" + nome + '\'' +
        ", comissao=" + comissao.bonus +
        ", salarioTotal=" + salarioBase +
        '}';
  }
}
