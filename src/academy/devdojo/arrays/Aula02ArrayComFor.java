package academy.devdojo.arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Aula02ArrayComFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> notas = new ArrayList<>();
        double somanotas = 0;
        for (int i = 1; i < 5; i++) {
            System.out.println("Digite sua " + i + " Nota:");
            double valorLendo = scanner.nextDouble();
            notas.add(valorLendo);
        }
        somanotas = notas.get(0) + notas.get(1) + notas.get(2) + notas.get(3);
        double tamanhoArray = notas.size();
        double medianotas = somanotas / tamanhoArray;
        System.out.println("Sua média é:" + medianotas);
        if (medianotas >= 7) {
            System.out.println("Você foi Aprovado!");
        }
        if (medianotas <= 5) {
            System.out.println("Você foi Reprovado!");
        } else {
            System.out.println("você está em recuperação!");
        }
    }
}

