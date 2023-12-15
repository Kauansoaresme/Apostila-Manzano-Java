package manzano;

import java.util.Scanner;

public class indexM {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o valor de A: ");
        double A = entrada.nextDouble();
        System.out.println("Digite o valor de B: ");
        double B = entrada.nextDouble();
        System.out.println("Digite o valor de C: ");
        double C = entrada.nextDouble();
        entrada.close();
        double soma = A + B + C;
        double quadradoSoma = Math.pow(soma, 2);

        System.out.println("O quadrado da soma de A, B e C é: " + quadradoSoma);
    }
}
