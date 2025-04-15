//Lussich del Campo, Jeronimo (223693)
//Molinelli Verzi, Julian Antonio (218251)

package GestorDeLibreria;

import Interfaz.*;
import Dominio.*;
import javax.swing.JOptionPane;
import java.io.IOException;

public class GestorDeLibreria {
    public static void main(String[] args) {
        Sistema sistema;

        int opcion = JOptionPane.showConfirmDialog(null, 
            "¿Desea cargar los datos de la última sesión?", 
            "Inicializar sistema", 
            JOptionPane.YES_NO_OPTION);

        if (opcion == JOptionPane.YES_OPTION) {
            try {
                sistema = new Sistema().loadSistema("sistema.ser");
                JOptionPane.showMessageDialog(null, "Sistema previo fue cargado exitosamente.");
            } catch (IOException | ClassNotFoundException e) {
                JOptionPane.showMessageDialog(null, "Archivo fallo al abrir.");
                sistema = new Sistema();
            }
        } else {
            sistema = new Sistema();
            JOptionPane.showMessageDialog(null, "Inicializando un sistema nuevo.");
        }

        VentanaMenu menuInicial = new VentanaMenu(sistema);
        menuInicial.setVisible(true);
    }
}
