import excepciones.InvalidSubscriptException;

public class ArregloGenerico {
    public static <E> void imprimirArreglo(E[] arregloEntrada)
    {
        System.out.println("=======================================");
        if (arregloEntrada == null)
        {
            throw new InvalidSubscriptException("ERROR: EL arreglo es nulo");
        }
        for (E i : arregloEntrada)
        {
            System.out.print(i + "-");
        }
        System.out.println();
        System.out.println("=======================================");
    } 

    public static <E> int imprimirArreglo(E[] arregloEntrada, int subIndice, int superIndice)
    {
        System.out.println("=======================================");
        if (arregloEntrada == null)
        {
            throw new InvalidSubscriptException("ERROR: EL arreglo es nulo");
        }
        if (subIndice >= superIndice || subIndice < 0)
        {
            throw new InvalidSubscriptException("ERROR: Subindice invalido");
        }
        if (superIndice >= arregloEntrada.length || superIndice < 0)
        {
            throw new InvalidSubscriptException("ERROR: Superindice invalido");
        }
        for (int i = subIndice; i <= superIndice; i++)
        {
            System.out.print(arregloEntrada[i]+ "-");
        }
        System.out.println();
        System.out.println("=======================================");
        return superIndice - subIndice + 1;
    }
}
