package manzano;

import java.util.Scanner;

public class indexJ {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);


        System.out.println("Digite a cotação do dólar: ");
        double cotacaoDolar = entrada.nextDouble();
        System.out.println("Digite a quantidade de dólares disponíveis: ");
        double quantidadeDolares = entrada.nextDouble();
        double valorEmReais = cotacaoDolar * quantidadeDolares;
        entrada.close();
        System.out.println("O valor em moeda brasileira (real) é: R$" + valorEmReais);
    }
}

