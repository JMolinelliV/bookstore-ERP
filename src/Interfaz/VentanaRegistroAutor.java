//Lussich del Campo, Jeronimo (223693)
//Molinelli Verzi, Julian Antonio (218251)

package Interfaz;

import Dominio.InterfazUtils;
import Dominio.Autor;
import Dominio.Genero;
import Dominio.Sistema;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;
import javax.swing.DefaultListModel;

public class VentanaRegistroAutor extends javax.swing.JFrame implements Observer {
    private Sistema sistema;
    
    public VentanaRegistroAutor(Sistema sistema) {
        this.sistema = sistema;
        this.sistema.addObserver(this);
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

        labelRegistroNUevoAutor = new java.awt.Label();
        textFieldNombreAutor = new javax.swing.JTextField();
        labelNombreAutor = new javax.swing.JLabel();
        textFieldNacionalidadAutor = new javax.swing.JTextField();
        labelNacionalidadAutor = new javax.swing.JLabel();
        labelGenerosAutor = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaGenerosAutor = new javax.swing.JList<>();
        btnRegistrarAutor = new javax.swing.JButton();
        labelAutoresRegistrados = new java.awt.Label();
        jScrollPane2 = new javax.swing.JScrollPane();
        listAutoresRegistrados = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registro de Autores");

        labelRegistroNUevoAutor.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        labelRegistroNUevoAutor.setText("Registro de nuevo autor");

        labelNombreAutor.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        labelNombreAutor.setText("Nombre:");

        textFieldNacionalidadAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldNacionalidadAutorActionPerformed(evt);
            }
        });

        labelNacionalidadAutor.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        labelNacionalidadAutor.setText("Nacionalidad:");

        labelGenerosAutor.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        labelGenerosAutor.setText("Géneros:");

        listaGenerosAutor.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(listaGenerosAutor);

        btnRegistrarAutor.setText("Registrar");
        btnRegistrarAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarAutorActionPerformed(evt);
            }
        });

        labelAutoresRegistrados.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        labelAutoresRegistrados.setText("Autores registrados");

        listAutoresRegistrados.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(listAutoresRegistrados);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelNacionalidadAutor)
                                    .addComponent(labelNombreAutor)
                                    .addComponent(labelGenerosAutor))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(textFieldNombreAutor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE)
                                    .addComponent(textFieldNacionalidadAutor, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1)))
                            .addComponent(labelRegistroNUevoAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelAutoresRegistrados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(btnRegistrarAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelRegistroNUevoAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldNombreAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNombreAutor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textFieldNacionalidadAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNacionalidadAutor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelGenerosAutor)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnRegistrarAutor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelAutoresRegistrados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(94, Short.MAX_VALUE))
        );

        setBounds(0, 0, 437, 497);
    }// </editor-fold>//GEN-END:initComponents

    private void textFieldNacionalidadAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldNacionalidadAutorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldNacionalidadAutorActionPerformed
    
    private void actualizarListas(){
        actualizarListaAutores();
        actualizarListaGeneros();
    }
    
    private void actualizarListaGeneros() {
        DefaultListModel<String> lista = new DefaultListModel<>();
        for (Genero genero : sistema.getListaGeneros()){
            lista.addElement(genero.getNombre());
        }
        listaGenerosAutor.setModel(lista);
    }
    
    private void actualizarListaAutores() {
        DefaultListModel<String> lista = new DefaultListModel<>();
        for (Autor autor : sistema.getListaDeAutores()){
            lista.addElement("Nombre: " + autor.getNombre() + " - Nacionalidad: "  + autor.getPaisDeOrigen());
        }
        listAutoresRegistrados.setModel(lista);
    }
    
    private void btnRegistrarAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarAutorActionPerformed
        
        if(InterfazUtils.estaVacio(textFieldNombreAutor))
        {
            InterfazUtils.popUps(this, false, "", "Casilla de nombre vacía.");
        }
        else if(InterfazUtils.estaVacio(textFieldNacionalidadAutor))
        {
            InterfazUtils.popUps(this, false, "", "El campo de país de origen está vacío.");
        }
        else if(listaGenerosAutor.isSelectionEmpty()) {
            InterfazUtils.popUps(this, false, "", "Debe seleccionar un género o registrar uno si no hay ninguno.");         
        }
        else
        {
            String nombre = textFieldNombreAutor.getText().trim();
            String paisDeOrigen = textFieldNacionalidadAutor.getText();
            ArrayList<Genero> generosDelAutor = new ArrayList<>();
        
            int[] selectedIndices = listaGenerosAutor.getSelectedIndices();
            for (int index : selectedIndices) {
                String generoNombre = listaGenerosAutor.getModel().getElementAt(index);

                for (Genero genero : sistema.getListaGeneros()) {
                    if (genero.getNombre().equals(generoNombre)) {
                        generosDelAutor.add(genero);
                    }
                }
            }
            boolean autorAgregado = sistema.agregarAutor(nombre, paisDeOrigen, generosDelAutor);
            InterfazUtils.popUps(this,autorAgregado, "Autor agregado correctamente.", "El autor ya se encuentra registrado.");
            InterfazUtils.resetearCamposTexto(this);        
            actualizarListaAutores();
        }
        
    }//GEN-LAST:event_btnRegistrarAutorActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrarAutor;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private java.awt.Label labelAutoresRegistrados;
    private javax.swing.JLabel labelGenerosAutor;
    private javax.swing.JLabel labelNacionalidadAutor;
    private javax.swing.JLabel labelNombreAutor;
    private java.awt.Label labelRegistroNUevoAutor;
    private javax.swing.JList<String> listAutoresRegistrados;
    private javax.swing.JList<String> listaGenerosAutor;
    private javax.swing.JTextField textFieldNacionalidadAutor;
    private javax.swing.JTextField textFieldNombreAutor;
    // End of variables declaration//GEN-END:variables
}
