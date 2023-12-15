package manzano;

import java.util.Scanner;

public class indexA {
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o valor em Celsius para converter em Fahrenheit: ");
        double celsius = entrada.nextDouble();
        entrada.close();
        double fahrenheit = (9*celsius+160)/5;

        System.out.println("O valor de Celsius convertido em Fahrenheit é de: " + fahrenheit);

    }
}
