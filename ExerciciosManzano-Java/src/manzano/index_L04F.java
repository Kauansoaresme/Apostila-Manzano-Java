package manzano;

import java.util.Scanner;

public class index_L04F {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int totalValores = 0;
        double somatorio = 0;
        double valor;

        System.out.println("Digite valores positivos (ou um valor negativo para encerrar):");

        // Leitura inicial
        do {
            System.out.print("Digite um valor: ");
            valor = entrada.nextDouble();
            entrada.close();
            if (valor >= 0) {
                somatorio += valor;
                totalValores++;
            }

        } while (valor >= 0);

        // Verifica se foram digitados valores positivos antes de calcular a média
        if (totalValores > 0) {
            double media = somatorio / totalValores;

            System.out.println("Total do somatório: " + somatorio);
            System.out.println("Média aritmética: " + media);
            System.out.println("Total de valores lidos: " + totalValores);
        } else {
            System.out.println("Nenhum valor positivo foi digitado.");
        }
    }
}
