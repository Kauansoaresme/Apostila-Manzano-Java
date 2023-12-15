package manzano;

import java.util.Scanner;

public class indexN {
    public static void main(String[]args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um valor inteiro: ");
        int A = entrada.nextInt();
        System.out.println("Digite outro valor inteiro: ");
        int B = entrada.nextInt();
        entrada.close();
        int diferenca;
        if (A>B) {
            diferenca = A - B;
        }else{
            diferenca = B - A;
        }
        System.out.println("O resultado da diferença do maior número pelo menor é de: " + diferenca);
    }
}
