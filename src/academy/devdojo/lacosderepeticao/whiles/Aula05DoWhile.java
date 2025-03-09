package academy.devdojo.lacosderepeticao.whiles;

import java.util.Scanner;

public class Aula05DoWhile {
    public static void main(String[] args) {
        double passwordUser1 = 0;
        double passwordUser2 = 0;
        int desejaContinuar = 0;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("User 1, Digite um número de 0 a 10:");
            passwordUser1 = scanner.nextInt();
            System.out.println("User 2, Digite um número de 0 a 10:");
            passwordUser2 = scanner.nextInt();
            if (passwordUser2==passwordUser1){
                System.out.println("Você acertou!!");
            } else {
                System.out.println("Você Errou, tente novamente!!");
            }
            System.out.println("Deseja continuar jogando?\n"+"1.Sim\n"+ "2.Não");
            desejaContinuar= scanner.nextInt();

        } while (desejaContinuar!=2);
    }
}
