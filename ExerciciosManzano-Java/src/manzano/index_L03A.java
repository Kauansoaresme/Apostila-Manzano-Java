package manzano;

import java.util.Scanner;

public class index_L03A {
    public static void main(String[]args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número para ver sua tabuada: ");
        int valor = entrada.nextInt();
        entrada.close();
       int i = 1;

       while (i < 11) {
           int tabuada = valor * i;
           System.out.println(valor + "x" +i+ "=" +tabuada);
           i++;
       }
    }
}
