/**
 * Clase que representa un numero real
 */
public class Numero{
    /**
     * Tipo de dato que contiene clase numero (tipo double)
     */
    private double numeros;

    /**
     * Constructor de la clase
     * @param numeros
     */
    public Numero(double numeros) {
        this.numeros = numeros;
    }

    /**
     * Obtencion del valor del numero
     * @return
     */
    public double getValor() {
        return numeros;
    }
}