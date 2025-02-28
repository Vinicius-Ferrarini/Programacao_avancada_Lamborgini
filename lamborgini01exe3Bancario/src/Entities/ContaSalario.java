package Entities;

public class ContaSalario extends ContaCorrente{
    private int quantidadeSaques;
    public ContaSalario(int numeroConta, String titular, double saldo) {
        super(numeroConta, titular, saldo);
        this.quantidadeSaques=0;
    }

    public boolean primeiroSaque(){
        if (this.quantidadeSaques == 0){
            return true;
        }
        return false;
    }

    @Override
    public void sacar(double valor) {
        if (primeiroSaque()) {
            super.sacar(valor);
        }else{
            double taxa = 5;
            if(valor <= getSaldo() - taxa){
                setSaldo(getSaldo()-valor - taxa);
                System.out.printf("Valor sacado com sucesso!!\n");
            } else if (valor <= getSaldo() + limiteChequeEspecial - taxa) {
                setSaldo(getSaldo()-valor-limiteChequeEspecial - taxa);
                System.out.printf("Valor sacado usando cheque especial,novo saldo : %.2f\n",getSaldo());
            }else {
                System.out.println("Valor digitado maior que saldo disponivel!");
            }
        }
    }
}
