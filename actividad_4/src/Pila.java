import exception.ExeptionPilaLlena;
import exception.ExeptionPilaVacia;

public class Pila<E> {
    private final int tamanio;
    private int superior;
    private E[] elementos;

    public Pila(){
        this(10);
        this.superior = -1;
    }
    public Pila (int tamanio)
    {
        this.tamanio = tamanio>0 ? tamanio : 10;
        this.superior = -1;
        this.elementos = (E[]) new Object[tamanio];
    }

    public void push(E valorAMeter)
    {
        if (superior == tamanio -1)
            throw new ExeptionPilaLlena(String.format("La Pila esta llena, no se puede meter %s ", valorAMeter ));
        else
        {
            this.elementos[++superior] = valorAMeter;
        }
    }

    public E pop()
    {
        if (superior == -1)
        {
            throw new ExeptionPilaVacia("Pila vacia, no se puede sacar");
        }
        else{
            return this.elementos[superior--];
        }
    }

    public boolean contains (E elemento)
    {
        if (superior == -1)
        {
            return false;
        }
        if (elemento == null)
        {
            return false;
        }
        for(int i = this.superior; i > -1;i--)
        {
            if(elemento.equals(this.elementos[i]))
            {
                return true;
            }
        }
        return false;
    }

    public boolean esIgual(Pila<E> otraPila) {
        if (this == otraPila) {
            return true;
        }

        if (otraPila == null || this.superior != otraPila.superior || this.tamanio != otraPila.tamanio) {
            return false;
        }

        if (this.superior == -1) {
            return true;
        }

        for (int i = this.superior; i >= 0; i--) {
            E elementoActual = this.elementos[i];
            E elementoOtro = otraPila.elementos[i];

            if (elementoActual == null) {
                if (elementoOtro != null) {
                    return false;
                }
            } else if (!elementoActual.equals(elementoOtro)) {
                return false;
            }
        }

        return true;
    }
}
