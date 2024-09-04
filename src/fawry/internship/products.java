/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fawry.internship;

import java.util.List;

/**
 *
 * @author Abo Baker
 */
abstract class products {
    
protected String model;
protected double price;
protected int stock;


public products(String model,double price,int stock){

this.model=model;
this.price=price;
this.stock=stock;
}

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

   public int getStock() {
        return stock;
    }


public void reduceStock(int quantity) {
        if (quantity > stock) {
            throw new IllegalArgumentException("There is no more " + model);
        }
        stock -= quantity;
    }

   




   
      }



















