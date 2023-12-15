package manzano;


import java.util.Scanner;

public class indexC {
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o raio da lata de óleo: ");
        double raio = entrada.nextDouble();
        System.out.println("Digite a altura da lata de óleo: ");
        double altura = entrada.nextDouble();

        double volume = Math.PI * Math.pow(raio, 2) * altura;

        String volumeFormatado = String.format("%.2f", volume);

        System.out.println("O volume da lata de óleo é de: " + volumeFormatado);
        entrada.close();


    }
}

