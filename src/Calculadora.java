/***
 * Esta clase calculadora se encuentran el llamada a cada metodo que realizara la operacion deseada
 */
public class Calculadora {
    /**
     * Meotodo realizarOperacion
     * @param operacion
     * @param a
     * @param b
     * @return
     * @throws Exception
     */
    public double realizarOperacion(String operacion, Numero a, Numero b) throws Exception {
        switch (operacion.toLowerCase()) {
            case "suma":
                return Operaciones.suma(a, b);
            case "resta":
                return Operaciones.resta(a, b);
            case "multiplicacion":
                return Operaciones.multiplicacion(a, b);
            case "division":
                return Operaciones.division(a, b);
            case "potencia":
                return Operaciones.potencia(a, b);
            default:
                throw new Exception("Operación no reconocida.");
        }
    }

    /**
     * Metodo realizarOperacionUnaria para obtener la raiz cuadrada de un numero en especifico
     * @param operacion
     * @param a
     * @return
     * @throws Exception
     */
    public double realizarOperacionUnaria(String operacion, Numero a) throws Exception {
        switch (operacion.toLowerCase()) {
            case "raiz":
                return Operaciones.raizCuadrada(a);
            default:
                throw new Exception("Operación no reconocida.");
        }
    }
}
