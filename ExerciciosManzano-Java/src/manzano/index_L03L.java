package manzano;

import java.util.Scanner;

public class index_L03L {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int maiorValor = Integer.MIN_VALUE;
        int menorValor = Integer.MAX_VALUE;

        while (true) {
            System.out.print("Digite um valor positivo (ou um valor negativo para encerrar): ");
            int valor = entrada.nextInt();
            entrada.close();
            if (valor < 0) {
                break; // Encerra o loop se o valor for negativo
            }

            if (valor > maiorValor) {
                maiorValor = valor;
            }

            if (valor < menorValor) {
                menorValor = valor;
            }
        }

        if (maiorValor == Integer.MIN_VALUE && menorValor == Integer.MAX_VALUE) {
            System.out.println("Nenhum valor positivo foi informado.");
        } else {
            System.out.println("Maior valor informado: " + maiorValor);
            System.out.println("Menor valor informado: " + menorValor);
        }
    }
}
