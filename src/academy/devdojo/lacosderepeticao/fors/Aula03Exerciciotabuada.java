package academy.devdojo.lacosderepeticao.fors;

import java.util.Scanner;

public class Aula03Exerciciotabuada {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um número:");
        int numero = ler.nextInt();
        for (int i = 0; i < 11; i++) {
            System.out.println("Número "+numero+"x"+i+"="+(numero*i));


        }
    }
}
