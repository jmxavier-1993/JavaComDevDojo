package academy.devdojo.estruturascondicionais.ifelse;

public class CalculaImpostoDeRenda {
    public static void main(String[] args) {
        double salario = 4900;
        double percentSeteEmeio = 7.5;
        double percentQuinze = 15;
        double percentVinteEdoisEmeio = 22.5;
        double percentVinteEseteEmeio = 27.5;

        if (salario <= 2112) {
            System.out.println("Você ficará isento de imposto");
        } else if (salario >= 2112 && salario <= 2826) {
            System.out.println("Você deverá pagar 7,5% que eh:" + salario * (percentSeteEmeio / 100));
        } else if (salario >= 2827 && salario <= 3751) {
            System.out.println("Você deverá pagar 15% que eh:" + salario * (percentQuinze / 100));
        } else if (salario >= 3752 && salario <= 4664) {
            System.out.println("Você deverá pagar 22,5%que eh:" + salario * (percentVinteEdoisEmeio / 100));
        } else {
            System.out.println("Você deverá pagar 27,5% que eh:" + salario * (percentVinteEseteEmeio / 100));
        }
    }
}
