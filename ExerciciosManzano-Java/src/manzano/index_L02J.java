package manzano;

import java.util.Scanner;

public class index_L02J {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um valor entre 1 e 9: ");
        int valor = entrada.nextInt();
        entrada.close();
        if (valor >= 1 && valor <= 9) {
            System.out.println("O valor está na faixa permitida.");
        } else {
            System.out.println("O valor está fora da faixa permitida.");
        }
    }
}
