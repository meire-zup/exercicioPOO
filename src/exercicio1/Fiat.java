package exercicio1;

public class Fiat extends  Carro{

    public Fiat(String marca, Integer ano, Double valor, String cor, Integer portas) {

        super(marca, ano, valor, cor, portas);
        this.setVelocidade(3.00);
        this.setValorVelocidadeAcrescentada(12.00);
        this.setValorVelocidadePerdida(6.00);

    }

}
