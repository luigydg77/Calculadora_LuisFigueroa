/**
 * Clase que contiene las operaciones, suma, resta, multiplicacion, division, potencia y raiz cuadrada
 */
public class Operaciones {

    /**
     * Metodo que realiza la suma
     * @param a
     * @param b
     * @return
     */
    public static double suma(Numero a, Numero b) {
        return a.getValor() + b.getValor();
    }
    /**
     * Metodo que realiza la resta
     * @param a
     * @param b
     * @return
     */
    public static double resta(Numero a, Numero b) {
        return a.getValor() - b.getValor();
    }
    /**
     * Metodo que realiza la multiplicacion
     * @param a
     * @param b
     * @return
     */
    public static double multiplicacion(Numero a, Numero b) {
        return a.getValor() * b.getValor();
    }
    /**
     * Metodo que realiza la division y retorna error si se divide entre cero
     * @param a
     * @param b
     * @return
     */
    public static double division(Numero a, Numero b) throws ArithmeticException {
        if (b.getValor() == 0) {
            throw new ArithmeticException("No se puede dividir por cero.");
        }
        return a.getValor() / b.getValor();
    }
    /**
     * Metodo que realiza la potencia
     * @param base
     * @param exponente
     * @return
     */
    public static double potencia(Numero base, Numero exponente) {
        return Math.pow(base.getValor(), exponente.getValor());
    }
    /**
     * Metodo que realiza la Raiz cuadrada
     * @param a
     * @return
     */
    public static double raizCuadrada(Numero a) throws ArithmeticException {
        if (a.getValor() < 0) {
            throw new ArithmeticException("No se puede calcular la raíz cuadrada de un número negativo.");
        }
        return Math.sqrt(a.getValor());
    }


}
