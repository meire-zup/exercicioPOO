package exercicio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("VAMOS DIRIGIR?");
        /*System.out.println("Escolha o carro que você vai dirigir (1 - Renault, 2 - Hyundai ou 3 - Fiat:");
        int escolhaCarro = scanner.nextInt();
        if (escolhaCarro == 1) {*/

            Carro carro = new Renault("Renault", 2022, 70000.00, "Preto", 4);
            //new Hyundai("Hyndai", 2022, 70000.00, "Preto", 4);
            // new Fiat("Fiat", 2022, 70000.00, "Preto", 4);


            carro.imprimeCarro();
            int escolha;

            do {
                System.out.println("Escolha 1 para freiar, 2 para acelerar ou 0 para sair:");

                escolha = scanner.nextInt();


                if (escolha == 1) {

                    carro.freiaCarro();

                } else if (escolha == 2) {

                    carro.aceleraCarro();

                } else if (escolha < 0 || escolha > 2) {

                    System.out.println("Valor inválido!");

                } else if (escolha == 0) {

                    System.out.println("FIM");

                }

            } while (escolha != 0);


        }
    }

