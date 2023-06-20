package exercicio1;

public class Hyundai extends  Carro {

    public Hyundai(String marca, Integer ano, Double valor, String cor, Integer portas) {

        super(marca, ano, valor, cor, portas);
        this.setVelocidade(5.00);
        this.setValorVelocidadePerdida(2.00);
        this.setValorVelocidadeAcrescentada(15.0);

    }

}
