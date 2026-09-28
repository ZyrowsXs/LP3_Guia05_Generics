public class Main {
    public static void main(String[] args) {
        Object obj1 = new Object();
        Object obj2 = new Object();
        Integer num1 = 100;
        Integer num2 = 100;
        Integer num3 = 200;
        String str1 = "Hola";
        String str2 = new String("Hola");
        String str3 = "Mundo";

        System.out.println("--- Prueba null ---");
        System.out.println("null vs null: " + IgualGenerico.esIgualA(null, null));

        System.out.println("\n--- Prueba Object ---");
        System.out.println("obj1 vs obj1: " + IgualGenerico.esIgualA(obj1, obj1));
        System.out.println("obj1 vs obj2: " + IgualGenerico.esIgualA(obj1, obj2));

        System.out.println("\n--- Prueba Integer ---");
        System.out.println("100 vs 100: " + IgualGenerico.esIgualA(num1, num2));
        System.out.println("100 vs 200: " + IgualGenerico.esIgualA(num1, num3));

        System.out.println("\n--- Prueba String ---");
        System.out.println("'Hola' vs new String('Hola'): " + IgualGenerico.esIgualA(str1, str2));
        System.out.println("'Hola' vs 'Mundo': " + IgualGenerico.esIgualA(str1, str3));

        System.out.println("\n--- Prueba tipos primitivos ---");
        System.out.println("5 == 5: " + IgualGenerico.esIgualA(5, 5));
    }
}