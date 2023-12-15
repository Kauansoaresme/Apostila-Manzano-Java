package manzano;

import java.util.Scanner;

public class index_L03I {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite 10 valores numéricos:");

        int contador = 1;
        double somatorio = 0;

        while (contador <= 10) {
            System.out.print("Digite o valor #" + contador + ": ");
            double valor = entrada.nextDouble();
            entrada.close();
            somatorio += valor;
            contador++;
        }

        double media = somatorio / 10;

        System.out.println("Total do somatório: " + somatorio);
        System.out.println("Média aritmética: " + media);
    }
}

