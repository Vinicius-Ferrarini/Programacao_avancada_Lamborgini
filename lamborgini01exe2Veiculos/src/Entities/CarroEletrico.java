package Entities;

public class CarroEletrico extends Carro{
    private int bateriaKwh;


    public CarroEletrico(String marca, String modelo, int ano, int capacidadePassageiro, String combustivel, String tipoCarro, int bateriaKwh) {
        super(marca, modelo, ano, capacidadePassageiro, combustivel, tipoCarro);
        this.bateriaKwh = bateriaKwh;
    }

    @Override
    public double calcularAutonomia() {
        return  bateriaKwh * 5;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.printf("\nBateria: %dKwh");
    }
}
