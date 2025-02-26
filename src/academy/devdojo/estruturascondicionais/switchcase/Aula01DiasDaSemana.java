package academy.devdojo.estruturascondicionais.switchcase;

import java.util.Scanner;

public class Aula01DiasDaSemana {
    public static void main(String[] args) {
        int diaSemana = 0;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um número entre 1 a 7:");
        diaSemana = ler.nextInt();
        switch (diaSemana) {
            case 1:
                System.out.println("É Segunda-feira");
                break;
            case 2:
                System.out.println("É Terça-feira");
                break;
            case 3:
                System.out.println("É Quarta-feira");
                break;
            case 4:
                System.out.println("É Quinta-feira");
                break;
            case 5:
                System.out.println("É Sexta-feira");
                break;
            case 6:
                System.out.println("É Sábado!");
                break;
            case 7:
                System.out.println("É Domigo!");
                break;
            default:
                System.out.println("Insira o número novamente, opção inválida!");
                break;
        }
    }
}
