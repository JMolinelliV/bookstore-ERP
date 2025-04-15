//Lussich del Campo, Jeronimo (223693)
//Molinelli Verzi, Julian Antonio (218251)

package Interfaz;

import Dominio.InterfazUtils;
import Dominio.Sistema;
import java.util.Observable;
import java.util.Observer;
import javax.swing.table.DefaultTableModel;

public class VentanaRegistroEditorial extends javax.swing.JFrame implements Observer{

    private Sistema sistema;
    
    public VentanaRegistroEditorial(Sistema sistema) {
        this.sistema = sistema;
        this.sistema.addObserver(this);
        initComponents();
        InterfazUtils.actualizarTablaEditorial((DefaultTableModel) tablaRegistroEditorial.getModel(), sistema);
    }
    
    @Override
    public void update(Observable o, Object ob){
        InterfazUtils.actualizarTablaEditorial((DefaultTableModel) tablaRegistroEditorial.getModel(), sistema);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelNombreEditorial = new javax.swing.JLabel();
        labelPaisEditorial = new javax.swing.JLabel();
        textFieldNombreEditorial = new javax.swing.JTextField();
        textFieldPaisOrigenEditorial = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaRegistroEditorial = new javax.swing.JTable();
        btnRegistrarEditorial = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registro de Editorial");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(null);

        labelNombreEditorial.setText("Nombre:");
        getContentPane().add(labelNombreEditorial);
        labelNombreEditorial.setBounds(10, 10, 90, 20);

        labelPaisEditorial.setText("País de origen:");
        getContentPane().add(labelPaisEditorial);
        labelPaisEditorial.setBounds(10, 40, 90, 20);

        textFieldNombreEditorial.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        getContentPane().add(textFieldNombreEditorial);
        textFieldNombreEditorial.setBounds(110, 10, 280, 22);

        textFieldPaisOrigenEditorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldPaisOrigenEditorialActionPerformed(evt);
            }
        });
        getContentPane().add(textFieldPaisOrigenEditorial);
        textFieldPaisOrigenEditorial.setBounds(110, 40, 280, 22);

        tablaRegistroEditorial.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre editorial", "País editorial"
            }
        ));
        jScrollPane1.setViewportView(tablaRegistroEditorial);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 70, 380, 200);

        btnRegistrarEditorial.setText("Registrar Editorial");
        btnRegistrarEditorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarEditorialActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistrarEditorial);
        btnRegistrarEditorial.setBounds(120, 280, 140, 23);

        setBounds(300, 350, 410, 357);
    }// </editor-fold>//GEN-END:initComponents

    private void textFieldPaisOrigenEditorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldPaisOrigenEditorialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldPaisOrigenEditorialActionPerformed
        
    private void btnRegistrarEditorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarEditorialActionPerformed
        
        if(InterfazUtils.estaVacio(textFieldNombreEditorial))
        {
            InterfazUtils.popUps(this, false, "", "Casilla de nombre vacía.");
        }
        else if(InterfazUtils.estaVacio(textFieldPaisOrigenEditorial))
        {
            InterfazUtils.popUps(this, false, "", "El campo de país de origen está vacío.");
        }
        else
        {
            String nombre = textFieldNombreEditorial.getText().trim();
            String paisOrigen = textFieldPaisOrigenEditorial.getText();

            InterfazUtils.resetearCamposTexto(this);

            boolean editorialAgregada = sistema.agregarEditorial(nombre, paisOrigen);
            InterfazUtils.popUps(this, editorialAgregada, "Editorial creada exitosamente.", "La editorial ya se encuentra registrada.");
            DefaultTableModel model = (DefaultTableModel) tablaRegistroEditorial.getModel();
            InterfazUtils.actualizarTablaEditorial(model, sistema);

        }  
    }//GEN-LAST:event_btnRegistrarEditorialActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrarEditorial;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelNombreEditorial;
    private javax.swing.JLabel labelPaisEditorial;
    private javax.swing.JTable tablaRegistroEditorial;
    private javax.swing.JTextField textFieldNombreEditorial;
    private javax.swing.JTextField textFieldPaisOrigenEditorial;
    // End of variables declaration//GEN-END:variables
}
