package Entities;

public class ContaInvestimento extends ContaBancaria{
    public ContaInvestimento(int numeroConta, String titular, double saldo) {
        super(numeroConta, titular, saldo);
    }

    @Override
    public void sacar(double valor) {
        double taxa = 1.02;
        if(valor * taxa <= getSaldo()){
            setSaldo(getSaldo() - valor * taxa);
            System.out.printf("Valor sacado com sucesso!!\n");
        }else {
            System.out.println("Valor digitado maior que saldo disponivel!");
        }
    }
}
