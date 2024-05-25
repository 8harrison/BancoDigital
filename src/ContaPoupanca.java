public class ContaPoupanca extends Conta{
    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    public void imprimirExtrato(){
        println("=== Extrato Conta Poupança ===");
        super.imprimirInfosComuns();
    }
}
