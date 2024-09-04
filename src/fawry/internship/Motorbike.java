

package fawry.internship;


public class Motorbike extends products implements Vehicle{
    
    private int MaxSpeed;

    public Motorbike(String model, double price, int stock,int MaxSpeed) {
        super(model, price, stock);
        this.MaxSpeed= MaxSpeed;
        
    }

    @Override
    public int getMaxSpeed() {
        return MaxSpeed;
    }

   

    
    
   
    
}
