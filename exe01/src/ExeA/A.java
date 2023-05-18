package ExeA;

import java.util.Scanner;

public class A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int valor1, valor2, result;

        System.out.println("Digite o primeiro valor");
        valor1 = sc.nextInt();

        System.out.println("Digite o segundo valor");
        valor2 = sc.nextInt();

        result = valor1 + valor2;

        System.out.println("A soma é: " + result);

    }

}
