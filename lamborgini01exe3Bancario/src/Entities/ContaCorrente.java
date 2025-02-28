package Entities;

public class ContaCorrente extends ContaBancaria{
    public double limiteChequeEspecial;

    public ContaCorrente(int numeroConta, String titular, double saldo) {
        super(numeroConta, titular, saldo);
    }

    public ContaCorrente(int numeroConta, String titular, double saldo, double limiteChequeEspecial) {
        super(numeroConta, titular, saldo);
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    @Override
    public void sacar(double valor) {
        if(valor <= getSaldo()){
            setSaldo(getSaldo()-valor);
            System.out.printf("Valor sacado com sucesso!!\n");
        } else if (valor <= getSaldo() + limiteChequeEspecial) {
            setSaldo(getSaldo()-valor-limiteChequeEspecial);
            System.out.printf("Valor sacado usando cheque especial,novo saldo : %.2f\n",getSaldo());
        }else {
            System.out.println("Valor digitado maior que saldo disponivel!");
        }
    }
}
