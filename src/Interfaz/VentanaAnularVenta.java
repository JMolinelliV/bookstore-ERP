//Lussich del Campo, Jeronimo (223693)
//Molinelli Verzi, Julian Antonio (218251)

package Interfaz;

import Dominio.InterfazUtils;
import Dominio.Factura;
import Dominio.Sistema;
import javax.swing.JOptionPane;

public class VentanaAnularVenta extends javax.swing.JFrame {
    private Sistema sistema;

    public VentanaAnularVenta(Sistema sistema) {
        this.sistema = sistema;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AnularVenta = new javax.swing.JPanel();
        jLabelNumeroFactura = new javax.swing.JLabel();
        jTextFieldNumeroFactura = new javax.swing.JTextField();
        jButtonAnularVenta = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Anular venta");

        jLabelNumeroFactura.setText("Número de factura ");

        jButtonAnularVenta.setText("Anular");
        jButtonAnularVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAnularVentaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout AnularVentaLayout = new javax.swing.GroupLayout(AnularVenta);
        AnularVenta.setLayout(AnularVentaLayout);
        AnularVentaLayout.setHorizontalGroup(
            AnularVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AnularVentaLayout.createSequentialGroup()
                .addGroup(AnularVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AnularVentaLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabelNumeroFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldNumeroFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(AnularVentaLayout.createSequentialGroup()
                        .addGap(207, 207, 207)
                        .addComponent(jButtonAnularVenta)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        AnularVentaLayout.setVerticalGroup(
            AnularVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AnularVentaLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(AnularVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNumeroFactura)
                    .addComponent(jTextFieldNumeroFactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(jButtonAnularVenta)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 515, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(AnularVenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 134, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(AnularVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAnularVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAnularVentaActionPerformed
        String textoNumFactura = jTextFieldNumeroFactura.getText();
        int numeroDeFactura = 0;
        try {
            numeroDeFactura = Integer.parseInt(textoNumFactura);  
        } catch (NumberFormatException e){
            InterfazUtils.popUps(this, false, "", "El campo número de factura está vacío.");
            return;
        }
        
        Factura facturaAnular = sistema.getFacturaPorNumero(numeroDeFactura);
        
        if(facturaAnular != null){
            int respuesta = JOptionPane.showConfirmDialog(
                    this,
                    "¿Seguro desea anular la factura?\n\n" + facturaAnular.toString(),
                    "Anulación de venta",
                    JOptionPane.YES_NO_OPTION
            );
            
            if(respuesta == JOptionPane.YES_OPTION){
                sistema.actualizarStockAnulacion(facturaAnular);
                sistema.removerFactura(facturaAnular);
                InterfazUtils.popUps(this, true, "Factura eliminada correctamente.", "");
                InterfazUtils.resetearCamposTexto(this);
            } else if(respuesta == JOptionPane.NO_OPTION){
                InterfazUtils.popUps(this, false, "", "Anulación cancelada.");
            }
        } else {
            InterfazUtils.popUps(this, false, "", "La factura no existe.");
        }
    }//GEN-LAST:event_jButtonAnularVentaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AnularVenta;
    private javax.swing.JButton jButtonAnularVenta;
    private javax.swing.JLabel jLabelNumeroFactura;
    private javax.swing.JTextField jTextFieldNumeroFactura;
    // End of variables declaration//GEN-END:variables
}
