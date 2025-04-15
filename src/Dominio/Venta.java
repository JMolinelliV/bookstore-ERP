//Lussich del Campo, Jeronimo (223693)
//Molinelli Verzi, Julian Antonio (218251)

package Dominio;

import java.io.Serializable;

public class Venta implements Serializable{
    
    private Libro libro;
    private int unidadesVendidas;
    private int montoTotalVenta;

    public Venta(Libro libro) {
        this.libro = libro;
        this.unidadesVendidas = 1;
        this.montoTotalVenta = calcularMontoTotalVenta(); 
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public int calcularMontoTotalVenta()
    {
        return libro.getPrecioVenta() * unidadesVendidas;
    }
    
    public int calcularCostoTotalVenta(){
        return libro.getCosto() * unidadesVendidas;
    }
    
    public void incrementarUnidadesVendidas() {
        this.unidadesVendidas++;
        this.montoTotalVenta = calcularMontoTotalVenta();
    }
    
    public void decrementarUnidadesVendidas() {
        if (this.unidadesVendidas > 0) {
            this.unidadesVendidas--;
            this.montoTotalVenta = calcularMontoTotalVenta();
        }
    }

    public Libro getLibro() {
        return libro;
    }

    public int getUnidadesVendidas() {
        return unidadesVendidas;
    }

    public int getPrecioVenta() {
        return libro.getPrecioVenta();
    }

    public int getMontoTotalVenta() {
        return montoTotalVenta;
    }

    public void setMontoTotalVenta(int montoTotalVenta) {
        this.montoTotalVenta = montoTotalVenta;
    }
    
    @Override
    public String toString()
    {
        return unidadesVendidas + " - " + libro.getTitulo() + " - $" + libro.getPrecioVenta();
    }
}
