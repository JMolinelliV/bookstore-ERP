//Lussich del Campo, Jeronimo (223693)
//Molinelli Verzi, Julian Antonio (218251)

package Interfaz;

import Dominio.InterfazUtils;
import Dominio.Autor;
import Dominio.Editorial;
import Dominio.Genero;
import Dominio.Sistema;
import java.awt.Color;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.*;
import javax.imageio.ImageIO;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class VentanaRegistroLibro extends javax.swing.JFrame implements Observer{
    private Sistema sistema;
    private File imagenCaratula;

    public VentanaRegistroLibro(Sistema sistema) {
        this.sistema = sistema;
        sistema.addObserver(this);
        initComponents();
        actualizarListas();
    }
    
    @Override
    public void update(Observable o, Object ob){
        actualizarListas();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        labelEditorialLibro = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listAutorLibro = new javax.swing.JList<>();
        labelGeneroLibro = new javax.swing.JLabel();
        labelAutorLibro = new javax.swing.JLabel();
        labelISBN = new javax.swing.JLabel();
        labelTituloLibro = new javax.swing.JLabel();
        labelCostoLibro = new javax.swing.JLabel();
        labelPrecioVentaLibro = new javax.swing.JLabel();
        textFieldISBN = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        listEditorialesLibro = new javax.swing.JList<>();
        jScrollPane5 = new javax.swing.JScrollPane();
        listGenerosLibro = new javax.swing.JList<>();
        textFieldCostoLibro = new javax.swing.JTextField();
        textFieldPrecioVentaLibro = new javax.swing.JTextField();
        textFieldTituloLibro = new javax.swing.JTextField();
        btnRegistrarLibro = new javax.swing.JButton();
        labelCantidadUnidades = new javax.swing.JLabel();
        textFieldCantidadUnidades = new javax.swing.JTextField();
        JButtonCaratulaLibro = new javax.swing.JButton();
        labelCantidadUnidades1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registro de Libro");

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 13)); // NOI18N
        jLabel1.setText("Registro de nuevo libro");

        labelEditorialLibro.setText("Editorial");

        jScrollPane1.setViewportView(listAutorLibro);

        labelGeneroLibro.setText("Género");

        labelAutorLibro.setText("Autor");

        labelISBN.setText("Código ISBN:");

        labelTituloLibro.setText("Título:");

        labelCostoLibro.setText("Costo:");

        labelPrecioVentaLibro.setText("Precio de venta:");

        textFieldISBN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldISBNActionPerformed(evt);
            }
        });

        jScrollPane4.setViewportView(listEditorialesLibro);

        listGenerosLibro.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listGenerosLibroValueChanged(evt);
            }
        });
        jScrollPane5.setViewportView(listGenerosLibro);

        textFieldCostoLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldCostoLibroActionPerformed(evt);
            }
        });

        textFieldPrecioVentaLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldPrecioVentaLibroActionPerformed(evt);
            }
        });

        textFieldTituloLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldTituloLibroActionPerformed(evt);
            }
        });

        btnRegistrarLibro.setText("Registrar");
        btnRegistrarLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarLibroActionPerformed(evt);
            }
        });

        labelCantidadUnidades.setText("Cantidad de unidades:");

        textFieldCantidadUnidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldCantidadUnidadesActionPerformed(evt);
            }
        });

        JButtonCaratulaLibro.setBackground(Color.WHITE);
        JButtonCaratulaLibro.setText("Sin foto.");
        JButtonCaratulaLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonCaratulaLibroActionPerformed(evt);
            }
        });

        labelCantidadUnidades1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelCantidadUnidades1.setText("Carátula");
        labelCantidadUnidades1.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(labelEditorialLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)
                        .addComponent(labelGeneroLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addComponent(labelAutorLibro))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelISBN, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textFieldISBN, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(labelTituloLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(labelPrecioVentaLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(labelCantidadUnidades, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(labelCostoLibro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(textFieldCantidadUnidades, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                                    .addComponent(textFieldPrecioVentaLibro)
                                    .addComponent(textFieldCostoLibro)
                                    .addComponent(textFieldTituloLibro)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(btnRegistrarLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(JButtonCaratulaLibro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(labelCantidadUnidades1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelEditorialLibro)
                    .addComponent(labelGeneroLibro)
                    .addComponent(labelAutorLibro))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                    .addComponent(jScrollPane5)
                    .addComponent(jScrollPane4))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(labelISBN))
                    .addComponent(textFieldISBN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldTituloLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelTituloLibro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldCostoLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelCostoLibro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldPrecioVentaLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelPrecioVentaLibro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldCantidadUnidades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelCantidadUnidades))
                .addGap(28, 28, 28)
                .addComponent(labelCantidadUnidades1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JButtonCaratulaLibro, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnRegistrarLibro)
                .addContainerGap())
        );

        setBounds(0, 0, 391, 725);
    }// </editor-fold>//GEN-END:initComponents

    
    private void actualizarListas(){
        actualizarListaEditorial();
        actualizarListaGeneros();
    }
    
    private void actualizarListaEditorial() {
      DefaultListModel<Editorial> listaEditoriales = new DefaultListModel<>();
      
      InterfazUtils.actualizarListaEditorial(listaEditoriales, sistema);

      listEditorialesLibro.setModel(listaEditoriales);
    }
    
    private void actualizarListaGeneros() {
        DefaultListModel<Genero> lista = new DefaultListModel<>();
        for (Genero genero : sistema.getListaGeneros()){
            lista.addElement(genero);
        }
        listGenerosLibro.setModel(lista);
    }
    
    private void actualizarListaAutores(ArrayList listaAutoresGenero){
        DefaultListModel<Autor> listaAutores = new DefaultListModel<Autor>();
        InterfazUtils.actualizarListaAutores(listaAutores, listaAutoresGenero, sistema);
        listAutorLibro.setModel(listaAutores);
    }
    
        
    private void textFieldISBNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldISBNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldISBNActionPerformed

    private void textFieldCostoLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldCostoLibroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldCostoLibroActionPerformed

    private void textFieldPrecioVentaLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldPrecioVentaLibroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldPrecioVentaLibroActionPerformed

    private void textFieldTituloLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldTituloLibroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldTituloLibroActionPerformed

    private void btnRegistrarLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarLibroActionPerformed
        Editorial editorial = listEditorialesLibro.getSelectedValue();
        Genero genero = listGenerosLibro.getSelectedValue();
        Autor autor = listAutorLibro.getSelectedValue();
        String isbn = textFieldISBN.getText().trim();
        String titulo = textFieldTituloLibro.getText().trim();
        String costoTexto = textFieldCostoLibro.getText().trim();
        String precioVentaTexto = textFieldPrecioVentaLibro.getText().trim();
        String cantidadTexto = textFieldCantidadUnidades.getText().trim();

        // Verificaciones de campos vacíos y numéricos
        if (listEditorialesLibro.isSelectionEmpty()){
            InterfazUtils.popUps(this, false, "", "Debe seleccionar un editorial o registrar una si no hay ninguna.");
        } else if (listGenerosLibro.isSelectionEmpty()){
            InterfazUtils.popUps(this, false, "", "Debe seleccionar un género o registrar uno si no hay ninguno.");
        } else if (listAutorLibro.isSelectionEmpty()){
            InterfazUtils.popUps(this, false, "", "Debe seleccionar un autor o registrar uno si no hay ninguno.");
        } else if (InterfazUtils.estaVacio(textFieldISBN)) {
            InterfazUtils.popUps(this, false, "", "El campo de ISBN está vacío.");
        } else if (InterfazUtils.estaVacio(textFieldTituloLibro)) {
            InterfazUtils.popUps(this, false, "", "El campo de título está vacío.");
        } else if (InterfazUtils.estaVacio(textFieldCostoLibro)) {
            InterfazUtils.popUps(this, false, "", "El campo de costo está vacío.");
        } else if (InterfazUtils.estaVacio(textFieldPrecioVentaLibro)) {
            InterfazUtils.popUps(this, false, "", "El campo de precio de venta está vacío.");
        } else if (!sistema.esIsbnUnico(textFieldISBN.getText())) {
            InterfazUtils.popUps(this, false, "", "El ISBN ya está en uso.");
        } else if (InterfazUtils.estaVacio(textFieldCantidadUnidades)) {
            InterfazUtils.popUps(this, false, "", "El campo cantidad de ejemplares está vacío.");
        } else if (!InterfazUtils.esNumeroValido(costoTexto)) {
            InterfazUtils.popUps(this, false, "", "El costo debe ser un número.");
        } else if (!InterfazUtils.esNumeroValido(precioVentaTexto)) {
            InterfazUtils.popUps(this, false, "", "El precio debe ser un número.");
        } else if (!InterfazUtils.esNumeroValido(cantidadTexto)) {
            InterfazUtils.popUps(this, false, "", "La cantidad debe ser un número.");
        } else {
            int costo = Integer.parseInt(costoTexto);
            int precioVenta = Integer.parseInt(precioVentaTexto);
            int cantidadDeEjemplares = Integer.parseInt(cantidadTexto);
            
            if(cantidadDeEjemplares < 0){
                InterfazUtils.popUps(this, false, "", "La cantidad no puede ser menor a 0.");
            }
            else {
                sistema.agregarLibro(editorial, genero, autor, isbn, titulo, costo, precioVenta, imagenCaratula, cantidadDeEjemplares);
                InterfazUtils.popUps(this, true, "Libro creado exitosamente.", "");
                InterfazUtils.resetearCamposTexto(this);
                JButtonCaratulaLibro.setIcon(null);
                imagenCaratula = null;
                actualizarListas();
            }
        }
    }//GEN-LAST:event_btnRegistrarLibroActionPerformed

    private void listGenerosLibroValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listGenerosLibroValueChanged
        
        Genero genero = listGenerosLibro.getSelectedValue();
        ArrayList<Autor> listaAutores = sistema.getAutoresPorGenero(genero);
        actualizarListaAutores(listaAutores);

    }//GEN-LAST:event_listGenerosLibroValueChanged

    private void textFieldCantidadUnidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldCantidadUnidadesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldCantidadUnidadesActionPerformed

    private void JButtonCaratulaLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonCaratulaLibroActionPerformed
        try {
            // Establecer el Look and Feel del sistema operativo
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (UnsupportedLookAndFeelException | ClassNotFoundException |
            InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
        
        JFileChooser selector = new JFileChooser();
        selector.setDialogTitle("Seleccione una imagen para la carátula.");
        selector.setFileFilter(new javax.swing.filechooser.FileNameExtensionFilter("Imágenes", "jpg", "jpeg", "png"));
        int seleccion = selector.showOpenDialog(this);

        if(seleccion == JFileChooser.APPROVE_OPTION){
            File imagen = selector.getSelectedFile();

            try {
                File carpetaImagenes = new File("imagenes");
                if(!carpetaImagenes.exists()){
                    carpetaImagenes.mkdir();
                }

                String isbn = textFieldISBN.getText().trim();
                String extensionOriginal = imagen.getName().substring(imagen.getName().indexOf("."));
                imagenCaratula = new File(carpetaImagenes, isbn + extensionOriginal);

                Files.copy(imagen.toPath(), imagenCaratula.toPath(), StandardCopyOption.REPLACE_EXISTING);

                if (imagenCaratula.exists()) {
                    Image imagenOriginal = ImageIO.read(imagenCaratula);
                    Image imagenRedimensionada = imagenOriginal.getScaledInstance(
                        JButtonCaratulaLibro.getWidth(),
                        JButtonCaratulaLibro.getHeight(),
                        Image.SCALE_SMOOTH  
                    );
                    JButtonCaratulaLibro.setIcon(new ImageIcon(imagenRedimensionada));
                } else {
                    System.out.println("Error: La imagen no se encontró en la ruta especificada.");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_JButtonCaratulaLibroActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JButtonCaratulaLibro;
    private javax.swing.JButton btnRegistrarLibro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel labelAutorLibro;
    private javax.swing.JLabel labelCantidadUnidades;
    private javax.swing.JLabel labelCantidadUnidades1;
    private javax.swing.JLabel labelCostoLibro;
    private javax.swing.JLabel labelEditorialLibro;
    private javax.swing.JLabel labelGeneroLibro;
    private javax.swing.JLabel labelISBN;
    private javax.swing.JLabel labelPrecioVentaLibro;
    private javax.swing.JLabel labelTituloLibro;
    private javax.swing.JList<Autor> listAutorLibro;
    private javax.swing.JList<Editorial> listEditorialesLibro;
    private javax.swing.JList<Genero> listGenerosLibro;
    private javax.swing.JTextField textFieldCantidadUnidades;
    private javax.swing.JTextField textFieldCostoLibro;
    private javax.swing.JTextField textFieldISBN;
    private javax.swing.JTextField textFieldPrecioVentaLibro;
    private javax.swing.JTextField textFieldTituloLibro;
    // End of variables declaration//GEN-END:variables
}
