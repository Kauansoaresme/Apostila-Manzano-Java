package manzano;

public class index_L03F {
    public static void main(String[] args) {
        int base = 2; // Substitua pelo valor da sua base
        int expoente = 5; // Substitua pelo valor do seu expoente
        int resultado = 1;

        System.out.println("Resultado da potência:");

        int contador = 0;
        while (contador < expoente) {
            resultado *= base;
            contador++;
        }

        System.out.println(base + " elevado a " + expoente + " é igual a " + resultado);
    }
}
