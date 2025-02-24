package academy.devdojo.estruturascondicionais.ifelse;

import java.util.Scanner;
public class ExercicioNatacao {
    public static void main(String[] args) {
        int idade=0;
        String nome="";
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite seu nome");
        nome= ler.nextLine();
        System.out.println("Digite sua idade");
        idade= ler.nextInt();
        if (idade<10){
            System.out.println(nome+ " "+"Participará da categoria infatil");
        } else if (idade>=11&& idade<=15) {
            System.out.println(nome+" "+"Participará da categoria juvenil");
        } else if (idade>=16&& idade<=19) {
            System.out.println(nome+" "+"Participará da categoria pré Adulto");
        } else {
            System.out.println(nome+" "+"Participará da categoria Adulto");
        }
    }
}
