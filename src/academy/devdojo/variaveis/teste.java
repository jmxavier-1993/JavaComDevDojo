package academy.devdojo.variaveis;

import java.util.Scanner;

public class teste {
    public static void main(String[] args) {
        String nome="";
        int idade=0;
        System.out.println(nome);
        Scanner ler=new Scanner(System.in) ;
        System.out.println("Digite seu nome:");
        nome= ler.nextLine();
        System.out.println("digite sua idade:");
        idade= ler.nextInt();
        System.out.println("seu nome é "+nome +" e sua idade é:"+ idade);
    }
}
