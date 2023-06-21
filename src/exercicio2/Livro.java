package exercicio2;

import java.util.Scanner;

public class Livro {

    private String titulo;
    private String autor;
    private String genero;
    private Long isbn;

    public void registrarLivro(Long isbnInformado) {

        System.out.println("O livro foi registrado com o ISBN [" + isbnInformado + "]");

    }

    public void registrarLivro(Long isbnInformado, String nome){

        System.out.println("O livro foi registrado com o ISBN [" + isbnInformado + "] e o nome [" + nome + "]");

    }

    public void registrarLivro(Long isbnInformado, String nome, String genero){

        System.out.println("O livro foi registrado com o ISBN [" + isbnInformado + "], o nome [" + nome + "] e " +
                "o gênero [" + genero + "]");

    }
    public void registrarLivro(Long isbnInformado, String nome, String genero, String autor){

        System.out.println("O livro foi registrado com o ISBN [" + isbnInformado + "], o nome [" + nome + "]" +
                ", o gênero [" + genero + "] e o autor [" + autor + "]");

    }

}
