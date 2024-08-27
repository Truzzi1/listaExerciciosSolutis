package empresa;

import java.util.ArrayList;
import java.util.List;

public class Empresa {

  protected List<Funcionario> funcionarios = new ArrayList<Funcionario>();

  public Empresa() {

  }

  public void CalculaCusto() {
    double valorTotal = 0;
    double valorTotalBasico = 0;
    double valorTotalMedio = 0;
    double valorTotalSuperior = 0;
    for (int i = 0; i < funcionarios.toArray().length; i++) {
      Funcionario funcionario = funcionarios.get(i);
      double salario = funcionario.getSalarioBase();
      valorTotal += salario;
      if (funcionario instanceof FuncionarioUniversitario) {
        valorTotalSuperior += salario;
      } else if (funcionario instanceof FuncionarioEnsinoMedio) {
        valorTotalMedio += salario;
      } else if (funcionario instanceof FuncionarioEnsinoBasico) {
        valorTotalBasico += salario;
      }
    }
    System.out.println("Salario Total: " + valorTotal);
    System.out.println("Salario Total Basico: " + valorTotalBasico);
    System.out.println("Salario Total Medio: " + valorTotalMedio);
    System.out.println("Salario Total Superior: " + valorTotalSuperior);
  }

  public void CalcularCustoComissao(){
    double valorTotal = 0;
    double surpevisor = 0;
    double vendedor = 0;
    double gerente = 0;
    for (int i = 0; i < funcionarios.toArray().length; i++) {
      Funcionario funcionario = funcionarios.get(i);
      double salario = funcionario.getSalarioBase();
      valorTotal += salario;
      if(funcionario.comissao == null){
        funcionario.comissao = new Comissao(0);
      }
      if (funcionario.comissao instanceof ComissaoSupervisor) {
        surpevisor += salario;
      } else if (funcionario.comissao instanceof ComissaoVendedor) {
        vendedor += salario;
      } else if (funcionario.comissao instanceof ComissaoGerente) {
        gerente += salario;
      }
    }
    System.out.println("Salario Total: " + valorTotal);
    System.out.println("Salario Total gerente: " + gerente);
    System.out.println("Salario Total vendedor: " + vendedor);
    System.out.println("Salario Total surpevisor: " + surpevisor);
  }

  public void adicionaFuncionario(Funcionario funcionario) {
    funcionarios.add(funcionario);
  }

  public void listarFuncionarios() {
    for (Funcionario funcionario : funcionarios) {
      System.out.println(funcionario.toString());
    }
  }
}
