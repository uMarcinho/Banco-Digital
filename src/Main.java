public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco("Digital Bank");
        
        Cliente cliente1 = new Cliente("João Silva", "12345678901");
        Cliente cliente2 = new Cliente("Maria Souza", "98765432109");
        
        Conta cc1 = new ContaCorrente(cliente1, 1000);
        Conta cp1 = new ContaPoupanca(cliente1);
        Conta cc2 = new ContaCorrente(cliente2, 500);
        
        banco.adicionarConta(cc1);
        banco.adicionarConta(cp1);
        banco.adicionarConta(cc2);
        
        // Operações bancárias
        cc1.depositar(1000);
        cc1.transferir(300, cp1);
        cp1.depositar(200);
        cc1.sacar(150);
        
        // Aplicar rendimento na poupança
        ((ContaPoupanca) cp1).aplicarRendimento(0.005); // 0.5%
        
        // Listar todas as contas
        banco.listarContas();
        
        // Testando autenticação
        System.out.println("\nAutenticação: " + cliente1.autenticar("12345678901"));
    }
}