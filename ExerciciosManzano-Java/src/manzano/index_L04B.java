package manzano;

public class index_L04B {
    public static void main(String[] args) {
        int numero = 1;
        int somatorioPares = 0;

        do {
            if (numero % 2 == 0) {
                // Verifica se o número é par
                somatorioPares += numero;
            }
            numero++;
        } while (numero <= 500);

        System.out.println("O somatório dos valores pares de 1 a 500 é: " + somatorioPares);
    }
}
