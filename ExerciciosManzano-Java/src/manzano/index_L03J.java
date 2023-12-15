package manzano;

public class index_L03J {
    public static void main(String[] args) {
        int inicio = 50;
        int fim = 70;

        int soma = 0;
        int quantidadePares = 0;

        for (int numero = inicio; numero <= fim; numero++) {
            if (numero % 2 == 0) {
                soma += numero;
                quantidadePares++;
            }
        }

        double media = (double) soma / quantidadePares;

        System.out.println("Soma dos valores pares: " + soma);
        System.out.println("Média aritmética dos valores pares: " + media);
    }
}
