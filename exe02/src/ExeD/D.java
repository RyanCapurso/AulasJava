package ExeD;

import java.util.Scanner;

public class D {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a hora inicial do jogo");

        int horaInicial = sc.nextInt();

        System.out.println("Digite a hora final do jogo");

        int horaFinal = sc.nextInt();

        int duracao;
        if (horaInicial < horaFinal) {
            duracao = horaFinal - horaInicial;
        }
        else {
            duracao = 24 - horaInicial + horaFinal;
        }

        System.out.println("O JOGO DUROU " + duracao + " HORA(S)");

        sc.close();

    }

}
