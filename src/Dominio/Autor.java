//Lussich del Campo, Jeronimo (223693)
//Molinelli Verzi, Julian Antonio (218251)

package Dominio;
 
import java.io.Serializable;
import java.util.ArrayList;

public class Autor implements Serializable{
    private String nombre;
    private String paisDeOrigen;
    private ArrayList<Genero> generosDelAutor;
    
    public Autor(String unNombre, String unPaisDeOrigen, ArrayList<Genero> generosDelAutor){
        this.nombre = unNombre;
        this.paisDeOrigen = unPaisDeOrigen;
        this.generosDelAutor = generosDelAutor;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPaisDeOrigen() {
        return paisDeOrigen;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPaisDeOrigen(String paisDeOrigen) {
        this.paisDeOrigen = paisDeOrigen;
    }

    public ArrayList<Genero> getGenerosDelAutor() {
        return generosDelAutor;
    }
    @Override
    public String toString()
    {
        return this.nombre;
    }
    
}
