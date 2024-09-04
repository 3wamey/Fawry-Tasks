

package fawry.internship;


public class Car extends products implements Vehicle{
    private int MaxSpeed;
    private String engineType;

    public Car(String model, double price, int MaxSpeed , String engineType, int stock) {
        super(model, price, stock);
         this.MaxSpeed = MaxSpeed;
        this.engineType = engineType;
        
    }

    @Override
    public int getMaxSpeed() {
        return MaxSpeed;
    }

 

   
    
    
    
    
    
}
