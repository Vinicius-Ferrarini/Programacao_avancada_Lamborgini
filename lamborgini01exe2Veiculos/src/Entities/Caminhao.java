package Entities;

public class Caminhao extends Veiculo{
    private int capacidadeCarga;


    public Caminhao(String marca, String modelo, int ano, int capacidadePassageiro, String combustivel, int capacidadeCarga) {
        super(marca, modelo, ano, capacidadePassageiro, combustivel);
        this.capacidadeCarga = capacidadeCarga;
    }


    public  double calcularAutonomia(){
        return 300 * 6 * Math.min(1- capacidadeCarga * 0.01 , 0.25);
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.printf("\nCom capacidade de carga: %dt",capacidadeCarga);
    }
}
