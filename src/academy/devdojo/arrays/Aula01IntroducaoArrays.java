package academy.devdojo.arrays;

import java.util.Scanner;
import java.util.ArrayList;

public class Aula01IntroducaoArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> notas = new ArrayList<>();
        int i = 1;
        double somanotas = 0;
        while (i <= 4) {
            System.out.println("Digite sua " + i + " Nota:");
            double valorLendo = scanner.nextDouble();
            notas.add(valorLendo);
            i++;
        }
        somanotas = notas.get(0)+notas.get(1)+notas.get(2)+notas.get(3);
        double tamanhoArray= notas.size();
        double medianotas=somanotas/tamanhoArray;
        System.out.println("Sua média é:"+medianotas);

    }
}
