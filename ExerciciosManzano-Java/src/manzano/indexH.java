package manzano;

import java.util.Scanner;

public class indexH {
    public static void main(String[]args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Comprimento da caixa retangular: ");
        double comprimento = entrada.nextDouble();
        System.out.println("Largura da caixa retangular: ");
        double largura = entrada.nextDouble();
        System.out.println("Altura da caixa retangular: ");
        double altura = entrada.nextDouble();
        entrada.close();
        double volume = comprimento * largura * altura;

        System.out.println("O volume da caixa retangular é de: " + volume);

    }
}
