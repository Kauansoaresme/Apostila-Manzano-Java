package manzano;

import java.util.Scanner;

public class index01 {
    public static void main(String[]args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um valor inteiro A: ");
        int A = entrada.nextInt();
        System.out.println("Digite um valor inteiro B: ");
        int B = entrada.nextInt();
        System.out.println("Digite um valor inteiro C: ");
        int C = entrada.nextInt();
        System.out.println("Digite um valor inteiro D: ");
        int D = entrada.nextInt();
        entrada.close();
        int P = A * C;
        int S = B + D;

        System.out.println("Resultado do produto de A e C: " +P);
        System.out.println("Resultado da soma de B e D: " +S);
    }
}
