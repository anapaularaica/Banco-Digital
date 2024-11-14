// Classe principal onde tudo é executado
public class Main {

    public static void main(String[] args) {
        // Cria um cliente e define seu nome
        Cliente ana = new Cliente();
        ana.setNome("Ana Paula");

        // Cria uma conta corrente e uma conta poupança para o cliente
        Conta cc = new ContaCorrente(ana);
        Conta poupanca = new ContaPoupanca(ana);

        // Realiza um depósito na conta corrente
        cc.depositar(3300);

        // Transfere o valor da conta corrente para a conta poupança
        cc.transferir(1080, poupanca);

        // Imprime o extrato da conta corrente e da conta poupança
        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
