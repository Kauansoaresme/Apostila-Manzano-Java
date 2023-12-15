package manzano;

import java.util.Scanner;

public class indexI {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o valor A (inteiro): ");
        int A = entrada.nextInt();
        System.out.println("Digite o valor B (inteiro): ");
        int B = entrada.nextInt();
        entrada.close();
        int resultado = (A - B) * (A - B);

        System.out.println("O quadrado da diferença entre A e B é: " + resultado);
    }
}
