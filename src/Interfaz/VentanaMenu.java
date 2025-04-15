//Lussich del Campo, Jeronimo (223693)
//Molinelli Verzi, Julian Antonio (218251)

package Interfaz;

import Dominio.InterfazUtils;
import Dominio.Sistema;
import java.io.IOException;

public class VentanaMenu extends javax.swing.JFrame {
    private Sistema sistema;
    
    public VentanaMenu(Sistema sistema) {
        this.sistema = sistema;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuBarPrincipal = new javax.swing.JMenuBar();
        menuRegistros = new javax.swing.JMenu();
        menuItemRegistroEditorial = new javax.swing.JMenuItem();
        menuItemRegistroGenero = new javax.swing.JMenuItem();
        menuItemRegistroAutor = new javax.swing.JMenuItem();
        menuItemRegistroLibro = new javax.swing.JMenuItem();
        menuVentas = new javax.swing.JMenu();
        menuItemRegistrarVenta = new javax.swing.JMenuItem();
        menuItemAnularVenta = new javax.swing.JMenuItem();
        menuConsultas = new javax.swing.JMenu();
        menuConsultaDeLibros = new javax.swing.JMenuItem();
        menuConsultaDeVentas = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestión de Librerías - Realizado por: Lussich del Campo, Jeronimo (223693) y Molinelli Verzi, Julian Antonio (218251)");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(null);

        menuRegistros.setText("Registros");

        menuItemRegistroEditorial.setText("Registrar editorial");
        menuItemRegistroEditorial.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        menuItemRegistroEditorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemRegistroEditorialActionPerformed(evt);
            }
        });
        menuRegistros.add(menuItemRegistroEditorial);

        menuItemRegistroGenero.setText("Registrar género");
        menuItemRegistroGenero.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        menuItemRegistroGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemRegistroGeneroActionPerformed(evt);
            }
        });
        menuRegistros.add(menuItemRegistroGenero);

        menuItemRegistroAutor.setText("Registrar autor");
        menuItemRegistroAutor.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        menuItemRegistroAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemRegistroAutorActionPerformed(evt);
            }
        });
        menuRegistros.add(menuItemRegistroAutor);

        menuItemRegistroLibro.setText("Registrar libro");
        menuItemRegistroLibro.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        menuItemRegistroLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemRegistroLibroActionPerformed(evt);
            }
        });
        menuRegistros.add(menuItemRegistroLibro);

        menuBarPrincipal.add(menuRegistros);

        menuVentas.setText("Ventas");

        menuItemRegistrarVenta.setText("Registrar venta");
        menuItemRegistrarVenta.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        menuItemRegistrarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemRegistrarVentaActionPerformed(evt);
            }
        });
        menuVentas.add(menuItemRegistrarVenta);

        menuItemAnularVenta.setText("Anular venta");
        menuItemAnularVenta.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        menuItemAnularVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemAnularVentaActionPerformed(evt);
            }
        });
        menuVentas.add(menuItemAnularVenta);

        menuBarPrincipal.add(menuVentas);

        menuConsultas.setText("Consultas");

        menuConsultaDeLibros.setText("Libros");
        menuConsultaDeLibros.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        menuConsultaDeLibros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuConsultaDeLibrosActionPerformed(evt);
            }
        });
        menuConsultas.add(menuConsultaDeLibros);

        menuConsultaDeVentas.setText("Ventas");
        menuConsultaDeVentas.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        menuConsultaDeVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuConsultaDeVentasActionPerformed(evt);
            }
        });
        menuConsultas.add(menuConsultaDeVentas);

        menuBarPrincipal.add(menuConsultas);

        setJMenuBar(menuBarPrincipal);

        setBounds(0, 0, 414, 307);
    }// </editor-fold>//GEN-END:initComponents

    private void menuItemRegistroGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemRegistroGeneroActionPerformed
        VentanaRegistroGenero ventanaRegistroGenero = new VentanaRegistroGenero(sistema);
        ventanaRegistroGenero.setVisible(true);
    }//GEN-LAST:event_menuItemRegistroGeneroActionPerformed

    private void menuItemRegistroAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemRegistroAutorActionPerformed
        VentanaRegistroAutor ventanaRegistroAutor = new VentanaRegistroAutor(sistema);
        ventanaRegistroAutor.setVisible(true);
    }//GEN-LAST:event_menuItemRegistroAutorActionPerformed

    private void menuItemRegistroLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemRegistroLibroActionPerformed
        VentanaRegistroLibro ventanaRegistroLibro = new VentanaRegistroLibro(sistema);
        ventanaRegistroLibro.setVisible(true);
    }//GEN-LAST:event_menuItemRegistroLibroActionPerformed

    private void menuItemAnularVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemAnularVentaActionPerformed
        VentanaAnularVenta ventanaAnularVenta = new VentanaAnularVenta(sistema);
        ventanaAnularVenta.setVisible(true);
    }//GEN-LAST:event_menuItemAnularVentaActionPerformed

    private void menuItemRegistrarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemRegistrarVentaActionPerformed
        VentanaVentaDeLibros ventanaVentaDeLibros = new VentanaVentaDeLibros(sistema);
        ventanaVentaDeLibros.setVisible(true);
    }//GEN-LAST:event_menuItemRegistrarVentaActionPerformed

    private void menuConsultaDeLibrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuConsultaDeLibrosActionPerformed
        VentanaConsultaDeLibros ventanaConsultaDeLibros = new VentanaConsultaDeLibros(sistema);
        ventanaConsultaDeLibros.setVisible(true);
    }//GEN-LAST:event_menuConsultaDeLibrosActionPerformed

    private void menuConsultaDeVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuConsultaDeVentasActionPerformed
        VentanaConsultaDeVentas ventanaConsultaDeVentas = new VentanaConsultaDeVentas(sistema);
        ventanaConsultaDeVentas.setVisible(true);
    }//GEN-LAST:event_menuConsultaDeVentasActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        try {
            sistema.saveSistema();
            InterfazUtils.popUps(this, true, "Archivo creado correctamente.", "");
        } catch (IOException ex) {
            InterfazUtils.popUps(this, false, "", "Archivo fallo al guardar.");
        }
    }//GEN-LAST:event_formWindowClosing

    private void menuItemRegistroEditorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemRegistroEditorialActionPerformed
        VentanaRegistroEditorial ventanaRegistroEditorial = new VentanaRegistroEditorial(sistema);
        ventanaRegistroEditorial.setVisible(true);
    }//GEN-LAST:event_menuItemRegistroEditorialActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar menuBarPrincipal;
    private javax.swing.JMenuItem menuConsultaDeLibros;
    private javax.swing.JMenuItem menuConsultaDeVentas;
    private javax.swing.JMenu menuConsultas;
    private javax.swing.JMenuItem menuItemAnularVenta;
    private javax.swing.JMenuItem menuItemRegistrarVenta;
    private javax.swing.JMenuItem menuItemRegistroAutor;
    private javax.swing.JMenuItem menuItemRegistroEditorial;
    private javax.swing.JMenuItem menuItemRegistroGenero;
    private javax.swing.JMenuItem menuItemRegistroLibro;
    private javax.swing.JMenu menuRegistros;
    private javax.swing.JMenu menuVentas;
    // End of variables declaration//GEN-END:variables
}
