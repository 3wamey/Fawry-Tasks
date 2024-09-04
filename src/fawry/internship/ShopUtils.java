/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fawry.internship;

import java.util.List;

public class ShopUtils {
    public static Vehicle getFastest(List<Vehicle> vehicles) {
        if (vehicles.isEmpty()) {
            throw new IllegalArgumentException("The list is empty");
        }

        Vehicle fastest = vehicles.get(0);

        for (Vehicle vehicle : vehicles) {
            if (vehicle.getMaxSpeed() > fastest.getMaxSpeed()) {
                fastest = vehicle;
            }
        }

        return fastest;
    }



 public static double calculatePrice(List<products> products, List<Integer> quantities) {
        if (products.size() != quantities.size()) {
            throw new IllegalArgumentException("Product list and quantity list must have the same size");
        }

        double totalPrice = 0;

        for (int i = 0; i < products.size(); i++) {
            products product = products.get(i);
            int quantity = quantities.get(i);

            if (quantity > product.getStock()) {
                throw new IllegalArgumentException("Not enough stock for " + product.getModel());
            }

            totalPrice += product.getPrice() * quantity;
            product.reduceStock(quantity);  
        }

        return totalPrice;
    }

}









   


