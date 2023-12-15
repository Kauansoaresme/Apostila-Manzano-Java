package manzano;

import java.util.Scanner;

public class index_L03K {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double areaTotal = 0;
        String resposta;

        while (true) {
            System.out.print("Digite o nome do cômodo: ");
            String nomeComodo = entrada.nextLine();

            System.out.print("Digite a largura do cômodo em metros: ");
            double largura = entrada.nextDouble();

            System.out.print("Digite o comprimento do cômodo em metros: ");
            double comprimento = entrada.nextDouble();

            double areaComodo = largura * comprimento;
            areaTotal += areaComodo;

            System.out.println("Área do cômodo " + nomeComodo + ": " + areaComodo + " metros quadrados");

            entrada.nextLine(); // Limpar o buffer do entrada

            System.out.print("Deseja calcular outro cômodo? (SIM/NAO): ");
            resposta = entrada.nextLine();
            entrada.close();
            if (resposta.equalsIgnoreCase("NAO")) {
                break;
            }
        }

        System.out.println("Área total da residência: " + areaTotal + " metros quadrados");
    }
}
