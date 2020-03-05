/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dog;

public class Dog {
    //variables for characteristics

    private String make, model,color;
    private int price, year, maxSpeed;
    //aggression = 5; this is bad :(

    //constructors
    public Dog() {
        make = "Cheve";
        model = "Camaro";
        color = "Red";
        price = 0;
        year = 0;
        maxSpeed = 265; 
    }

    public Dog(String brand, String mdl, String colour, int est, int cost) {
        make = brand;
        model = mdl;
        color = colour; 
        year = est;
        price = cost;
    }

    //Alternate constructor
    public Dog(String brand, String mdl, String colour) {
        //This constructor only uses the name and breed
        //Set the aggression and hunger to random #s
        make = brand;
        model = mdl;
        color = colour;
        price = (int) (Math.random() * 15000) + 1;
        year = (int) (Math.random() * 2000) + 1;
    }
       /**
     * This method allows the user to set the aggression of the dog
     * pre: needs an aggression value
     * post: sets the aggression value
     */
    public int getAggression(){
        return price;
    }
    /**
     * This method allows the user to set the aggression of the dog
     * pre: needs an aggression value
     * post: sets the aggression value
     */
    public void setAggression(int aggress){
        price = aggress;
    }
    /**
     * This method allows for a dog to friendly bark
     * pre: none
     * post: the dog object barks
     */

    public void honkHorn() {
        System.out.println("Beep! Beep!");
    }

    //method to display all info of the Dog
    public String toString() {
        String output = "Name: " + make + "\n";
        output += "Breed: " + model + "\n";
        output += "Color: " + color + "\n";
        output += "Price: " + price + "\n";
        output += "Year: " + year + "\n";
        output += "MaxSpeed: " + maxSpeed + "\n"; 
        //output string is complete, return it
        return output;
    }
}
