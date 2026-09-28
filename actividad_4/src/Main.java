import exception.ExeptionPilaLlena;
import exception.ExeptionPilaVacia;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== PRUEBA DE COMPARACIÓN DE PILAS (esIgual) ===");

        Pila<String> pila1 = new Pila<>(5);
        Pila<String> pila2 = new Pila<>(5);

        pila1.push("Doom");
        pila1.push("Terraria");
        pila1.push("Monster Hunter");

        pila2.push("Doom");
        pila2.push("Terraria");
        pila2.push("Monster Hunter");

        System.out.println("¿pila1 es igual a pila2?: " + pila1.esIgual(pila2)); 

        Pila<String> pila3 = new Pila<>(5);
        pila3.push("Doom");
        pila3.push("Minecraft");
        pila3.push("Monster Hunter");

        System.out.println("¿pila1 es igual a pila3?: " + pila1.esIgual(pila3)); 
        Pila<String> pila4 = new Pila<>(5);
        pila4.push("Doom");
        pila4.push("Terraria");

        System.out.println("¿pila1 es igual a pila4 (diferente cantidad)?: " + pila1.esIgual(pila4)); 

        System.out.println("\n--- Comprobación de no destructividad ---");
        System.out.println("Tope de pila1 tras esIgual(): " + pila1.pop()); 
        System.out.println("Tope de pila2 tras esIgual(): " + pila2.pop()); 

        System.out.println("\n--- Casos de borde ---");
        System.out.println("¿pila1 es igual a sí misma?: " + pila1.esIgual(pila1)); 
    }
} 
    

