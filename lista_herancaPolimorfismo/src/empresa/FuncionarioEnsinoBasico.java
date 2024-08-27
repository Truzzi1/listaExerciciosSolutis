package empresa;

public class FuncionarioEnsinoBasico extends Funcionario {

  protected String ensinoBasico;

  FuncionarioEnsinoBasico(String nome, int codigo, String ensinoBasico, double acrescimo) {
    super(nome, codigo, acrescimo * 1.1);
    this.ensinoBasico = ensinoBasico;
  }

  FuncionarioEnsinoBasico(String nome, int codigo, String ensinoBasico) {
    super(nome, codigo, 1.1);
    this.ensinoBasico = ensinoBasico;
  }

  FuncionarioEnsinoBasico(String nome, int codigo, String ensinoBasico, double acrescimo,
      Comissao comissao) {
    super(nome, codigo, acrescimo * 1.1, comissao);
    this.ensinoBasico = ensinoBasico;
  }

}
