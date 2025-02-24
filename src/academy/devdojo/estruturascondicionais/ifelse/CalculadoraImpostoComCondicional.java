package academy.devdojo.estruturascondicionais.ifelse;

public class CalculadoraImpostoComCondicional {
    public static void main(String[] args) {
        double salario = 4700;
        /*double PercentSalario = 30;
        double PercentSalario2 = 15;
        double ValorPercentSalario = (PercentSalario / 100) * salario;
        double ValorPercentSalario2 = (PercentSalario2 / 100) * salario;
        if (salario >= 4500) {
            System.out.println("Trinta por cento do salario eh:" + ValorPercentSalario);
        } else {
            System.out.println("Quinze por cento do salario eh:" + ValorPercentSalario2);
        }
         */
        double resultado=0;
        String porcentagem="";
        if (salario>4500){
            resultado= salario*0.30;
            porcentagem="30%";
        } else{
            resultado=salario* 0.15;
            porcentagem="15%";
        }
        System.out.println("O valor final eh:" + " " +porcentagem + " "+resultado);
    }
}
