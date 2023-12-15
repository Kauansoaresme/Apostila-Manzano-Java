package manzano;

import java.util.Scanner;

public class indexG {
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o valor A (inteiro): ");
        int A = entrada.nextInt();
        System.out.println("Digite o valor B (inteiro): ");
        int B = entrada.nextInt();
        System.out.println("Digite o valor C (inteiro): ");
        int C = entrada.nextInt();
        System.out.println("Digite o valor D (inteiro): ");
        int D = entrada.nextInt();
        entrada.close();
        System.out.println("A+B= " + (A+B));
        System.out.println("A+C= " + (A+C));
        System.out.println("A+D= " + (A+D));
        System.out.println("B+C= " + (B+C));
        System.out.println("B+D= " + (B+D));
        System.out.println("C+D= " + (C+D));
        System.out.println("AxB= " + (A*B));
        System.out.println("AxC= " + (A*C));
        System.out.println("AxD= " + (A*D));
        System.out.println("BxC= " + (B*C));
        System.out.println("BxD= " + (B*D));
        System.out.println("CxD= " + (C*D));


    }
}
