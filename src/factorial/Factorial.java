package factorial;

public class Factorial {

    public static void main(String[] args) {

        int valor;
        int factor;

        valor = 8;

        int i;
        if (valor == 0) {
            factor = 1;
        } else {
            factor = 1;
            for (i = valor; i >= 1; i--) {
                factor = factor * i;
            }
        }

        System.out.println(factor);

    }

}
