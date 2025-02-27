package academy.devdojo.lacosderepeticao.whiles;

import java.util.Scanner;

public class Aula04Login {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String login = "teste";
        int senha = 123456;
        boolean exibirTelaLogin = true;

        System.out.println("Vamos criar seu acesso\nDigite um nome para seu login:");
        login = ler.nextLine();
        final String loginFinal = login;
        System.out.println("Digite uma senha contendo apenas 6 numeros:");
        senha = ler.nextInt();
        final int senhaFinal = senha;
        ler.nextLine();  // Consome a quebra de linha após a entrada do número
        while (exibirTelaLogin) {
            System.out.println("Digite seu Login\n");
            String loginDigitado = ler.nextLine();
            System.out.println("Digite sua senha");
            int senhaDigitada = ler.nextInt();
            ler.nextLine();  // Consome a quebra de linha após a entrada do número
            if (loginFinal.equalsIgnoreCase(loginDigitado) && senhaFinal == senhaDigitada) {
                System.out.println("Usuário autenticado, bem vindo!!");
                exibirTelaLogin = false;
            } else {
                System.out.println("Acesso negado!");
            }
        }
    }
}

