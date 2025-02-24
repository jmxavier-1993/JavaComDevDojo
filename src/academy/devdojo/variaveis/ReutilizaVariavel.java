package academy.devdojo.variaveis;

public class ReutilizaVariavel {
    public static void main(String[] args) {
        double salario=2500;
        double percentSalario= 30;
        double valorPercentSalario=(percentSalario/100) * salario;
        System.out.println("30% eh:" +valorPercentSalario);

        percentSalario=15;
        valorPercentSalario=(percentSalario/100) * salario;
        System.out.println("15% eh:" +valorPercentSalario);

        percentSalario=5;
        valorPercentSalario=(percentSalario/100) * salario;
        System.out.println("5% eh:" +valorPercentSalario);
    }
}
