package exercicio1;

public class Renault extends  Carro {

    public Renault(String marca, Integer ano, Double valor, String cor, Integer portas) {

        super(marca, ano, valor, cor, portas);
        this.setVelocidade(0.00);
        this.setValorVelocidadeAcrescentada(10.00);
        this.setValorVelocidadePerdida(5.00);

    }

}
