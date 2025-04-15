//Lussich del Campo, Jeronimo (223693)
//Molinelli Verzi, Julian Antonio (218251)

package Dominio;

import java.awt.Component;
import java.awt.Container;
import java.util.*;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.JTextComponent;


public class InterfazUtils {
    
    private Sistema sistema;
    
    
    public InterfazUtils(Sistema sistema)
    {
        this.sistema = sistema;
    }
    
    public static void actualizarTablaEditorial(DefaultTableModel tablemodel, Sistema sistema) {
        tablemodel.setRowCount(0);

        for (Editorial editorial : sistema.getListaDeEditoriales()) {
            tablemodel.addRow(new Object[]{editorial.getNombre(), editorial.getPais()});
        }
    }
    
    public static void actualizarListaEditorial(DefaultListModel<Editorial> listModel, Sistema sistema) {
        listModel.clear();
        for (Editorial editorial : sistema.getListaDeEditoriales()) {
            listModel.addElement(editorial);
        }
    }
    
    public static void actualizarListaAutores(DefaultListModel<Autor> listModel, List<Autor> autores, Sistema sistema) {
        listModel.clear();

        for (Autor autor : autores) {
            listModel.addElement(autor);
        }
    }
    
    //Metodo para resetar los JTextFields y JTextArea de un JFrame -- GPT
    public static void resetearCamposTexto(Container container) {
        for (Component component : container.getComponents()) {
            if (component instanceof JTextComponent textComponent) {
                textComponent.setText("");
            } else if (component instanceof Container container1) {
                resetearCamposTexto(container1);
            }
        }
    }

    //Metodo para lanzar mensajes de informacion
    public static void popUps(Component ventana, boolean condicion, String mensajeOk, String mensajeError){
        if (condicion){
            JOptionPane.showMessageDialog(ventana, mensajeOk, "Exito",JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(ventana, mensajeError, "Error",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    //Verificar contenido de los JTextComponent
    public static boolean estaVacio(JTextComponent textComponent){
        return textComponent.getText().trim().isEmpty();
    }
    
    //Verificar si el texto ingresado es un numero
    public static boolean esNumeroValido(String texto) {
        try {
            Integer.valueOf(texto.trim());
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
