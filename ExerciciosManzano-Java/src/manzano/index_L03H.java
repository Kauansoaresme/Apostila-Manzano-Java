package manzano;

public class index_L03H {
    public static void main(String[] args) {
        System.out.println("Conversão de graus Celsius para Fahrenheit:");

        int celsius = 10;

        while (celsius <= 100) {
            double fahrenheit = (celsius * 9.0 / 5.0) + 32.0;
            System.out.println(celsius + " graus Celsius = " + fahrenheit + " graus Fahrenheit");
            celsius += 10;
        }
    }
}
