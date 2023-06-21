package exercicio1;

public abstract class Carro {

    private String marca;
    private Integer ano;
    private Double valor;
    private String cor;
    private Integer portas;
    private  Double velocidade;
    private  Double valorVelocidadeAcrescentada;
    private  Double valorVelocidadePerdida;


    public Carro(String marca, Integer ano, Double valor, String cor, Integer portas) {

        this.marca = marca;
        this.ano = ano;
        this.valor = valor;
        this.cor = cor;
        this.portas = portas;

    }


    public void setValorVelocidadeAcrescentada(Double valorVelocidadeAcrescentada) {
        this.valorVelocidadeAcrescentada = valorVelocidadeAcrescentada;
    }

    public void setValorVelocidadePerdida(Double valorVelocidadePerdida) {
        this.valorVelocidadePerdida = valorVelocidadePerdida;
    }

    public Double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(Double velocidade) {
        this.velocidade = velocidade;
    }

    public  void iniciaPartidaMotor() {

        System.out.println("Iniciando o motor… minha velocidade está em [" + this.getVelocidade() + " km/h]");

    };

    public void freiaCarro(){
        if (this.velocidade > 0) {

            double novaVelocidade = this.getVelocidade() - valorVelocidadePerdida;
            System.out.println("Freando… minha velocidade está em [" + (novaVelocidade) + " km/h]");
            this.velocidade = novaVelocidade;

        } else {

            System.out.println("Atenção: CARRO PARADO!");

        }

    };

    public void aceleraCarro() {

        double novaVelocidade = this.getVelocidade() + valorVelocidadeAcrescentada;
        System.out.println("Acelerando… minha velocidade está em [" + (this.getVelocidade() + valorVelocidadeAcrescentada) + " km/h]");
        this.velocidade = novaVelocidade;

    }

    public void imprimeCarro (){

        System.out.println("Você irá dirigir o carro:");
        System.out.println("Marca: " + this.marca);
        System.out.println("Ano: " + this.ano);
        System.out.println("Cor: " + this.cor);
        System.out.println("Portas: " + this.portas);
        System.out.println("Valor: " + this.valor);

        iniciaPartidaMotor();

    }

}
