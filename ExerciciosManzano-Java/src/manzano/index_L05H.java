package manzano;

import java.util.Scanner;

public class index_L05H {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a base: ");
        double base = entrada.nextDouble();

        System.out.println("Digite o expoente: ");
        int expoente = entrada.nextInt();
        entrada.close();
        double resultado = calcularPotencia(base, expoente);

        System.out.println("O resultado de " + base + "^" + expoente + " é: " + resultado);
    }

    private static double calcularPotencia(double base, int expoente) {
        double resultado = 1;

        for (int i = 0; i < expoente; i++) {
            resultado *= base;
        }

        return resultado;
    }
}
