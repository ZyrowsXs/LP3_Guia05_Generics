public class Main {

    public static void main(String[] args) {

        Par<String, Integer> par1 = new Par<>("Calificación", 20);
        Par<Double, Boolean> par2 = new Par<>(98.5, true);
        Par<Persona, Integer> par3 = new Par<>(new Persona("Carlos", 20), 101);

        System.out.println("--- 1. Pruebas con imprimirPar ---");
        imprimirPar(par1);
        imprimirPar(par2);
        imprimirPar(par3);
    }
    
    public static <F, S> void imprimirPar(Par<F, S> par) {
        System.out.println("Elemento Par: " + par);
    }
}