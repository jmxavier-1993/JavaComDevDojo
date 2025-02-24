package academy.devdojo.variaveis;

public class CalculadoraImposto {
    public static void main(String[] args) {
        float salario= (float) 2500f;
        double percentSalario= 5;
        double valorPercentSalario=(percentSalario/100) * salario;
        System.out.println(valorPercentSalario);
    }
}
