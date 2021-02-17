/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package abstracts;

/**
 *
 * @author cpitaama91008
 */
public class Car extends Vehicle{
      String trans;
      
      Car(){
          super("", 1);
          this.trans = trans;
      }
      
      
      public Car(String trans){
          super("4W",150);
          this.trans = trans;
      }
      
      Car(String type, int maxSpeed, String trans){
          super(type, maxSpeed);
          this.trans = trans;
      }
}

class Vehicle{
    String type = "4W";
    int maxSpeed = 100;

    public Vehicle(String type,int maxSpeed) {
        this.type  = type;
        this.maxSpeed = maxSpeed;
    }

    
    
    
    
    
    
    
}
