package empresa;

public class TesteFuncionario {

  public static void main(String[] args) {
    Empresa empresa = new Empresa();
    // Funcionários com Ensino Básico
    FuncionarioEnsinoBasico funcionarioBasico1 = new FuncionarioEnsinoBasico("Carlos", 123,
        "Escola Maria da Glória");
    empresa.adicionaFuncionario(funcionarioBasico1);

    FuncionarioEnsinoBasico funcionarioBasico2 = new FuncionarioEnsinoBasico("Ana", 234,
        "Escola Dom Pedro");
    empresa.adicionaFuncionario(funcionarioBasico2);

    FuncionarioEnsinoBasico funcionarioBasico3 = new FuncionarioEnsinoBasico("José", 345,
        "Escola São Paulo");
    empresa.adicionaFuncionario(funcionarioBasico3);

    FuncionarioEnsinoBasico funcionarioBasico4 = new FuncionarioEnsinoBasico("Mariana", 456,
        "Escola Luz do Saber");
    empresa.adicionaFuncionario(funcionarioBasico4);

// Funcionários com Ensino Médio
    FuncionarioEnsinoMedio funcionarioMedio1 = new FuncionarioEnsinoMedio("Ricardo", 567,
        "Colégio Estadual", "Colégio Técnico");
    empresa.adicionaFuncionario(funcionarioMedio1);

    FuncionarioEnsinoMedio funcionarioMedio2 = new FuncionarioEnsinoMedio("Fernanda", 678,
        "Colégio Militar", "Colégio Estadual");
    empresa.adicionaFuncionario(funcionarioMedio2);

    FuncionarioEnsinoMedio funcionarioMedio3 = new FuncionarioEnsinoMedio("Rafael", 789,
        "Colégio Santos", "Colégio Dom Pedro");
    empresa.adicionaFuncionario(funcionarioMedio3);

    FuncionarioEnsinoMedio funcionarioMedio4 = new FuncionarioEnsinoMedio("Bianca", 890,
        "Colégio Central", "Colégio Monteiro");
    empresa.adicionaFuncionario(funcionarioMedio4);

// Funcionários com Ensino Superior
    FuncionarioUniversitario funcionarioUniversitario1 = new FuncionarioUniversitario("Leonardo",
        901, "Colégio Estadual", "Colégio Monteiro", "Universidade Federal");
    empresa.adicionaFuncionario(funcionarioUniversitario1);

    FuncionarioUniversitario funcionarioUniversitario2 = new FuncionarioUniversitario("Gabriela",
        102, "Colégio Técnico", "Colégio Estadual", "Universidade de São Paulo");
    empresa.adicionaFuncionario(funcionarioUniversitario2);

    empresa.CalculaCusto();
  }

}
