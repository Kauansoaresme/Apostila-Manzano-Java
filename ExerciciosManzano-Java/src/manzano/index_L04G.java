package manzano;

public class index_L04G {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i += 2) {
            long fatorial = calcularFatorial(i);
            System.out.println("Fatorial de " + i + ": " + fatorial);
        }
    }

    private static long calcularFatorial(int numero) {
        long fatorial = 1;

        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }

        return fatorial;
    }
}
