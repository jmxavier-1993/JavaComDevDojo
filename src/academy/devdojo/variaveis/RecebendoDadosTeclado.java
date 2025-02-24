package academy.devdojo.variaveis;

import java.util.Scanner;

public class RecebendoDadosTeclado {
    public static void main(String[] args) {
        Scanner ler= new Scanner(System.in);
        String nome="";
        int idade=0;
        System.out.println("Digite seu nome:");
        nome= ler.next();
        System.out.println("Digite sua idade");
        idade= ler.nextInt();
        System.out.println("O nome digitado foi:"+nome);
        System.out.println("A idade digitada foi:"+idade);



    }
}
