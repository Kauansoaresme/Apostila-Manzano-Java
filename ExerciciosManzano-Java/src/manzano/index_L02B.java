package manzano;

import java.util.Scanner;

public class index_L02B {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um valor inteiro: ");
        int valor = entrada.nextInt();

        if (valor<0) {
            int positivo = valor * -1;
            System.out.println("O número fornecido positivo é: " + positivo);
        }else{
            System.out.println("O número fornecido é positivo!");
        }
        entrada.close();
    }
}
