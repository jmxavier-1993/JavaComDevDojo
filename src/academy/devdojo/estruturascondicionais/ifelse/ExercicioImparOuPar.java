package academy.devdojo.estruturascondicionais.ifelse;

import java.util.Scanner;
public class ExercicioImparOuPar {
    public static void main(String[] args) {
        int numero=0;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um número");
        numero= ler.nextInt();

        if (numero%2==0){
            System.out.println("é par");
        } else {
            System.out.println("é impar");
        }
    }
}
