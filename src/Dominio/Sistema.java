//Lussich del Campo, Jeronimo (223693)
//Molinelli Verzi, Julian Antonio (218251)

package Dominio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Observable;

public class Sistema extends Observable implements Serializable {
    private ArrayList<Editorial> listaDeEditoriales;
    private ArrayList<Autor> listaDeAutores;
    private ArrayList<Genero> listaGeneros;
    private ArrayList<Factura> listaFacturas;
    private ArrayList<Libro> listaDeLibros;
    private String filePath;
    private int ultimoNumeroFactura = 1;

    public Sistema() {
        this.listaDeEditoriales = new ArrayList<>();
        this.listaDeAutores = new ArrayList<>();
        this.listaGeneros = new ArrayList<>();
        this.listaFacturas = new ArrayList<>();
        this.listaDeLibros = new ArrayList<>();
        this.filePath = "sistema.ser";
        Factura.setNumeroFacturaActual(ultimoNumeroFactura);
    }

    public boolean agregarEditorial(String nombre, String pais) {
        boolean editorialAgregada = false;
        Editorial nuevaEditorial = new Editorial(nombre, pais);
        boolean editorialYaExiste = verificarDuplicadosEditorial(nuevaEditorial);
        if (!editorialYaExiste) {
            listaDeEditoriales.add(nuevaEditorial);
            editorialAgregada = true;
            setChanged();
            notifyObservers();
        }
        return editorialAgregada;
    }

    public void removerEditorial(Editorial editorial) {
        listaDeEditoriales.remove(editorial);
        setChanged();
        notifyObservers();
    }

    public ArrayList<Editorial> getListaDeEditoriales() {
        return listaDeEditoriales;
    }

    private boolean verificarDuplicadosEditorial(Editorial unaEditorial) {
        boolean existe = false;
        for (Editorial editorial : listaDeEditoriales) {
            if (editorial.getNombre().equals(unaEditorial.getNombre())) {
                existe = true;
            }
        }
        return existe;
    }

    public boolean agregarAutor(String nombre, String paisDeOrigen, ArrayList<Genero> generosDelAutor) {
        boolean autorAgregado = false;
        Autor nuevoAutor = new Autor(nombre, paisDeOrigen, generosDelAutor);
        boolean autorYaExiste = verificarDuplicadosAutor(nuevoAutor);
        if (!autorYaExiste) {
            listaDeAutores.add(nuevoAutor);
            autorAgregado = true;
            setChanged();
            notifyObservers();
        }
        return autorAgregado;
    }

    public void removerAutor(Autor autor) {
        listaDeAutores.remove(autor);
        setChanged();
        notifyObservers();
    }

    public ArrayList<Autor> getListaDeAutores() {
        return listaDeAutores;
    }

    public ArrayList<Autor> getAutoresPorGenero(Genero genero) {
        ArrayList<Autor> listaAutores = new ArrayList<>();
        for (Autor autor : listaDeAutores) {
            ArrayList<Genero> generosDelAutor = autor.getGenerosDelAutor();
            if (generosDelAutor.contains(genero)) {
                listaAutores.add(autor);
            }
        }
        return listaAutores;
    }

    private boolean verificarDuplicadosAutor(Autor unAutor) {
        boolean existe = false;
        for (Autor autor : listaDeAutores) {
            if (autor.getNombre().equals(unAutor.getNombre())) {
                existe = true;
            }
        }
        return existe;
    }

    public boolean agregarGenero(String nombre, String descripcion) {
        boolean generoAgregado = false;
        Genero nuevoGenero = new Genero(nombre, descripcion);
        boolean generoYaExiste = verificarDuplicadosGenero(nuevoGenero);
        if (!generoYaExiste) {
            listaGeneros.add(nuevoGenero);
            generoAgregado = true;
            setChanged();
            notifyObservers();
        }
        return generoAgregado;
    }

    public void removerGenero(Genero genero) {
        listaGeneros.remove(genero);
        setChanged();
        notifyObservers();
    }

    public ArrayList<Genero> getListaGeneros() {
        return listaGeneros;
    }

    private boolean verificarDuplicadosGenero(Genero unGenero) {
        boolean existe = false;
        for (Genero genero : listaGeneros) {
            if (genero.getNombre().equals(unGenero.getNombre())) {
                existe = true;
            }
        }
        return existe;
    }

    public int getNumeroFactura() {
        return Factura.getNumeroFacturaActual();
    }

    public boolean agregarFactura(ArrayList<Venta> listaVentas, String fecha, String cliente, int montoTotal) {
        boolean facturaAgregada = false;
        Factura factura = new Factura(listaVentas, fecha, cliente, montoTotal);
        listaFacturas.add(factura);
        facturaAgregada = true;
        for (Venta venta : listaVentas) {
            Libro libro = venta.getLibro();
            libro.decrementarCantidadDeEjemplares(venta.getUnidadesVendidas());
            setChanged();
            notifyObservers();
        }
        return facturaAgregada;
    }

    public void removerFactura(Factura factura) {
        listaFacturas.remove(factura);
        setChanged();
        notifyObservers();
    }

    public void actualizarStockAnulacion(Factura factura) {
        for (Venta venta : factura.getListaVentas()) {
            int cantidadSubirStock = venta.getUnidadesVendidas();
            venta.getLibro().incrementarCantidadDeEjemplares(cantidadSubirStock);
        }
    }

    public Factura getFacturaPorNumero(int numeroDeFactura) {
        Factura facturaResultado = null;
        for (Factura factura : listaFacturas) {
            if (factura.getNumeroFactura() == numeroDeFactura) {
                facturaResultado = factura;
                break;
            }
        }
        return facturaResultado;
    }

    public ArrayList<Factura> getFacturasPorIsbn(String isbn) {
        ArrayList<Factura> facturasResultado = new ArrayList<>();
        for (Factura factura : listaFacturas) {
            for (Venta venta : factura.getListaVentas()) {
                if (venta.getLibro().getIsbn().equals(isbn)) {
                    facturasResultado.add(factura);
                }
            }
        }
        return facturasResultado;
    }

    public ArrayList<Factura> getListaFacturas() {
        return listaFacturas;
    }

    public boolean agregarLibro(Editorial editorial, Genero genero, Autor autor, String isbn, String titulo, int costo, int precioVenta, File imagenCaratula, int cantidadDeEjemplares) {
        boolean libroAgregado = false;
        if (esIsbnUnico(isbn)) {
            Libro libro = new Libro(editorial, genero, autor, isbn, titulo, costo, precioVenta, imagenCaratula, cantidadDeEjemplares);
            listaDeLibros.add(libro);
            libroAgregado = true;
            setChanged();
            notifyObservers();
        }
        return libroAgregado;
    }

    public void removerLibro(Libro libro) {
        listaDeLibros.remove(libro);
        setChanged();
        notifyObservers();
    }

    public ArrayList<Libro> getListaDeLibros() {
        return listaDeLibros;
    }

    public ArrayList<Libro> getListaDeLibrosOrdenadaPorTitulo() {
        ArrayList<Libro> listaOrdenada = new ArrayList<>(listaDeLibros);
        listaOrdenada.sort(Comparator.comparing(Libro::getTitulo));
        return listaOrdenada;
    }

    public boolean esIsbnUnico(String isbn) {
        boolean esUnico = true;
        for (Libro libro : listaDeLibros) {
            if (isbn.equals(libro.getIsbn())) {
                esUnico = false;
            }
        }
        return esUnico;
    }

    public List<Libro> buscarLibros(String genero, String titulo, String autor) {
        List<Libro> librosEncontrados = new ArrayList<>();
        for (Libro libro : listaDeLibros) {
            String generoLibro = libro.getGenero().getNombre();
            String tituloLibro = libro.getTitulo();
            String autorLibro = libro.getAutor().getNombre();
            boolean coincideGenero = genero.isEmpty() || generoLibro.contains(genero);
            boolean coincideTitulo = titulo.isEmpty() || tituloLibro.contains(titulo);
            boolean coincideAutor = autor.isEmpty() || autorLibro.contains(autor);
            if (coincideGenero && coincideTitulo && coincideAutor) {
                librosEncontrados.add(libro);
            }
        }
        return librosEncontrados;
    }

    public Libro getLibroPorIsbn(String isbn) {
        Libro libroAMostrar = null;
        for (Libro libro : listaDeLibros) {
            if (libro.getIsbn().equals(isbn)) {
                libroAMostrar = libro;
            }
        }
        return libroAMostrar;
    }
   
    public void saveSistema() throws IOException {
        this.ultimoNumeroFactura = Factura.getNumeroFacturaActual();
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath))) {
            oos.writeObject(this);
        }
    }

    public static Sistema loadSistema(String filepath) throws IOException, ClassNotFoundException {
        Sistema sistema;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filepath))) {
            sistema = (Sistema) ois.readObject();
            Factura.setNumeroFacturaActual(sistema.getUltimoNumeroFactura());
        }
        return sistema;
    }

    public int getUltimoNumeroFactura() {
        return ultimoNumeroFactura;
    }

    public void setUltimoNumeroFactura(int ultimoNumeroFactura) {
        this.ultimoNumeroFactura = ultimoNumeroFactura;
    }
}
