//Lussich del Campo, Jeronimo (223693)
//Molinelli Verzi, Julian Antonio (218251)

package Interfaz;

import Dominio.InterfazUtils;
import Dominio.Libro;
import Dominio.Sistema;
import Dominio.Venta;
import java.util.*;
import javax.swing.*;

public class VentanaVentaDeLibros extends javax.swing.JFrame implements Observer {
    private Sistema sistema;
    private HashMap<Libro, Integer> unidadesVendidas;
    private ArrayList<Venta> listaVentas;

    public VentanaVentaDeLibros(Sistema sistema) {
        this.sistema = sistema;
        this.unidadesVendidas = new HashMap<>();
        this.listaVentas = new ArrayList<>();
        this.sistema.addObserver(this);
        initComponents();
        actualizarListasYDatos();
    }
    
    @Override
    public void update(Observable o, Object ob){
        actualizarListasYDatos();
    }
    public void actualizarListasYDatos()
    {
        actualizarLibros();
        actualizarVentas();
        actualizarNumeroFactura();
        ajustarTotalFactura();
    }
    
    public void actualizarLibros()
    {
        DefaultListModel<Libro> listModel = new DefaultListModel<>();
         
        for (Libro libro : sistema.getListaDeLibrosOrdenadaPorTitulo()) {
            listModel.addElement(libro);
        }
        jListLibros.setModel(listModel);
    }
    public void actualizarVentas()
    {
        DefaultListModel<Venta> listModel= new DefaultListModel<>();
         
        for (Venta venta : listaVentas) {
            listModel.addElement(venta);
        }
        jListVenta.setModel(listModel);
    }
    public void actualizarNumeroFactura() {
        JLabelFacturasNumber.setText(String.valueOf(sistema.getNumeroFactura()));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelVentaInicio = new javax.swing.JPanel();
        jLabelFacturas = new javax.swing.JLabel();
        JLabelFacturasNumber = new javax.swing.JLabel();
        jLabelClienteLabel = new javax.swing.JLabel();
        jLabelFecha = new javax.swing.JLabel();
        jInputFecha = new javax.swing.JTextField();
        jClienteNameInput = new javax.swing.JTextField();
        jButtonRight = new javax.swing.JButton();
        jLabelVenta = new javax.swing.JLabel();
        jScrollVenta = new javax.swing.JScrollPane();
        jListVenta = new javax.swing.JList<>();
        jLabelLibros = new javax.swing.JLabel();
        jButtonRegistrar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jLabelTotal = new javax.swing.JLabel();
        jLeftButton = new javax.swing.JButton();
        jScrollLibros1 = new javax.swing.JScrollPane();
        jListLibros = new javax.swing.JList<>();
        jLabelMonto = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle(" Venta de Libros");

        jLabelFacturas.setForeground(new java.awt.Color(51, 51, 51));
        jLabelFacturas.setText("Factura:");

        JLabelFacturasNumber.setText("0");

        jLabelClienteLabel.setText("Cliente");

        jLabelFecha.setText("Fecha");

        jInputFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jInputFechaActionPerformed(evt);
            }
        });

        jClienteNameInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jClienteNameInputActionPerformed(evt);
            }
        });

        jButtonRight.setText("->");
        jButtonRight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRightActionPerformed(evt);
            }
        });

        jLabelVenta.setText("Venta");

        jScrollVenta.setViewportView(jListVenta);

        jLabelLibros.setText("Libros");

        jButtonRegistrar.setText("Registrar");
        jButtonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistrarActionPerformed(evt);
            }
        });

        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jLabelTotal.setText("Total: ");

        jLeftButton.setText("<-");
        jLeftButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLeftButtonActionPerformed(evt);
            }
        });

        jScrollLibros1.setViewportView(jListLibros);

        jLabelMonto.setText("0");

        javax.swing.GroupLayout jPanelVentaInicioLayout = new javax.swing.GroupLayout(jPanelVentaInicio);
        jPanelVentaInicio.setLayout(jPanelVentaInicioLayout);
        jPanelVentaInicioLayout.setHorizontalGroup(
            jPanelVentaInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelVentaInicioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelFacturas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JLabelFacturasNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanelVentaInicioLayout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(jButtonRegistrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonCancelar)
                .addGap(190, 190, 190))
            .addGroup(jPanelVentaInicioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelVentaInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelLibros)
                    .addGroup(jPanelVentaInicioLayout.createSequentialGroup()
                        .addGroup(jPanelVentaInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanelVentaInicioLayout.createSequentialGroup()
                                .addComponent(jLabelFecha)
                                .addGap(18, 18, 18)
                                .addComponent(jInputFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollLibros1, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelVentaInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonRight)
                            .addComponent(jLeftButton))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(jPanelVentaInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelVentaInicioLayout.createSequentialGroup()
                        .addComponent(jLabelTotal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelMonto))
                    .addGroup(jPanelVentaInicioLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanelVentaInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanelVentaInicioLayout.createSequentialGroup()
                                .addComponent(jLabelClienteLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jClienteNameInput))
                            .addComponent(jLabelVenta)
                            .addComponent(jScrollVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(184, 184, 184))
        );
        jPanelVentaInicioLayout.setVerticalGroup(
            jPanelVentaInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelVentaInicioLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanelVentaInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelFacturas)
                    .addComponent(JLabelFacturasNumber))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelVentaInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelFecha)
                    .addComponent(jClienteNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jInputFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelClienteLabel))
                .addGap(5, 5, 5)
                .addGroup(jPanelVentaInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelVenta, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelLibros))
                .addGroup(jPanelVentaInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelVentaInicioLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollLibros1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelVentaInicioLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanelVentaInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelVentaInicioLayout.createSequentialGroup()
                                .addComponent(jButtonRight, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLeftButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(11, 11, 11)))
                .addGroup(jPanelVentaInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelMonto)
                    .addComponent(jLabelTotal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelVentaInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonRegistrar)
                    .addComponent(jButtonCancelar))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanelVentaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jPanelVentaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(67, Short.MAX_VALUE))
        );

        setBounds(0, 0, 752, 379);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonRightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRightActionPerformed
        
        Libro libro = jListLibros.getSelectedValue();

        if (libro == null) {
            InterfazUtils.popUps(this, false, "", "Seleccione un libro.");
        } else {
            boolean libroEncontrado = false;

            for (Venta venta : listaVentas) {
                if (venta.getLibro() == libro) {
                    venta.incrementarUnidadesVendidas();
                    libroEncontrado = true;
                    break;
                }
            }

            if (!libroEncontrado) {
                Venta nuevaVenta = new Venta(libro);
                listaVentas.add(nuevaVenta);
            }

            actualizarListasYDatos();
        }
    }//GEN-LAST:event_jButtonRightActionPerformed

    private void jButtonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistrarActionPerformed
        if (InterfazUtils.estaVacio(jInputFecha)) {
            InterfazUtils.popUps(this, false, "", "El campo de fecha está vacío.");
        } else if (listaVentas.isEmpty()) {
            InterfazUtils.popUps(this, false, "", "Debe seleccionar al menos un ejemplar para registrar la venta.");
        } else {
            ArrayList<Venta> ventasConStock = new ArrayList<>();
            StringBuilder resumenVentas = new StringBuilder("Se vendieron:\n");
            boolean stockInsuficiente = false;

            for (Venta venta : listaVentas) {
                int unidadesDisponibles = venta.getLibro().getCantidadDeEjemplares();
                int unidadesVendidas = Math.min(venta.getUnidadesVendidas(), unidadesDisponibles);

                if (unidadesVendidas > 0) {
                    Venta ventaConStock = new Venta(venta.getLibro());
                    for (int i = 1; i < unidadesVendidas; i++) {
                        ventaConStock.incrementarUnidadesVendidas();
                    }
                    ventasConStock.add(ventaConStock);
                    resumenVentas.append(unidadesVendidas)
                                 .append(" de ")
                                 .append(venta.getLibro().getTitulo())
                                 .append("\n");
                }

                if (unidadesVendidas < venta.getUnidadesVendidas()) {
                    stockInsuficiente = true;
                }
            }

            if (ventasConStock.isEmpty()) {
                InterfazUtils.popUps(this, false, "", "No hay stock disponible para los libros seleccionados.");
                return;
            }

            String fecha = jInputFecha.getText();
            String cliente = jClienteNameInput.getText();
            int montoTotal = 0;
            for (Venta venta : ventasConStock) {
                montoTotal += venta.getMontoTotalVenta();
            }

            sistema.agregarFactura(ventasConStock, fecha, cliente, montoTotal);

            listaVentas.clear();
            actualizarListasYDatos();
            InterfazUtils.resetearCamposTexto(this);

            if (stockInsuficiente) {
                resumenVentas.append("\nNuevo total: ").append(montoTotal);
                InterfazUtils.popUps(this, true, "Factura creada con modificaciones:\n" + resumenVentas.toString(), "");
            } else {
                InterfazUtils.popUps(this, true, "Factura creada exitosamente.", "");
            }
        }
    }//GEN-LAST:event_jButtonRegistrarActionPerformed
    
    public void ajustarTotalFactura()
    {
        jLabelMonto.setText(Integer.toString(calcularMontoTotalFactura()));
    }
    
    public int calcularMontoTotalFactura()
    {
        int montoTotal = 0;

        for(Venta venta : listaVentas)
        {
            montoTotal += venta.getMontoTotalVenta();
        }
        return montoTotal;
    }
    
    
    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jInputFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jInputFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jInputFechaActionPerformed

    private void jLeftButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLeftButtonActionPerformed
        
        Venta venta = jListVenta.getSelectedValue();
        
        if(venta != null){
            Libro libro = venta.getLibro();   
            if (unidadesVendidas.containsKey(libro)) {
                int currentUnidades = venta.getUnidadesVendidas();

                if (currentUnidades > 1) {
                    unidadesVendidas.put(libro, currentUnidades - 1);
                    venta.decrementarUnidadesVendidas();
                } else {
                    unidadesVendidas.remove(libro);
                    listaVentas.remove(venta);
                }
                actualizarListasYDatos();
            }
        } else {
            InterfazUtils.popUps(this, false,"", "Seleccione una venta.");
        }
        
    }//GEN-LAST:event_jLeftButtonActionPerformed

    private void jClienteNameInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jClienteNameInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jClienteNameInputActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLabelFacturasNumber;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonRegistrar;
    private javax.swing.JButton jButtonRight;
    private javax.swing.JTextField jClienteNameInput;
    private javax.swing.JTextField jInputFecha;
    private javax.swing.JLabel jLabelClienteLabel;
    private javax.swing.JLabel jLabelFacturas;
    private javax.swing.JLabel jLabelFecha;
    private javax.swing.JLabel jLabelLibros;
    private javax.swing.JLabel jLabelMonto;
    private javax.swing.JLabel jLabelTotal;
    private javax.swing.JLabel jLabelVenta;
    private javax.swing.JButton jLeftButton;
    private javax.swing.JList<Libro> jListLibros;
    private javax.swing.JList<Venta> jListVenta;
    private javax.swing.JPanel jPanelVentaInicio;
    private javax.swing.JScrollPane jScrollLibros1;
    private javax.swing.JScrollPane jScrollVenta;
    // End of variables declaration//GEN-END:variables
}
