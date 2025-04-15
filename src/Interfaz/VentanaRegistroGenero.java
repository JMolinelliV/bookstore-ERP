//Lussich del Campo, Jeronimo (223693)
//Molinelli Verzi, Julian Antonio (218251)

package Interfaz;

import Dominio.InterfazUtils;
import Dominio.Genero;
import Dominio.Sistema;
import java.util.Observable;
import java.util.Observer;
import javax.swing.DefaultListModel;

public class VentanaRegistroGenero extends javax.swing.JFrame implements Observer {
    private Sistema sistema;
    
    public VentanaRegistroGenero(Sistema sistema) {
        this.sistema = sistema;
        this.sistema.addObserver(this);
        initComponents();
        actualizarListaGeneros();
    }
    
    @Override
    public void update(Observable o, Object ob){
        actualizarListaGeneros();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelNombreGenero = new javax.swing.JLabel();
        labelDescripcionGenero = new javax.swing.JLabel();
        textFieldNombreGenero = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        textAreaDescripcionGenero = new javax.swing.JTextArea();
        labelGenerosRegistrados = new java.awt.Label();
        labelRegistrarNuevoGenero = new java.awt.Label();
        jScrollPane2 = new javax.swing.JScrollPane();
        listGenerosRegistrados = new javax.swing.JList<>();
        jButtonRegistrarGenero = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registro de Géneros");
        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(480, 520));
        setSize(new java.awt.Dimension(400, 450));

        labelNombreGenero.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        labelNombreGenero.setText("Nombre:");

        labelDescripcionGenero.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        labelDescripcionGenero.setText("Descripción:");

        textAreaDescripcionGenero.setColumns(20);
        textAreaDescripcionGenero.setRows(5);
        jScrollPane1.setViewportView(textAreaDescripcionGenero);

        labelGenerosRegistrados.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        labelGenerosRegistrados.setText("Géneros registrados");

        labelRegistrarNuevoGenero.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        labelRegistrarNuevoGenero.setText("Registro de nuevo género");

        listGenerosRegistrados.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(listGenerosRegistrados);

        jButtonRegistrarGenero.setText("Registrar");
        jButtonRegistrarGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistrarGeneroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelRegistrarNuevoGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelGenerosRegistrados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelNombreGenero)
                                    .addComponent(labelDescripcionGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textFieldNombreGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(jButtonRegistrarGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(10, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(labelRegistrarNuevoGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textFieldNombreGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNombreGenero))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelDescripcionGenero)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelGenerosRegistrados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonRegistrarGenero)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        setBounds(0, 0, 422, 441);
    }// </editor-fold>//GEN-END:initComponents

    private void actualizarListaGeneros() {
        DefaultListModel<String> lista = new DefaultListModel<>();
        for (Genero genero : sistema.getListaGeneros()) {
            lista.addElement(genero.getNombre() + ": " + genero.getDescripcion());
        }
        listGenerosRegistrados.setModel(lista);
    }
    
    private void jButtonRegistrarGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistrarGeneroActionPerformed
        if(InterfazUtils.estaVacio(textFieldNombreGenero))
        {
            InterfazUtils.popUps(this, false,"", "El campo de nombre está vacío.");
        }
        else if(InterfazUtils.estaVacio(textAreaDescripcionGenero))
        {
            InterfazUtils.popUps(this, false,"", "El campo de descripcion está vacío.");
        }
        else
        {
            String nombre = textFieldNombreGenero.getText().trim();
            String descripcion = textAreaDescripcionGenero.getText();

            boolean generoAgregado = sistema.agregarGenero(nombre, descripcion);
            InterfazUtils.popUps(this,generoAgregado,"Género creado exitosamente.","El género ya se encuentra registrado.");
            actualizarListaGeneros();
            InterfazUtils.resetearCamposTexto(this);
        }
    }//GEN-LAST:event_jButtonRegistrarGeneroActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonRegistrarGenero;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelDescripcionGenero;
    private java.awt.Label labelGenerosRegistrados;
    private javax.swing.JLabel labelNombreGenero;
    private java.awt.Label labelRegistrarNuevoGenero;
    private javax.swing.JList<String> listGenerosRegistrados;
    private javax.swing.JTextArea textAreaDescripcionGenero;
    private javax.swing.JTextField textFieldNombreGenero;
    // End of variables declaration//GEN-END:variables
}
