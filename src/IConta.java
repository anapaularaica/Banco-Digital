
// Interface IConta define o comportamento comum das contas (corrente e poupança)
public interface IConta {
    
    void sacar(double valor);      // Método para sacar um valor da conta
    void depositar(double valor);   // Método para depositar um valor na conta
    void transferir(double valor, IConta contaDestino); // Método para transferir entre contas
    void imprimirExtrato();         // Método para imprimir o extrato da conta
}
