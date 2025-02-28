package Entities;

public class ContaPoupanca extends ContaBancaria{
    public ContaPoupanca(int numeroConta, String titular, double saldo) {
        super(numeroConta, titular, saldo);
    }

    @Override
    public void sacar(double valor) {
        if(valor <= getSaldo()){
            setSaldo(getSaldo()-valor);
            System.out.printf("Valor sacado com sucesso!!\n");
        }else {
            System.out.println("Valor digitado maior que saldo disponivel!");
        }
    }
}
