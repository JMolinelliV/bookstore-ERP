//Lussich del Campo, Jeronimo (223693)
//Molinelli Verzi, Julian Antonio (218251)

package Dominio;

import java.io.Serializable;
import java.util.*;

public class Factura implements Serializable{
    
    private static int numeroFacturaActual;
    
    private int numeroFactura;
    private ArrayList<Venta> listaVentas;
    private String fecha;
    private int montoTotalFactura;
    private String cliente;

    public Factura(ArrayList<Venta> listaVentas, String fecha, String cliente, int montoTotalFactura) {
        numeroFactura = numeroFacturaActual;
        this.listaVentas = listaVentas;
        this.fecha = fecha;
        this.cliente = cliente;
        this.montoTotalFactura = montoTotalFactura;
        numeroFacturaActual++;
    }

    public static int getNumeroFacturaActual() {
        return numeroFacturaActual;
    }

    public static void setNumeroFacturaActual(int numeroFacturaActual) {
        Factura.numeroFacturaActual = numeroFacturaActual;
    }

    public void setNumeroFactura(int numeroFactura) {
        this.numeroFactura = numeroFactura;
    }

    public void setListaVentas(ArrayList<Venta> listaVentas) {
        this.listaVentas = listaVentas;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setMontoTotalFactura(int montoTotalFactura) {
        this.montoTotalFactura = montoTotalFactura;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public int getNumeroFactura() {
        return numeroFactura;
    }

    public ArrayList<Venta> getListaVentas() {
        return listaVentas;
    }

    public String getFecha() {
        return fecha;
    }

    public int getMontoTotalFactura() {
        return montoTotalFactura;
    }

    public String getCliente() {
        return cliente;
    }
    
    public Venta getVentaPorIsbn(String isbn){
        Venta ventaAMostrar = null;
        for(Venta venta : listaVentas){
            if(venta.getLibro().getIsbn().equals(isbn)){
                ventaAMostrar = venta;
            }
        }
        
        return ventaAMostrar;
    }

    @Override
    public String toString(){
        StringBuilder datos = new StringBuilder();
        datos.append(" N° de factura: ").append(numeroFactura).append("\n");
        datos.append("Fecha: ").append(fecha).append("\n");
        datos.append("Cliente: ").append(cliente).append("\n");
        datos.append("Monto Total: ").append(montoTotalFactura).append("\n");
        datos.append("Detalles de los productos:\n");
        
        for(Venta venta : listaVentas){
            datos.append("- Libro: ").append(venta.getLibro().toString())
                 .append(" | Unidades vendidas: ").append(venta.getUnidadesVendidas())
                 .append(" | Monto total: ").append(venta.getMontoTotalVenta())
                 .append("\n");
        }
        
        return datos.toString();
    }
}
