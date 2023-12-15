package manzano;

public class index_L04C {
    public static void main(String[] args) {
        int numero = 1;

        do {
            if (numero % 4 == 0) {
                // Verifica se o número é divisível por 4
                System.out.println(numero);
            }
            numero++;
        } while (numero < 200);
    }
}

