package academy.devdojo.lacosderepeticao.whiles;

import java.util.Scanner;

public class Exercicio2CalculaImpostoWhiles {
    public static void main(String[] args) {
        int opcao = 0;
        Scanner ler = new Scanner(System.in);
        while (opcao !=3) {
            System.out.println("1. Calcular Imposto\n 2. Depositar Salário\n 3. Sair");
            System.out.println("Digite a opcao desejada: ");
            opcao = ler.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Calcular imposto");
                    break;
                case 2:
                    System.out.println("Depositar salário");
                    break;
                case 3:
                    System.out.println("Sair");
                    break;
                default:
                    System.out.println("Digite uma opção válida");
            }
            }
        }
    }
