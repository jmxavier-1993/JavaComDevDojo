package academy.devdojo.estruturascondicionais.ifelse;

import java.util.Scanner;

public class DiasDaSemana {
    public static void main(String[] args) {
        int diaSemana = 0;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um número entre 1 a 7:");
        diaSemana = ler.nextInt();
        if (diaSemana == 1) {
            System.out.println("É Segunda-feira");
        } else if (diaSemana == 2) {
            System.out.println("É Terça-feira");
        } else if (diaSemana == 3) {
            System.out.println("É Quarta-feira");
        } else if (diaSemana == 4) {
            System.out.println("É Quinta-feira");
        } else if (diaSemana == 5) {
            System.out.println("É Sexta-feira");
        } else if (diaSemana == 6) {
            System.out.println("É Sábado!");
        } else if (diaSemana == 7) {
            System.out.println("É Domigo!");
        } else {
            System.out.println("Insira o número novamente, opção inválida!");
        }
    }
}
