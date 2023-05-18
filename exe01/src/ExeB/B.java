package ExeB;

import java.util.Locale;
import java.util.Scanner;

public class B {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        double pi = 3.14159;
        double area, radius;

        System.out.println("Digite o valor do Raio");
        radius = sc.nextDouble();

        area = pi * Math.pow(radius, 2);

        System.out.println("A área é: " + area);
        System.out.printf("A área é: %.4f%n", area);


    }

}
