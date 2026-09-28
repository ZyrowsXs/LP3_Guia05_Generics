import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- 1. Contenedor de Cursos y Créditos (String, Integer) ---");
        Contenedor<String, Integer> contenedorCursos = new Contenedor<>();

        contenedorCursos.agregarPar("Lenguajes de Programación III", 4);
        contenedorCursos.agregarPar("Sistemas Operativos", 4);
        contenedorCursos.agregarPar("Redes y Comunicación", 3);

        System.out.println("Lista de cursos agregados:");
        contenedorCursos.mostrarPares();

        System.out.println("\nElemento en el índice 1:");
        Par<String, Integer> parObtenido = contenedorCursos.obtenerPar(1);
        System.out.println("Par recuperado: " + parObtenido);

        System.out.println("\n--- 2. Contenedor de Estudiantes y Códigos (Persona, Integer) ---");
        Contenedor<Persona, Integer> contenedorEstudiantes = new Contenedor<>();

        contenedorEstudiantes.agregarPar(new Persona("Carlos Suarez", 18), 2025001);
        contenedorEstudiantes.agregarPar(new Persona("Leandro Morani", 18), 2025002);
        contenedorEstudiantes.agregarPar(new Persona("Sebastian Vargas", 18), 2025003);

        System.out.println("Lista de estudiantes agregados:");
        contenedorEstudiantes.mostrarPares();

        System.out.println("\n--- 3. Prueba de obtenerTodosLosPares() ---");
        ArrayList<Par<Persona, Integer>> listaCompleta = contenedorEstudiantes.obtenerTodosLosPares();
        System.out.println("Total de pares registrados en la colección: " + listaCompleta.size());

        System.out.println("\n--- 4. Validación de límites en obtenerPar() ---");
        try {
            contenedorEstudiantes.obtenerPar(10);
        } catch (IllegalArgumentException e) {
            System.out.println("Excepción capturada con éxito: " + e.getMessage());
        }
    }
}