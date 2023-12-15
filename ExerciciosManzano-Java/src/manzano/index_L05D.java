package manzano;

public class index_L05D {
    public static void main(String[] args) {
        int somatorio = 0;

        for (int i = 2; i <= 500; i += 2) {
            somatorio += i;
        }

        System.out.println("O somatório dos valores pares de 1 a 500 é: " + somatorio);
    }
}
