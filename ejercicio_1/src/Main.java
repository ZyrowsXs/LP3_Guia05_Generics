public class Main {
    public static void main(String[] args) {
        Par<String, Integer> par1 = new Par<>("Estudiantes", 25);
        System.out.println("Par 1:");
        System.out.println(par1);

        Par<Double, Boolean> par2 = new Par<>(98.5, true);
        System.out.println("\nPar 2:");
        System.out.println(par2);

        System.out.println("\n--- Modificación mediante setters ---");
        par1.setPrimero("Docentes");
        par1.setSegundo(4);
        System.out.println("Nuevo primero: " + par1.getPrimero());
        System.out.println("Nuevo segundo: " + par1.getSegundo());
        System.out.println("Par 1 actualizado: " + par1);


        System.out.println("\n--- Validación de referencias nulas ---");
        try {
            Par<String, String> parInvalido = new Par<>(null, "Texto");
        } catch (NullPointerException e) {
            System.out.println("Capturada excepción en constructor: " + e.getMessage());
        }

        try {
            par2.setSegundo(null);
        } catch (NullPointerException e) {
            System.out.println("Capturada excepción en setSegundo: " + e.getMessage());
        }
    }
}