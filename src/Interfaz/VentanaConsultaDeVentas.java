//Lussich del Campo, Jeronimo (223693)
//Molinelli Verzi, Julian Antonio (218251)

package Interfaz;

import Dominio.InterfazUtils;
import Dominio.Factura;
import Dominio.Libro;
import Dominio.Sistema;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.Observable;
import java.util.Observer;
import javax.swing.DefaultListModel;
import javax.swing.table.DefaultTableModel;

public class VentanaConsultaDeVentas extends javax.swing.JFrame implements Observer{
    private Sistema sistema;
    public VentanaConsultaDeVentas(Sistema sistema) {
        this.sistema = sistema;
        sistema.addObserver(this);
        initComponents();
        establecerListaLibros();
    }

    @Override
    public void update(Observable o, Object ob){
        actualizarListaLibros();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPaneTabla = new javax.swing.JScrollPane();
        jTableTabla = new javax.swing.JTable();
        jLabelEjemplaresVendidos = new javax.swing.JLabel();
        jLabelFactura = new javax.swing.JLabel();
        jLabelEjemplaresVenidosValor = new javax.swing.JLabel();
        jLabelTotalRecaudado = new javax.swing.JLabel();
        jLabel2TotalRecaudadoValor = new javax.swing.JLabel();
        jTextFieldBuscador = new javax.swing.JTextField();
        jLabelTotalGanancia = new javax.swing.JLabel();
        jButtonHelper = new javax.swing.JButton();
        jLabelTotalGanaciaValor = new javax.swing.JLabel();
        jButtonConsultar = new javax.swing.JButton();
        jButtonExportar = new javax.swing.JButton();
        jLabelTitulo = new javax.swing.JLabel();
        jScrollPaneListaLibros = new javax.swing.JScrollPane();
        jListLibros = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consulta de Ventas");

        jTableTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Fecha", "Cliente", "Factura", "Cantidad", "Precio", "Importe"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTableTabla.setToolTipText("");
        jScrollPaneTabla.setViewportView(jTableTabla);

        jLabelEjemplaresVendidos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelEjemplaresVendidos.setText("Ejemplares vendidos");

        jLabelFactura.setText("Isbn");

        jLabelEjemplaresVenidosValor.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelEjemplaresVenidosValor.setForeground(java.awt.Color.blue);
        jLabelEjemplaresVenidosValor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelEjemplaresVenidosValor.setText("0");

        jLabelTotalRecaudado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTotalRecaudado.setText("Total recaudado");

        jLabel2TotalRecaudadoValor.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2TotalRecaudadoValor.setForeground(java.awt.Color.blue);
        jLabel2TotalRecaudadoValor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2TotalRecaudadoValor.setText("0");

        jTextFieldBuscador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldBuscadorActionPerformed(evt);
            }
        });

        jLabelTotalGanancia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTotalGanancia.setText("Total ganancia");

        jButtonHelper.setText("...");
        jButtonHelper.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHelperActionPerformed(evt);
            }
        });

        jLabelTotalGanaciaValor.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelTotalGanaciaValor.setForeground(java.awt.Color.blue);
        jLabelTotalGanaciaValor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTotalGanaciaValor.setText("0");

        jButtonConsultar.setText("Consultar");
        jButtonConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsultarActionPerformed(evt);
            }
        });

        jButtonExportar.setText("Exportar");
        jButtonExportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExportarActionPerformed(evt);
            }
        });

        jLabelTitulo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelTitulo.setForeground(java.awt.Color.blue);

        jListLibros.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jListLibrosValueChanged(evt);
            }
        });
        jScrollPaneListaLibros.setViewportView(jListLibros);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelTotalRecaudado, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(jLabel2TotalRecaudadoValor, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelEjemplaresVendidos, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelEjemplaresVenidosValor, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(44, 44, 44)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(jLabelTotalGanaciaValor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jLabelTotalGanancia, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jTextFieldBuscador, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(jButtonHelper, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonExportar, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPaneTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(12, 12, 12)
                .addComponent(jScrollPaneListaLibros, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPaneListaLibros, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButtonHelper)
                                .addComponent(jButtonConsultar))
                            .addComponent(jButtonExportar)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabelFactura, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextFieldBuscador, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addGap(15, 15, 15)
                        .addComponent(jLabelTitulo)
                        .addGap(12, 12, 12)
                        .addComponent(jScrollPaneTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabelTotalGanancia)
                                    .addComponent(jLabelEjemplaresVendidos))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelTotalGanaciaValor)
                                    .addComponent(jLabelEjemplaresVenidosValor)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelTotalRecaudado)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2TotalRecaudadoValor)))))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        setBounds(0, 0, 687, 267);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldBuscadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldBuscadorActionPerformed

    }//GEN-LAST:event_jTextFieldBuscadorActionPerformed
    
    private void actualizarTablaFacturas(String isbn){
        DefaultTableModel model = (DefaultTableModel) jTableTabla.getModel();
        model.setRowCount(0);
        ArrayList<Factura> facturasAMostrar = sistema.getFacturasPorIsbn(isbn);
        for (Factura factura : facturasAMostrar) {
            model.addRow(new Object[]{factura.getFecha(), factura.getCliente(), factura.getNumeroFactura(), factura.getVentaPorIsbn(isbn).getUnidadesVendidas(), factura.getVentaPorIsbn(isbn).getPrecioVenta(), factura.getVentaPorIsbn(isbn).calcularMontoTotalVenta()});
        }
    }
    
    private void actualizarValores(String isbn){
        ArrayList<Factura> facturasDeLaBusqueda = sistema.getFacturasPorIsbn(isbn);
        int ejemplaresVendidos = 0;
        int totalRecaudado = 0;
        int totalCosto = 0;
        int totalGanancia = 0;
        
        for (Factura factura : facturasDeLaBusqueda){
            ejemplaresVendidos += factura.getVentaPorIsbn(isbn).getUnidadesVendidas();
            totalRecaudado += factura.getVentaPorIsbn(isbn).calcularMontoTotalVenta();
            totalCosto += factura.getVentaPorIsbn(isbn).calcularCostoTotalVenta();
        }
        
        totalGanancia = totalRecaudado - totalCosto;
        
        jLabelEjemplaresVenidosValor.setText(Integer.toString(ejemplaresVendidos));
        jLabel2TotalRecaudadoValor.setText(Integer.toString(totalRecaudado));
        jLabelTotalGanaciaValor.setText(Integer.toString(totalGanancia));
    }
    
    private void jButtonHelperActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHelperActionPerformed
        jScrollPaneListaLibros.setVisible(!jScrollPaneListaLibros.isVisible());
        pack();
        actualizarListaLibros();
    }//GEN-LAST:event_jButtonHelperActionPerformed

    private void actualizarListaLibros(){
        DefaultListModel<Libro> lista = new DefaultListModel<>();
        for(Libro libro : sistema.getListaDeLibros()){
            lista.addElement(libro);
        }
        jListLibros.setModel(lista);
    }
    
    private void actualizarTitulo(Libro libro){
        if(libro != null){
            jLabelTitulo.setText(libro.getTitulo());
        } else {
            jLabelTitulo.setText("");
        }
    }
    
    private void jButtonConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsultarActionPerformed
        realizarConsulta();
    }//GEN-LAST:event_jButtonConsultarActionPerformed
    
    private void realizarConsulta(){
        String isbnBuscado = jTextFieldBuscador.getText().trim();
        actualizarTitulo(sistema.getLibroPorIsbn(isbnBuscado));
        actualizarTablaFacturas(isbnBuscado);
        actualizarValores(isbnBuscado);
        jListLibros.clearSelection();
        jTextFieldBuscador.setText("");
    }
    
    private void jButtonExportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExportarActionPerformed
        try {
            FileWriter f = new FileWriter("Ventas.csv");
            Formatter out = new Formatter(f);
            
            DefaultTableModel datos = (DefaultTableModel) jTableTabla.getModel();
            
            for(int i = 0; i < datos.getColumnCount(); i++){
                out.format("%s", datos.getColumnName(i));
                if(i < datos.getColumnCount() - 1){
                    out.format(";");
                }
            }
            out.format("%n");
            
            for(int i = 0; i < datos.getRowCount(); i++){
                for(int j = 0; j < datos.getColumnCount(); j++){
                    Object dato = datos.getValueAt(i, j);
                    out.format("%s", dato != null ? dato.toString() : "");
                    if(j < datos.getColumnCount() - 1){
                        out.format(";");
                    }
                }
                out.format("%n");
            }
            
            out.close();
            f.close();
            
            InterfazUtils.popUps(this, true, "Archivo creado correctamente.", "");
            
        } catch (IOException e) {
            InterfazUtils.popUps(this, false, "", "El archivo no se pudo crear.");
        } 
    }//GEN-LAST:event_jButtonExportarActionPerformed

    private void jListLibrosValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jListLibrosValueChanged
        Libro libroSeleccionado = jListLibros.getSelectedValue();
    if(libroSeleccionado != null){
        String isbnSeleccionado = libroSeleccionado.getIsbn();
        if (!jTextFieldBuscador.getText().equals(isbnSeleccionado)) {
            jTextFieldBuscador.setText(isbnSeleccionado);
            realizarConsulta();
        }
    }
    jScrollPaneListaLibros.setVisible(!jScrollPaneListaLibros.isVisible());
    pack();
    }//GEN-LAST:event_jListLibrosValueChanged

    private void establecerListaLibros(){
        jScrollPaneListaLibros.setVisible(false);
        pack();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonConsultar;
    private javax.swing.JButton jButtonExportar;
    private javax.swing.JButton jButtonHelper;
    private javax.swing.JLabel jLabel2TotalRecaudadoValor;
    private javax.swing.JLabel jLabelEjemplaresVendidos;
    private javax.swing.JLabel jLabelEjemplaresVenidosValor;
    private javax.swing.JLabel jLabelFactura;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JLabel jLabelTotalGanaciaValor;
    private javax.swing.JLabel jLabelTotalGanancia;
    private javax.swing.JLabel jLabelTotalRecaudado;
    private javax.swing.JList<Libro> jListLibros;
    private javax.swing.JScrollPane jScrollPaneListaLibros;
    private javax.swing.JScrollPane jScrollPaneTabla;
    private javax.swing.JTable jTableTabla;
    private javax.swing.JTextField jTextFieldBuscador;
    // End of variables declaration//GEN-END:variables
}
