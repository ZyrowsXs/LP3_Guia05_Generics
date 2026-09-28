import excepciones.InvalidSubscriptException;

public class Main {
    public static void main(String[] args) {
        Integer[] arrInt = {1, 5, 23, 5, 1, 6, 1, 2, 15};
        Character[] arrChar = {'H', 'O', 'L', 'A'};
        Double[] arrDouble = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7};

        System.out.println("--- IMPRESIÓN COMPLETA ---");
        ArregloGenerico.imprimirArreglo(arrInt);
        ArregloGenerico.imprimirArreglo(arrChar);
        ArregloGenerico.imprimirArreglo(arrDouble);

        System.out.println("\n--- IMPRESIÓN POR SUBÍNDICES ---");
        int cantInt = ArregloGenerico.imprimirArreglo(arrInt, 2, 5);
        System.out.println("Elementos impresos (arrInt): " + cantInt);

        int cantChar = ArregloGenerico.imprimirArreglo(arrChar, 1, 3);
        System.out.println("Elementos impresos (arrChar): " + cantChar);

        int cantDouble = ArregloGenerico.imprimirArreglo(arrDouble, 0, 4);
        System.out.println("Elementos impresos (arrDouble): " + cantDouble);

        System.out.println("\n--- PRUEBA DE CAPTURA DE EXCEPCIÓN ---");
        try {
            ArregloGenerico.imprimirArreglo(arrChar, 1, 5);
        } catch (InvalidSubscriptException e) {
            System.out.println("Excepción capturada con éxito: " + e.getMessage());
        }
        try {
            ArregloGenerico.imprimirArreglo(arrInt, 4, 2);
        } catch (InvalidSubscriptException e) {
            System.out.println("Excepción capturada con éxito: " + e.getMessage());
        }
    }
}