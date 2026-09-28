import java.util.ArrayList;

public class Contenedor<F,S>{
    private ArrayList<Par<F,S>> pares;

    public Contenedor()
    {
       this.pares = new ArrayList<>();
    }

    public void agregarPar(F primero, S segundo)
    {
        this.pares.add(new Par(primero,segundo));
    }

    public Par<F,S> obtenerPar(int indice)
    {
        if (indice >= this.pares.size() || indice < 0)
        {
            throw new IllegalArgumentException("ERROR: INgreso de indice incorrecto");
        }
        return pares.get(indice);
    }

    public ArrayList<Par<F,S>> obtenerTodosLosPares(){return pares;}
    public void mostrarPares()
    {
        if(pares.isEmpty())
        {
            System.out.println("No hay ningun par almacenado");
        }
        for(Par<F,S> i : pares)
        {
            System.out.println(i);
        }
    }
}
