package ExeA;

import java.util.Scanner;

public class A {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N;

        System.out.println("Digite um número");

        N = sc.nextInt();

        if (N < 0) {
            System.out.println("NEGATIVO");
        }
        else {
            System.out.println("NAO NEGATIVO");
        }

        sc.close();
    }

}
