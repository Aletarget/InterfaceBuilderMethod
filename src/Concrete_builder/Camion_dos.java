
package Concrete_builder;

/**
 *
 * @author jorge malaver
 */
import Abstraccion.*;
import Productos .*;
public class Camion_dos extends CamionBuilder{
   
     @Override
   public void builmotor(){
       Camion.setmotor("Motor normal");
   }
   
   @Override
   public void builcarroceria(){
    
       Camion.setcarroceria("corriente");
   }
   
   @Override
   public void builruedas(){
       
       Camion.setruedas("medianas");
   }
    
    
}
