package empresa;

public class TesteComissao {
  public static void main(String[] args) {
    Empresa empresa = new Empresa();
// Definindo as comissões
    ComissaoGerente gerenteComissao = new ComissaoGerente();
    ComissaoVendedor supervisorComissao = new ComissaoVendedor();
    ComissaoSupervisor vendedorComissao = new ComissaoSupervisor();

// Funcionários Gerentes (1 funcionário - 10%)
    Funcionario gerente1 = new Funcionario("Alberto", 101, 1.0, gerenteComissao);
    empresa.adicionaFuncionario(gerente1);

// Funcionários Supervisores (2 funcionários - 20%)
    Funcionario supervisor1 = new Funcionario("Bruno", 202, 1.0, supervisorComissao);
    empresa.adicionaFuncionario(supervisor1);

    Funcionario supervisor2 = new Funcionario("Carla", 203, 1.0, supervisorComissao);
    empresa.adicionaFuncionario(supervisor2);

// Funcionários Vendedores (7 funcionários - 70%)
    Funcionario vendedor1 = new Funcionario("Daniel", 301, 1.0, vendedorComissao);
    empresa.adicionaFuncionario(vendedor1);

    Funcionario vendedor2 = new Funcionario("Elisa", 302, 1.0, vendedorComissao);
    empresa.adicionaFuncionario(vendedor2);

    Funcionario vendedor3 = new Funcionario("Fernanda", 303, 1.0, vendedorComissao);
    empresa.adicionaFuncionario(vendedor3);

    Funcionario vendedor4 = new Funcionario("Gustavo", 304, 1.0, vendedorComissao);
    empresa.adicionaFuncionario(vendedor4);

    Funcionario vendedor5 = new Funcionario("Helena", 305, 1.0, vendedorComissao);
    empresa.adicionaFuncionario(vendedor5);

    Funcionario vendedor6 = new Funcionario("Igor", 306, 1.0, vendedorComissao);
    empresa.adicionaFuncionario(vendedor6);

    Funcionario vendedor7 = new Funcionario("Julia", 307, 1.0, vendedorComissao);
    empresa.adicionaFuncionario(vendedor7);

    FuncionarioUniversitario funcionarioUniversitario2 = new FuncionarioUniversitario("Gabriela",
        102, "Colégio Técnico", "Colégio Estadual", "Universidade de São Paulo");
    empresa.adicionaFuncionario(funcionarioUniversitario2);

    empresa.CalcularCustoComissao();
    empresa.listarFuncionarios();
  }
}
