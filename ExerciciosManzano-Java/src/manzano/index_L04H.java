package manzano;

import java.util.Scanner;

public class index_L04H {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double areaTotal = 0;

        do {
            System.out.print("Digite o nome do cômodo: ");
            String nomeComodo = entrada.nextLine();

            System.out.print("Digite a largura do cômodo em metros: ");
            double largura = entrada.nextDouble();

            System.out.print("Digite o comprimento do cômodo em metros: ");
            double comprimento = entrada.nextDouble();

            double areaComodo = calcularArea(largura, comprimento);
            areaTotal += areaComodo;

            System.out.println("A área do " + nomeComodo + " é: " + areaComodo + " metros quadrados");

            entrada.nextLine(); // Limpar o buffer do teclado

            System.out.print("Deseja calcular a área de mais um cômodo? (SIM/NAO): ");
        } while (entrada.nextLine().equalsIgnoreCase("SIM"));
        entrada.close();
        System.out.println("A área total da residência é: " + areaTotal + " metros quadrados");
    }

    private static double calcularArea(double largura, double comprimento) {
        return largura * comprimento;
    }
}
