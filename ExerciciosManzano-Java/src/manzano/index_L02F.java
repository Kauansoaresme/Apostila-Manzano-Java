package manzano;

import java.util.Scanner;

public class index_L02F {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o valor de A: ");
        double A = entrada.nextDouble();

        System.out.println("Digite o valor de B: ");
        double B = entrada.nextDouble();

        System.out.println("Digite o valor de C: ");
        double C = entrada.nextDouble();
        entrada.close();
        if (A > B) {
            double temp = A;
            A = B;
            B = temp;
        }

        if (A > C) {
            double temp = A;
            A = C;
            C = temp;
        }

        if (B > C) {
            double temp = B;
            B = C;
            C = temp;
        }

        System.out.println("Valores em ordem crescente: " + A + ", " + B + ", " + C);
    }
}

