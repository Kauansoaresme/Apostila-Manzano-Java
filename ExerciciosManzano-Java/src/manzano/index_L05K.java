package manzano;

public class index_L05K {
    public static void main(String[] args) {
        System.out.println("Fatorial dos valores ímpares de 1 a 10:");

        for (int i = 1; i <= 10; i += 2) {
            long fatorial = calcularFatorial(i);
            System.out.println("Fatorial de " + i + ": " + fatorial);
        }
    }

    private static long calcularFatorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            long resultado = 1;
            for (int i = 2; i <= n; i++) {
                resultado *= i;
            }
            return resultado;
        }
    }
}
