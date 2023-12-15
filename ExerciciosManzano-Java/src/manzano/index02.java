package manzano;

import java.util.Scanner;

public class index02 {
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o salário mensal (SM): ");
        double salarioMensal = entrada.nextDouble();
        System.out.println("Digite o percentual de reajuste (PR): ");
        double percentualReajuste = entrada.nextDouble();
        entrada.close();

        double valorReajuste = salarioMensal * (percentualReajuste / 100);


        double novoSalario = salarioMensal + valorReajuste;

        System.out.println("O valor do novo salário (NS) é: " + novoSalario);
    }
    }

