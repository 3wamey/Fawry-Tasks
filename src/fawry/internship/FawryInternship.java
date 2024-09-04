/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fawry.internship;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
public class FawryInternship {

    
    public static void main(String[] args) {
       
    
     Car c1=new Car("Ferrari S.p.A.",100000,280,"electric",5);
        Motorbike b1 = new Motorbike("Sportsbike", 15000,3 , 250);
        Bicycle b2 = new Bicycle("BMX bikes", 30000, 60, 260);
        Fridge f = new Fridge("Toshiba Freezer", 1200, 8, 3);
        TV tv = new TV("LG", 2000, 55, 4);

        
         List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(c1);
        vehicles.add(b1);
        vehicles.add(b2);

       List<products> products = new ArrayList<>();
        products.add(c1);
        products.add(f);
        products.add(tv);
         List<Integer> quantities = Arrays.asList(1, 2, 1);
         
        Vehicle fastestVehicle = ShopUtils.getFastest(vehicles);
        System.out.println("Fastest Vehicle: " + fastestVehicle.getClass().getSimpleName() + " with max speed of " + fastestVehicle.getMaxSpeed() + " km/h");
       
         try {
            double totalPrice = ShopUtils.calculatePrice(products, quantities);
            System.out.println("Total Price: $" + totalPrice);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        
   
    }
    
}
