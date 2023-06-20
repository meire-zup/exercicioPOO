package exercicio3;

import java.time.LocalDate;
import java.util.Scanner;

public class Funcionario {

    private String nome;
    private LocalDate dataAdmissao;
    private Double salario;

    private Long id;
    private static long identificador = 1L;

    public Funcionario() {

        this.id = identificador;
        identificador++;

    }

    public String getNome() {
        return nome;
    }

    public LocalDate getDataAdmissao() {
        return dataAdmissao;
    }

    public Double getSalario() {
        return salario;
    }

    public Long getIdentificador() {
        return identificador;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDataAdmissao(LocalDate dataAdmissaoAdmissao) {

        if (dataAdmissaoAdmissao.isBefore(LocalDate.now())) {

            this.dataAdmissao = dataAdmissaoAdmissao;

        } else {

            System.out.println("Não é possível registrar funcionário com data futura!");

        }
    }

    public void setSalario(Double salario) {

        if(salario >= 700.00) {

            this.salario = salario;

        } else {

            System.out.println("Funcionário não pode ser contradado com salário inferior a R$ 700,00");

        }
    }

    public void cadastrarFuncionario() {

        Scanner tecladoNumerico = new Scanner(System.in);
        Scanner tecladoAlfa = new Scanner(System.in);
        System.out.println("Informe o nome do funcionário:");
        this.setNome(tecladoAlfa.nextLine());
        System.out.println("Informe o salário do funcionário:");
        setSalario(tecladoNumerico.nextDouble());
        System.out.println("Informe a data de admissão do funcionário (formato: yyyy-MM-dd):");
        String data = tecladoAlfa.nextLine();
        this.setDataAdmissao(LocalDate.parse(data));
        imprimeRelatorio();

    }
     private  void imprimeRelatorio() {
        System.out.println("************************************");
        System.out.println("Cadastro concluído com sucesso!");
        System.out.println("Id do funcionário: " + this.id);
        System.out.println("Nome: " + this.getNome());
        System.out.println("Salário: " + this.getSalario());
        System.out.println("Data de admissão: " + this.getDataAdmissao());
        System.out.println("************************************");

    }

}


