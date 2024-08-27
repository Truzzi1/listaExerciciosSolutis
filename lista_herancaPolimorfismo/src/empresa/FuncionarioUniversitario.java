package empresa;

public class FuncionarioUniversitario extends FuncionarioEnsinoMedio {

  protected String universiade;


  FuncionarioUniversitario(String nome, int codigo, String ensinoBasico, String ensinoMedio,
      String universiade) {
    super(nome, codigo, ensinoBasico, ensinoMedio, 2);
    this.universiade = universiade;
  }
  FuncionarioUniversitario(String nome, int codigo, String ensinoBasico, String ensinoMedio,
      String universiade, Comissao comissao) {
    super(nome, codigo, ensinoBasico, ensinoMedio, 2, comissao);
    this.universiade = universiade;
  }
}
