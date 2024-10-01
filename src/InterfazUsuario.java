import java.util.Scanner;
/**
 * Clase que contiene la interfaz del usuario
 */
public class InterfazUsuario {
    private static Scanner scanner = new Scanner(System.in);
    private static Calculadora calculadora = new Calculadora();

    /**
     * Llamado al menu de opciones
     */
    public static void iniciar() {
        while (true) {
            mostrarMenu();
            int opcion = leerEntero("Seleccione una opción: ");
            if (opcion == 7) {
                System.out.println("Gracias por usar la calculadora.");
                break;
            }

            procesarOpcion(opcion);
        }
    }

    /**
     * Muestra el menu de opciones
     */
    private static void mostrarMenu() {
        System.out.println("\n--- Bienvenidos, ingrese la operacion a realizar: ---");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        System.out.println("5. Potencia");
        System.out.println("6. Raíz Cuadrada");
        System.out.println("7. Salir");
    }

    /**
     * Llamado al metodo que ejecuta la operacion deseada
     * @param opcion
     */
    private static void procesarOpcion(int opcion) {
        try {
            Numero a, b;
            switch (opcion) {
                case 1: // Suma
                case 2: // Resta
                case 3: // Multiplicación
                case 4: // División
                case 5: // Potencia
                    a = leerNumero("Ingrese el primer número: ");
                    b = leerNumero("Ingrese el segundo número: ");
                    ejecutarOperacionBinaria(opcion, a, b);
                    break;
                case 6: // Raíz Cuadrada
                    a = leerNumero("Ingrese el número: ");
                    ejecutarOperacionUnaria(opcion, a);
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    /**
     * Ejecuta la operacion deseada Binaria
     * @param opcion
     * @param a
     * @param b
     * @throws Exception
     */
    private static void ejecutarOperacionBinaria(int opcion, Numero a, Numero b) throws Exception {
        String operacion = switch (opcion) {
            case 1 -> "suma";
            case 2 -> "resta";
            case 3 -> "multiplicacion";
            case 4 -> "division";
            case 5 -> "potencia";
            default -> throw new Exception("Operación no válida.");
        };

        double resultado = calculadora.realizarOperacion(operacion, a, b);
        System.out.println("Resultado: " + resultado);
    }

    /**
     * Ejecuta la operacion unaria
     * @param opcion
     * @param a
     * @throws Exception
     */
    private static void ejecutarOperacionUnaria(int opcion, Numero a) throws Exception {
        if (opcion == 6) {
            double resultado = calculadora.realizarOperacionUnaria("raiz", a);
            System.out.println("Resultado: " + resultado);
        } else {
            throw new Exception("Operación no válida.");
        }
    }

    /**
     * Metodo para leer números y lanzar una excepción si no es válido
     * @param mensaje
     * @return
     * @throws Exception
     */
    private static Numero leerNumero(String mensaje) throws Exception {
        System.out.print(mensaje);
        double valor;
        if (!scanner.hasNextDouble()) {
            scanner.next();  // Descartar la entrada incorrecta
            throw new Exception("Operación no válida. Solo se permiten números.");
        }
        else{
            valor=  scanner.nextDouble();
            return new Numero(valor);
        }

    }

    /**
     * Metodo para leer números enteros
     * @param mensaje
     * @return
     */
    private static int leerEntero(String mensaje) {
        System.out.print(mensaje);
        return scanner.nextInt();
    }


}
