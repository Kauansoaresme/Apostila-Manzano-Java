package manzano;

public class index_L04A {
    public static void main(String[] args) {
        int numero = 15;

        do {
            int quadrado = numero * numero;
            System.out.println("O quadrado de " + numero + " é: " + quadrado);
            numero++;
        } while (numero <= 200);
    }
}
