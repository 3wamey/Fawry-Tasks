

package fawry.internship;


public class Fridge extends products{
    
    private int freezingdegree;

    public Fridge(String model, double price, int stock,int freezingdegree ) {
        super(model, price, stock);
         this.freezingdegree=freezingdegree;
        
    }

   
    
    
    
}
