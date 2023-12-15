package manzano;

import java.util.Scanner;

public class indexF {
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um valor para a variável A: ");
        double A = entrada.nextDouble();

        System.out.println("Digite um valor para a variável B: ");
        double B = entrada.nextDouble();
        entrada.close();
        double temp = A;
        A = B;
        B = temp;

        System.out.println("Valor de A após a troca: " + A);
        System.out.println("Valor de B após a troca: " + B);


    }
}
