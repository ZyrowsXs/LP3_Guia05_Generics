public class Main {
    public static void main(String[] args) {
        System.out.println("=== PRUEBAS DEL MÉTODO esIgual EN Par ===");

        Par<String, Integer> par1 = new Par<>("Puntos", 100);
        Par<String, Integer> par2 = new Par<>("Puntos", 100);
        Par<String, Integer> par3 = new Par<>("Puntos", 200);
        Par<String, Integer> par4 = new Par<>("Monedas", 100);

        System.out.println("¿par1 es igual a par2?: " + par1.esIgual(par2)); 

        System.out.println("¿par1 es igual a par3?: " + par1.esIgual(par3)); 

        System.out.println("¿par1 es igual a par4?: " + par1.esIgual(par4)); 

        System.out.println("¿par1 es igual a sí mismo?: " + par1.esIgual(par1)); 
        System.out.println("¿par1 es igual a null?: " + par1.esIgual(null));     
    }
}