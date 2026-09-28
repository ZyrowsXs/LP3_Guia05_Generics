import java.util.Objects;

public class Persona {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad)
    {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {return this.nombre;}
    public int getEdad() {return this.edad;}

    @Override
    public String toString()
    {
        return "(Nombre: " + this.nombre + "; Edad: " + this.edad+ ")";
    }

    @Override 
    public boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }

        if (obj == null || this.getClass() != obj.getClass())
        {
            return false;
        }

        Persona persona = (Persona) obj;
        return this.edad == persona.edad && Objects.equals(this.nombre,persona.nombre);
    }

    @Override 
    public int hashCode()
    {
        return Objects.hash(this.nombre, this.edad);
    }
    
}
