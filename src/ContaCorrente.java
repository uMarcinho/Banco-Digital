public class ContaCorrente extends Conta {
    private double limiteChequeEspecial;

    public ContaCorrente(Cliente cliente, double limiteChequeEspecial) {
        super(cliente);
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    @Override
    public void sacar(double valor) {
        if (valor > saldo + limiteChequeEspecial) {
            throw new RuntimeException("Saldo + cheque especial insuficientes");
        }
        saldo -= valor;
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("\n=== Extrato Conta Corrente ===");
        imprimirInfosComuns();
        System.out.printf("Limite cheque especial: %.2f\n", limiteChequeEspecial);
    }
}