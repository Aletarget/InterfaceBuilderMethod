/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Concrete_builder;

/**
 *
 * @author jorge malaver
 */
import Abstraccion.*;
import Productos .*;
public class Camion_uno extends CamionBuilder{
    
   @Override
   public void builmotor(){
       Camion.setmotor("Motor cummis");
   }
   
   @Override
   public void builcarroceria(){
    
       Camion.setcarroceria("De lujo");
   }
   
   @Override
   public void builruedas(){
       
       Camion.setruedas("Gran tamano");
   }
}
