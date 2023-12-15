package manzano;

public class index_L03G {
    public static void main(String[] args) {
        int termoAtual = 1;
        int termoAnterior = 0;
        int contador = 1;

        System.out.println("Série de Fibonacci até o décimo quinto termo:");

        while (contador <= 15) {
            System.out.print(termoAtual + " ");

            int proximoTermo = termoAtual + termoAnterior;
            termoAnterior = termoAtual;
            termoAtual = proximoTermo;

            contador++;
        }
    }
}
