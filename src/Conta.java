public class Conta {

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    private double saldo;
    private int numeroConta;
    private int numeroAgencia;
    private Cliente cliente;

    public Conta(Cliente cliente) {
        this.numeroConta = SEQUENCIAL++;
        this.numeroAgencia = Conta.AGENCIA_PADRAO;
        this.cliente = cliente;
    }

    public void deposito(double valor) {
        this.saldo += valor;
    }

    public void saque(double valor) {
        if (this.saldo >= valor){
            this.saldo -= valor;
        }
    }

    public void transferencia(double valor, Conta contaDestino){
        if (this.saldo >= valor){
            this.saldo -= valor;
            contaDestino.deposito(valor);
        }
    }

    public static void println(Object object) {
        System.out.println(object);
    }

    public void imprimirInfosComuns(){
        println(String.format("Titular: %s", this.cliente.getNome()));
        println(String.format("Agência: %d", this.numeroAgencia));
        println(String.format("Número da conta: %d", this.numeroConta));
        println(String.format("Saldo: %.2f", this.saldo));
    }

    public void imprimirExtrato() {
        imprimirInfosComuns();
    }
}
