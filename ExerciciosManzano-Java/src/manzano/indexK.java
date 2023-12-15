package manzano;
import java.util.Scanner;

public class indexK {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a cotação do dólar: ");
        double cotacaoDolar = entrada.nextDouble();
        System.out.println("Digite a quantidade de reais disponíveis: ");
        double quantidadeReais = entrada.nextDouble();
        entrada.close();
        double valorEmDolares = quantidadeReais / cotacaoDolar;

        System.out.println("O valor em dólares é: $" + valorEmDolares);
    }
}

