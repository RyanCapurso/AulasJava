package ExeD;

import java.util.Locale;
import java.util.Scanner;

public class D {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int idFuncionario, horasTrabalhadas;
        double valorHora, salario;

        System.out.println("Digite o número do funcionario");
        idFuncionario = sc.nextInt();

        System.out.println("Digite o número de horas trabalhadas");
        horasTrabalhadas = sc.nextInt();

        System.out.println("Digite o valor da hora trabalhada");
        valorHora = sc.nextDouble();

        salario = horasTrabalhadas * valorHora;

        System.out.printf("Número: %d %nSalário: U$%.2f %n", idFuncionario, salario);

    }

}
