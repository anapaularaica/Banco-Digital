// Classe abstrata Conta define as propriedades e métodos compartilhados por todas as contas
public abstract class Conta implements IConta {
    
    private static final int AGENCIA_PADRAO = 1;  // Agência padrão para todas as contas
    private static int SEQUENCIAL = 1;            // Número sequencial das contas

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    // Construtor inicializa a conta com agência padrão, número sequencial e cliente
    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    // Implementação do método sacar: diminui o saldo pelo valor informado
    @Override
    public void sacar(double valor) {
        saldo -= valor;
    }

    // Implementação do método depositar: aumenta o saldo pelo valor informado
    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    // Implementação do método transferir: saca da conta atual e deposita na conta destino
    @Override
    public void transferir(double valor, IConta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    // Métodos para acessar a agência, o número e o saldo da conta
    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    // Método para imprimir as informações comuns da conta
    protected void imprimirInfosComuns() {
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agência: %d", this.agencia));
        System.out.println(String.format("Número: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }
}
