package manzano;

public class index_L04E {
    public static void main(String[] args) {
        int totalValores = 15;
        long somatorioFatoriais = 0;

        for (int i = 1; i <= totalValores; i++) {
            somatorioFatoriais += calcularFatorial(i);
        }

        System.out.println("O somatório das fatoriais é: " + somatorioFatoriais);
    }

    // Função para calcular a fatorial de um número
    private static long calcularFatorial(int numero) {
        long fatorial = 1;

        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }

        return fatorial;
    }
}
