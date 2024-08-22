
package practica_builder;

/**
 *
 * @author jorge malaver
 */
import Abstraccion.*;
import Productos .*;
import Concrete_builder.*;
import Vista.VentanaInicial;
import javax.swing.SwingUtilities;
public class Practica_builder {

    
    public static void main(String[] args) {
        // Ejecutar la aplicación
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new VentanaInicial().setVisible(true);
            }
        });
    }
    
}
