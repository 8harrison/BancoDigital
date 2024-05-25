public class ContaCorrente extends Conta{
    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    public void imprimirExtrato(){
        println("=== Extrato Conta Corrente ===");
        super.imprimirInfosComuns();
    }
}
