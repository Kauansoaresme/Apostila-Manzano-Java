package manzano;

public class index_L05I {
    public static void main(String[] args) {
        int n = 15; // número de termos desejados

        int primeiroTermo = 1;
        int segundoTermo = 1;

        System.out.println("Série de Fibonacci até o décimo quinto termo:");

        System.out.print(primeiroTermo + " ");
        System.out.print(segundoTermo + " ");

        for (int i = 2; i < n; i++) {
            int proximoTermo = primeiroTermo + segundoTermo;
            System.out.print(proximoTermo + " ");

            primeiroTermo = segundoTermo;
            segundoTermo = proximoTermo;
        }
    }
}
