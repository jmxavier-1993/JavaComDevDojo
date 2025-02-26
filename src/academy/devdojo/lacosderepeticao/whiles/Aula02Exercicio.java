package academy.devdojo.lacosderepeticao.whiles;

import java.util.Scanner;

public class Aula02Exercicio {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um número");
        int numero = ler.nextInt();
        int i=0;
        while (i <= numero) {
            if (i % 2 != 0){
            System.out.println("Número:" + i);

        } i=i+1;
    }
}}
