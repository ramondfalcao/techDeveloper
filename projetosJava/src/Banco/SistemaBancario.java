package Banco;

public class SistemaBancario {
    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.setNumero("1231");
        conta.movimentar(0,215.0);
        conta.movimentar(1,200.0);
        System.out.println(conta.getSaldo());
    }
}