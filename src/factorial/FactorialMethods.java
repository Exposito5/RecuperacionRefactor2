package factorial;

/**
 *
 * @author Portatil
 */
public class FactorialMethods {

    int valor;
    int factor;

    public void fact() {

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
    }

    public void show() {
        System.out.println(factor);
    }
}
