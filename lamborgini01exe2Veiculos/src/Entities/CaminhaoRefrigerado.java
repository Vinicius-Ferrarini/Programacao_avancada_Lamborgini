package Entities;

public class CaminhaoRefrigerado extends Caminhao{
    private double temperaturaMinima;

    public CaminhaoRefrigerado(String marca, String modelo, int ano, int capacidadePassageiro, String combustivel, int capacidadeCarga, double temperaturaMinima) {
        super(marca, modelo, ano, capacidadePassageiro, combustivel, capacidadeCarga);
        this.temperaturaMinima = temperaturaMinima;
    }

    @Override
    public double calcularAutonomia() {
        return super.calcularAutonomia() * 0.9;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.printf("A temperatura minima: %.1f", temperaturaMinima);
    }
}
