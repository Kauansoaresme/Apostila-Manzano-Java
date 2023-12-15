package manzano;

import java.util.Scanner;

public class indexE {
    public static void main(String[]args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Valor da sua prestação: ");
        double valor = entrada.nextDouble();
        System.out.println("taxa de atraso da sua prestação: ");
        double taxa = entrada.nextDouble();
        System.out.println("Tempo de atraso da sua prestação: ");
        double tempo = entrada.nextDouble();

        double prestacao = valor + ((valor*taxa/100)*tempo);

        System.out.println("O valor da sua prestação em atraso é de: R$"+prestacao);
        entrada.close();
    }
}
