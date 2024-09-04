

package fawry.internship;


public class Bicycle extends products implements Vehicle{
    private int MaxSpeed;

    public Bicycle(String model, double price, int stock,int MaxSpeed) {
        super(model, price, stock);
        
        this.MaxSpeed=MaxSpeed;
        
    }

    @Override
    public int getMaxSpeed() {
        return MaxSpeed;
    }

   

   
    
    
    
    
}
