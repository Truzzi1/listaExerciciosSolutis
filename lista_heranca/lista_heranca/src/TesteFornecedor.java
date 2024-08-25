public class TesteFornecedor {
    public static void main(String[] args) {
        Fornecedor fornecedor = new Fornecedor("Erick", "Santos", "999-999");
        fornecedor.setValorDivida(1050);
        System.out.println(fornecedor.obterSaldo());
    }
}
