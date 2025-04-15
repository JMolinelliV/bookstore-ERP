//Lussich del Campo, Jeronimo (223693)
//Molinelli Verzi, Julian Antonio (218251)

package Dominio;

import java.io.File;
import java.io.Serializable;

public class Libro implements Serializable{
    
    private Editorial editorial;
    private Genero genero;
    private Autor autor;
    private String isbn;
    private String titulo;
    private int costo;
    private int precioVenta;
    private int cantidadDeEjemplares;
    private File imagenCaratula;

    public Libro(Editorial editorial, Genero genero, Autor autor, String isbn, String titulo, int costo, int precioVenta, File imagenCaratula, int cantidadDeEjemplares){
        this.editorial = editorial;
        this.genero = genero;
        this.autor = autor;
        this.isbn = isbn;
        this.titulo = titulo;
        this.costo = costo;
        this.precioVenta = precioVenta;  
        this.imagenCaratula = imagenCaratula;
        this.cantidadDeEjemplares = cantidadDeEjemplares;
    }

    public void setImagenCaratula(File imagenCaratula) {
        this.imagenCaratula = imagenCaratula;
    }

    public File getImagenCaratula() {
        return imagenCaratula;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public Genero getGenero() {
        return genero;
    }

    public Autor getAutor() {
        return autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getCosto() {
        return costo;
    }

    public int getPrecioVenta() {
        return precioVenta;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public void setPrecioVenta(int precioVenta) {
        this.precioVenta = precioVenta;
    }
    
    public void incrementarCantidadDeEjemplares() {
        this.cantidadDeEjemplares++;
    }
    
    public void incrementarCantidadDeEjemplares(int cantidad){
        this.cantidadDeEjemplares += cantidad;
    }
    
    public void decrementarCantidadDeEjemplares() {
        if (this.cantidadDeEjemplares > 0) {
            this.cantidadDeEjemplares--;
        }
    }
    
    public void decrementarCantidadDeEjemplares(int cantidad){
        this.cantidadDeEjemplares -= cantidad;
    }
    
    public int getCantidadDeEjemplares() {
        return cantidadDeEjemplares;
    }
    @Override
    public String toString()
    {
        return this.isbn + " - " + this.titulo;
    }
}
