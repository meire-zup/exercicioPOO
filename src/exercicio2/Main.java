package exercicio2;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner tecladoNumerico = new Scanner(System.in);
        Scanner tecladoAlfa = new Scanner(System.in);


        Livro livro1 = new Livro();
        int escolha;

        do {
            System.out.println("Informe o tipo de cadastro que gostaria de realizar:");
            System.out.println("1 - para cadastrar somente com o ISBN");
            System.out.println("2 - para cadastrar com ISBN e nome");
            System.out.println("3 - para cadastrar com ISBN, nome e gênero");
            System.out.println("4 - para cadastrar com ISBN, nome, gênero e título");

            escolha = tecladoNumerico.nextInt();
            switch (escolha) {
                case 1:
                    System.out.println("Informe o isbn do livro: ");
                    long isbn = tecladoNumerico.nextLong();
                    livro1.registrarLivro(isbn);
                    break;

                case 2:
                    System.out.println("Informe o isbn do livro: ");
                    isbn = tecladoNumerico.nextLong();
                    System.out.println("Informe o nome do livro:");
                    String  nome = tecladoAlfa.nextLine();
                    livro1.registrarLivro(isbn, nome);
                    break;

                case 3:
                    System.out.println("Informe o isbn do livro: ");
                    isbn = tecladoNumerico.nextLong();
                    System.out.println("Informe o título do livro:");
                    nome = tecladoAlfa.nextLine();
                    System.out.println("Informe o gênero do livro:");
                    String genero = tecladoAlfa.nextLine();
                    livro1.registrarLivro(isbn, nome, genero);
                    break;

                case 4:
                    System.out.println("Informe o isbn do livro: ");
                    isbn = tecladoNumerico.nextLong();
                    System.out.println("Informe o título do livro:");
                    nome = tecladoAlfa.nextLine();
                    System.out.println("Informe o gênero do livro:");
                    genero = tecladoAlfa.nextLine();
                    System.out.println("Informe o autor do livro:");
                    String autor = tecladoAlfa.nextLine();
                    livro1.registrarLivro(isbn, nome, genero, autor);
                    break;

                case 5:
                default:
                    System.out.println("Escolha inválida");

            }
        } while (escolha < 1 || escolha > 4);


    }
}
