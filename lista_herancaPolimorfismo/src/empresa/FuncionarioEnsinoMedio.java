package empresa;

public class FuncionarioEnsinoMedio extends FuncionarioEnsinoBasico {

  protected String ensinoMedio;

  FuncionarioEnsinoMedio(String nome, int codigo, String ensinoBasico, String ensinoMedio, double acrescimo) {
    super(nome, codigo, ensinoBasico, acrescimo*1.5);
    this.ensinoMedio = ensinoMedio;
  }

  FuncionarioEnsinoMedio(String nome, int codigo, String ensinoBasico, String ensinoMedio) {
    super(nome, codigo, ensinoBasico, 1.5);
    this.ensinoMedio = ensinoMedio;
  }

  FuncionarioEnsinoMedio(String nome, int codigo, String ensinoBasico, String ensinoMedio,
      double acrescimo, Comissao comissao) {
    super(nome, codigo, ensinoBasico, acrescimo*1.5, comissao);
    this.ensinoMedio = ensinoMedio;
  }
}
