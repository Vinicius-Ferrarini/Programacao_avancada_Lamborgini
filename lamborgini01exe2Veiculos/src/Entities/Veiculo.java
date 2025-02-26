package Entities;

public abstract class Veiculo {
    private String marca;
    private String modelo;
    private int ano;
    private int capacidadePassageiro;
    private String combustivel;


    public Veiculo(String marca, String modelo, int ano, int capacidadePassageiro, String combustivel) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.capacidadePassageiro = capacidadePassageiro;
        this.combustivel = combustivel;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getCapacidadePassageiro() {
        return capacidadePassageiro;
    }

    public void setCapacidadePassageiro(int capacidadePassageiro) {
        this.capacidadePassageiro = capacidadePassageiro;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    public abstract double calcularAutonomia();

    public void exibirDetalhes(){
        System.out.printf(" %s %s %d\nCapacidade: %d pessoa(s)\nCombustivel: %s",marca,modelo,ano,capacidadePassageiro,combustivel);
    }
}
