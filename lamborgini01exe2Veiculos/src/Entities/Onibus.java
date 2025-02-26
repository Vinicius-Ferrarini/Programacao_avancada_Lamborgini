package Entities;

public class Onibus extends Veiculo{
    private int quantidadeEixos;


    public Onibus(String marca, String modelo, int ano, int capacidadePassageiro, String combustivel, int quantidadeEixos) {
        super(marca, modelo, ano, capacidadePassageiro, combustivel);
        this.quantidadeEixos = quantidadeEixos;
        if (quantidadeEixos > 8 || quantidadeEixos < 6){
            throw new IllegalArgumentException("A quantidade de eixos deve ser entre 6 e 8");
        }
    }

    public  double calcularAutonomia(){
        return 200 * 5;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.printf("\nQuantidade eixos: %d",quantidadeEixos);
    }
}
