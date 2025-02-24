package academy.devdojo.estruturascondicionais.ifelse;

import java.util.Scanner;

public class CadastroDeLogin {
    public static void main(String[] args) {
        Scanner ler= new Scanner(System.in);
        String usuario="";
        System.out.println("Digite o nome de Usuario:");
        usuario= ler.nextLine();
        if (usuario.equalsIgnoreCase(null) || usuario.equalsIgnoreCase("") ||usuario.equalsIgnoreCase("admin")||usuario.equalsIgnoreCase("administrador")){
            System.out.println("Usuário Inválido");
    } else {
            System.out.println(usuario+" "+"Cadastrado com Sucesso!");
        }
}}
