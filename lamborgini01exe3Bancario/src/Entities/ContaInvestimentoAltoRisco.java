package Entities;

public class ContaInvestimentoAltoRisco extends ContaInvestimento{
    public ContaInvestimentoAltoRisco(int numeroConta, String titular, double saldo) {
        super(numeroConta, titular, saldo);
    }

    @Override
    public void sacar(double valor) {
        if(valor < 10000){
            System.out.println("Saldo falhou!\nSaque minino R$ 10.000 !!");
        }else {
            double taxa = 1.05;
            if (valor * taxa <= getSaldo()) {
                setSaldo(getSaldo() - valor * taxa);
                System.out.printf("Valor sacado com sucesso!!\n");
            } else {
                System.out.println("Valor digitado maior que saldo disponivel!");
            }
        }
    }
}
