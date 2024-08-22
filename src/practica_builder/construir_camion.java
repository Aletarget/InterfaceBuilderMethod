
 package practica_builder;

/**
 *
 * @author jorge malaver
 */
import Concrete_builder.*;
import Productos.*;
import Abstraccion.*;
public class construir_camion {
    
    private CamionBuilder nuevo;
    
    public void setcamionBuilder(CamionBuilder op ){
        
        nuevo= op;
    }
    
    public camion getcamion(){
        return nuevo.getcamion();
    }
    
    public void fabrica_camion(){
        nuevo.ConstruirCamion();
        nuevo.builmotor();
        nuevo.builcarroceria();
        nuevo.builruedas();
    }
}
