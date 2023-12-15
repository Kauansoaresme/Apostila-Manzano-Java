package manzano;

import java.util.Scanner;

public class index_L02K {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um valor inteiro: ");
        int valor = entrada.nextInt();
        entrada.close();
        if (valor <= 3) {
            System.out.println("O valor é: " + valor);
        }
    }
}

