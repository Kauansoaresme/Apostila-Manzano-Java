package manzano;

import java.util.Scanner;

public class indexL {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o valor de A: ");
        double A = entrada.nextDouble();
        System.out.println("Digite o valor de B: ");
        double B = entrada.nextDouble();
        System.out.println("Digite o valor de C: ");
        double C = entrada.nextDouble();
        entrada.close();
        double somaQuadrados = Math.pow(A, 2) + Math.pow(B, 2) + Math.pow(C, 2);

        System.out.println("A soma dos quadrados de A, B e C é: " + somaQuadrados);
    }
}
