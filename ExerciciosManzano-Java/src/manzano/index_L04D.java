package manzano;

public class index_L04D {
    public static void main(String[] args) {
        int numeroQuadro = 1;
        long totalGraos = 0; // Usamos long para lidar com números grandes

        do {
            totalGraos += Math.pow(2, numeroQuadro - 1);
            numeroQuadro++;
        } while (numeroQuadro <= 64);

        System.out.println("O somatório de grãos de trigo no tabuleiro é: " + totalGraos);
    }
}
