package Entities;

public class Carro extends Veiculo{
    private String tipoCarro;

    public Carro(String marca, String modelo, int ano, int capacidadePassageiro, String combustivel, String tipoCarro) {
        super(marca, modelo, ano, capacidadePassageiro, combustivel);
        this.tipoCarro = tipoCarro;
    }

    public String getTipoCarro() {
        return tipoCarro;
    }

    public void setTipoCarro(String tipoCarro) {
        this.tipoCarro = tipoCarro;
    }


    public  double calcularAutonomia(){
        return 50 * 12;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.printf("\n %s",tipoCarro);
    }
}
