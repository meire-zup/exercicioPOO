package exercicio2;

import java.util.Scanner;

public class Livro {

    private String titulo;
    private String autor;
    private String genero;
    private Long isbn;
    Scanner scanner = new Scanner(System.in);

    public void registrarLivro() {

        System.out.println("Informe o isbn do livro: ");

        Long isbnInformado = scanner.nextLong();

        System.out.println("Livro registrado com o ISBN " + isbnInformado);



    }


}
