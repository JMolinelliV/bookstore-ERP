//Lussich del Campo, Jeronimo (223693)
//Molinelli Verzi, Julian Antonio (218251)

package Interfaz;

import Dominio.InterfazUtils;
import Dominio.Libro;
import Dominio.Sistema;
import java.awt.Component;
import java.awt.Container;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class VentanaConsultaDeLibros extends javax.swing.JFrame {
    private Sistema sistema;
    public VentanaConsultaDeLibros(Sistema sistema) {
        this.sistema = sistema;
        initComponents();
    }
      
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanelConsultaDeLibros = new javax.swing.JPanel();
        labelGenero = new javax.swing.JLabel();
        textFieldGenero = new javax.swing.JTextField();
        labelTitulo = new javax.swing.JLabel();
        textFieldAutor = new javax.swing.JTextField();
        labelAutor = new javax.swing.JLabel();
        textFieldTitulo = new javax.swing.JTextField();
        btnConsultaLibros = new javax.swing.JButton();
        panelLibros = new javax.swing.JPanel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consulta de Libros");

        labelGenero.setText("Género");

        labelTitulo.setText("Título");

        textFieldAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldAutorActionPerformed(evt);
            }
        });

        labelAutor.setText("Autor");

        btnConsultaLibros.setText("Consultar");
        btnConsultaLibros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultaLibrosActionPerformed(evt);
            }
        });

        panelLibros.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelLibros.setLayout(new java.awt.GridLayout(0, 3));

        javax.swing.GroupLayout jPanelConsultaDeLibrosLayout = new javax.swing.GroupLayout(jPanelConsultaDeLibros);
        jPanelConsultaDeLibros.setLayout(jPanelConsultaDeLibrosLayout);
        jPanelConsultaDeLibrosLayout.setHorizontalGroup(
            jPanelConsultaDeLibrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelConsultaDeLibrosLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanelConsultaDeLibrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanelConsultaDeLibrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textFieldAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(66, Short.MAX_VALUE))
            .addComponent(panelLibros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelConsultaDeLibrosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnConsultaLibros)
                .addGap(174, 174, 174))
        );
        jPanelConsultaDeLibrosLayout.setVerticalGroup(
            jPanelConsultaDeLibrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelConsultaDeLibrosLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanelConsultaDeLibrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelConsultaDeLibrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(textFieldTitulo)
                    .addComponent(labelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelConsultaDeLibrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(btnConsultaLibros)
                .addGap(18, 18, 18)
                .addComponent(panelLibros, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelConsultaDeLibros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelConsultaDeLibros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textFieldAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldAutorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldAutorActionPerformed

    private void btnConsultaLibrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultaLibrosActionPerformed
        if(!alMenosUnoCompleto(jPanelConsultaDeLibros)){
            InterfazUtils.popUps(this, false, "", "Al menos uno de los campos deben contener datos.");
        } else {
            String genero = textFieldGenero.getText().trim();
            String titulo = textFieldTitulo.getText().trim();
            String autor = textFieldAutor.getText().trim();
            
            panelLibros.removeAll();
            panelLibros.revalidate();
            panelLibros.repaint();
            
            List<Libro> librosAMostrar = sistema.buscarLibros(genero, titulo, autor);
            
            for(Libro libro : librosAMostrar){
                JButton nuevo = new JButton();
                nuevo.setPreferredSize(new Dimension(100,150));
                
                if(libro.getImagenCaratula() != null && libro.getImagenCaratula().exists()){
                    ImageIcon iconoOriginal = new ImageIcon(libro.getImagenCaratula().getAbsolutePath());

                    Image imagenRedimensionada = iconoOriginal.getImage().getScaledInstance(100, 150, Image.SCALE_SMOOTH);
                    nuevo.setIcon(new ImageIcon(imagenRedimensionada));
                    nuevo.setBorderPainted(false);
                    nuevo.setContentAreaFilled(false);
                    nuevo.setFocusPainted(false);
                } else {
                    nuevo.setText(libro.getIsbn());
                    nuevo.setBackground(Color.WHITE);
                    nuevo.setOpaque(true);
                }
                
                nuevo.addActionListener(new LibroListener(libro));
                panelLibros.add(nuevo);
            }
            
            InterfazUtils.resetearCamposTexto(jPanelConsultaDeLibros);
            
            panelLibros.revalidate();
            panelLibros.repaint();
            
        }
    }//GEN-LAST:event_btnConsultaLibrosActionPerformed
    
    private class LibroListener implements ActionListener {
        private Libro libro;

        public LibroListener(Libro libro) {
            this.libro = libro;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(VentanaConsultaDeLibros.this,
                    "Título: " + libro.getTitulo() +
                    "\nAutor: " + libro.getAutor() +
                    "\nGénero: " + libro.getGenero() +
                    "\nISBN: " + libro.getIsbn() +
                    "\nCosto: " + libro.getCosto() +
                    "\nPrecio de venta: " + libro.getPrecioVenta() +
                    "\nStock: " + libro.getCantidadDeEjemplares(),
                    "Detalles del Libro",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    private boolean alMenosUnoCompleto(Container container){
        boolean unoCompleto = false;
        for (Component component : container.getComponents()) {
            if (component instanceof JTextField textField) {
                if (!textField.getText().isEmpty()){
                    unoCompleto = true;
                }
            }
        }
        
        return unoCompleto;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultaLibros;
    private javax.swing.JPanel jPanelConsultaDeLibros;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel labelAutor;
    private javax.swing.JLabel labelGenero;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JPanel panelLibros;
    private javax.swing.JTextField textFieldAutor;
    private javax.swing.JTextField textFieldGenero;
    private javax.swing.JTextField textFieldTitulo;
    // End of variables declaration//GEN-END:variables
}
