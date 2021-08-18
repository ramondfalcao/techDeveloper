package Banco;

public class Conta {
    private String numero;
    private Double saldo = 0.0 ;

    public void setNumero(String numero) {
        this.numero = numero;
    }
    public void movimentar(int  tipoMovimento, Double valor){
        if(tipoMovimento == 1)
            sacar(valor);
        else
            depositar(valor);
    }
    private void depositar(Double valor){
        this.saldo = this.saldo +valor;
    }
    private void sacar(Double valor){
        if(this.saldo >= valor)
            this.saldo = this.saldo - valor;
        else
            System.out.println("O saldo Ã© insufiente");
    }
    public Double getSaldo() {
        return saldo;
    }
}