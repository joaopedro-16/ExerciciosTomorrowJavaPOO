package aula2.q1;

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria("João", "12345", 1000.0);
        conta1.sacar(500.0);
        conta1.depositar(200.0);
        System.out.println("Saldo final da conta1: R$" + conta1.getSaldo());
    }
}