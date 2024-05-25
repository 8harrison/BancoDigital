public class Main {
    public static void main(String[] args) {
        Cliente harri = new Cliente();
        harri.setNome("Harrison");

        Conta cc = new ContaCorrente(harri);
        Conta poupanca = new ContaPoupanca(harri);

        cc.deposito(100);
        cc.transferencia(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
