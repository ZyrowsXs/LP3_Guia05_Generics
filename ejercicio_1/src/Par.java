public class Par <F,S> {
    private F primero;
    private S segundo;

    public Par(F primero , S segundo )
    {
        if (primero == null || segundo == null) {
            throw new NullPointerException("Los datos han de referenciar algun valor");
        }
        this.primero = primero;
        this.segundo = segundo;
    } 

    public void setPrimero (F primero)
    {
        if (primero == null ) {
            throw new NullPointerException("El dato ha de referenciar algun valor");
        }
        this.primero = primero;
    }

    public void setSegundo(S segundo)
    {
        if (segundo == null ) {
            throw new NullPointerException("El dato ha de referenciar algun valor");
        }
        this.segundo = segundo;  
    }

    public F getPrimero() {return this.primero;}

    public S getSegundo() {return this.segundo;}

    @Override 
    public String toString()
    {
        return "(Primero: " + this.primero 
        + " Segundo: " + this.segundo + ")";
    }
}
