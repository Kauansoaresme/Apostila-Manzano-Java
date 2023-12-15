package manzano;

import java.util.Scanner;

public class index_L02G {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o primeiro número inteiro: ");
        int numero1 = entrada.nextInt();

        System.out.println("Digite o segundo número inteiro: ");
        int numero2 = entrada.nextInt();

        System.out.println("Digite o terceiro número inteiro: ");
        int numero3 = entrada.nextInt();

        System.out.println("Digite o quarto número inteiro: ");
        int numero4 = entrada.nextInt();
        entrada.close();
        System.out.println("Números divisíveis por 2 e 3:");

        if (numero1 % 2 == 0 && numero1 % 3 == 0) {
            System.out.println(numero1);
        }

        if (numero2 % 2 == 0 && numero2 % 3 == 0) {
            System.out.println(numero2);
        }

        if (numero3 % 2 == 0 && numero3 % 3 == 0) {
            System.out.println(numero3);
        }

        if (numero4 % 2 == 0 && numero4 % 3 == 0) {
            System.out.println(numero4);
        }
    }
}

