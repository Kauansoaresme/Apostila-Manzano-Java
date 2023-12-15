package manzano;

import java.util.Scanner;

public class index_L04J {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o dividendo: ");
        int dividendo = entrada.nextInt();

        System.out.print("Digite o divisor: ");
        int divisor = entrada.nextInt();
        entrada.close();
        if (divisor != 0) {
            int quociente = calcularQuociente(dividendo, divisor);

            System.out.println("Quociente da divisão: " + quociente);
        } else {
            System.out.println("Erro: Divisão por zero.");
        }
    }

    private static int calcularQuociente(int dividendo, int divisor) {
        int quociente = 0;

        while (dividendo >= divisor) {
            dividendo -= divisor;
            quociente++;
        }

        return quociente;
    }
}