public class Main {
    public static void main(String[] args) {

        ContaBancaria conta = new ContaBancaria(12345, 1000.0);

        Cliente cliente = new Cliente("João Silva", "123.456.789-00", conta);

        System.out.println("Saldo inicial: R$" + cliente.getConta().getSaldo());
        cliente.getConta().depositar(500.0);
        cliente.getConta().sacar(200.0);
        System.out.println("Saldo final: R$" + cliente.getConta().getSaldo());
    }
}