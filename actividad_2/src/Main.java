import exception.*;
public class Main {
    public static void main(String[] args) {
        Pila<String> pila1 = new Pila<>(5);
        
        try {
            pila1.push("Doom");
            pila1.push("Terraria");
            pila1.push("Monster Hunter");

            System.out.println("¿Contiene 'Terraria'?: " + (pila1.contains("Terraria") ? "Sí está en la pila" : "No está en la pila"));
            System.out.println("¿Contiene 'LOL'?: " + (pila1.contains("LOL") ? "Sí está en la pila" : "No está en la pila"));

            System.out.println("Elemento extraído: " + pila1.pop());
            System.out.println("¿Contiene 'Monster Hunter' tras el pop?: " + (pila1.contains("Monster Hunter") ? "Sí" : "No"));
        } catch (ExeptionPilaLlena | ExeptionPilaVacia e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
