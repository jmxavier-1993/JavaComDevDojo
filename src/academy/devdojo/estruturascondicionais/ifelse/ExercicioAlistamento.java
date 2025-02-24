package academy.devdojo.estruturascondicionais.ifelse;

import java.util.Scanner;

public class ExercicioAlistamento {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String sexo = "";
        System.out.println("Digite seu sexo M ou F:");
        sexo = ler.nextLine();
        int idade = 0;
        System.out.println("Digite sua idade:");
        idade = ler.nextInt();
        if (sexo.equalsIgnoreCase("M") && idade >= 18) {
            System.out.println("Alistamento Obrigatório");
        } else if (sexo.equalsIgnoreCase("M") && idade < 18) {
            System.out.println("Alistamento Não permitido");
        } else if (sexo.equalsIgnoreCase("f") && idade >= 18) {
            System.out.println("Alistamento Não Obrigatório, deseja realizar alistamento?");
        } else if (sexo.equalsIgnoreCase("f") && idade < 18) {
            System.out.println("Alistamento Não permitido");
        }
    }
}
