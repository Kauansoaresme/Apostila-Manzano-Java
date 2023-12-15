package manzano;

import java.util.Scanner;

public class indexD {
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Tempo gasto durante a viagem: ");
        double tempo = entrada.nextDouble();
        System.out.println("Velocidade durante a viagem: ");
        double velocidade = entrada.nextDouble();

        double distancia = tempo * velocidade;

        double litrosUsados = distancia / 12.0;

        String litrosFormatado = String.format("%.2f", litrosUsados);

        System.out.println("Velocidade média percorrida: " + velocidade);
        System.out.println("Tempo gasto na viagem: " + tempo);
        System.out.println("Distancia percorrida: " + distancia);
        System.out.println("Quantidade de litros utilizados na viagem: " +litrosFormatado);
        entrada.close();
    }
}
