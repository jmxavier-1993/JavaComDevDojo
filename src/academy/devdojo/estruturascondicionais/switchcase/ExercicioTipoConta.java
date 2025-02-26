package academy.devdojo.estruturascondicionais.switchcase;

import java.util.Scanner;

public class ExercicioTipoConta {
    public static void main(String[] args) {
        Scanner ler= new Scanner(System.in);
        String nomeCliente="";
        String tipoConta="";
        double percentJurosConta=5;
        double percentJurosConta2=2;
        double percentJurosConta3=1;
        //double valorInicialConta=0;
        System.out.println("Informe seu nome:");
        nomeCliente= ler.nextLine();
        System.out.println("Informe o tipo de conta desejada, Opções disponíveis são: Conta_Poupança, Conta_Corrente, e de Conta_Investimento:");
        tipoConta= ler.nextLine();
        //System.out.println("Informe o valor inicial que será depositado nesta conta");
        //valorInicialConta= ler.nextDouble();
        switch (tipoConta){
            case "Conta_Poupança":
                System.out.println(nomeCliente+" "+"O percentual de juros para este modelo de conta será:"+(percentJurosConta/100));
                break;
            case "Conta_Corrente":
                System.out.println(nomeCliente+" "+"O percentual de juros para este modelo de conta será:"+(percentJurosConta2/100));
                break;
            case "Conta_Investimento":
                System.out.println(nomeCliente+" "+"O percentual de juros para este modelo de conta será:"+(percentJurosConta3/100));
                break;
            default:
                System.out.println("Opção de conta inválida");
        }
    }
}
