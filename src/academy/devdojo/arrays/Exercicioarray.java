package academy.devdojo.arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicioarray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> numeros = new ArrayList<>();
        for (int i = 1; i < 10; i++) {
            System.out.println("Digite um numero :");
            double valorLendo = scanner.nextDouble();
            numeros.add(valorLendo);
            double quadrado= valorLendo*valorLendo;
            System.out.println("O quadrado de " + valorLendo + " é: " + quadrado);
        }

    }
}
