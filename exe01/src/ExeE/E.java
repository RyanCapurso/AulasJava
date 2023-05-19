package ExeE;

import java.util.Locale;
import java.util.Scanner;

public class E {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        int idPeca1, idPeca2, nPeca1, nPeca2;
        double total, valorPeca1, valorPeca2;

        System.out.println("Digite o primeiro Código da peça, número de peças e valor unitário respecitvamente");

        idPeca1 = sc.nextInt();
        nPeca1 = sc.nextInt();
        valorPeca1 = sc.nextDouble();

        System.out.println("Digite o segundo Código da peça, número de peças e valor unitário respecitvamente");

        idPeca2 = sc.nextInt();
        nPeca2 = sc.nextInt();
        valorPeca2 = sc.nextDouble();

        total = nPeca1 * valorPeca1 + nPeca2 * valorPeca2;

        System.out.printf("Valor a pagar é: %.2f", total );


    }

}
