/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dog;

import static dog.dogtester.Dog.honkHorn;

public class dogtester {

    public static void main(String[] args) {
        Dog dog1 = new Dog("Rover", "Spaniel");
        Dog dog2 = new Dog("Spot", "Border Collie");
        Dog dog3 = new Dog("josh","pitbull");
        
        //dog1.name = "spot";
        dog1.setAggression(1);
        System.out.println(dog1.getAggression());
        System.out.println(dog2.getAggression());
        System.out.println(dog3.getAggression());

        //Print the details of each dog
        System.out.println(dog1.toString());
        System.out.println("--------------------------");

        System.out.println(dog2.toString());
        System.out.println("--------------------------");

        //toString is called by default, no need to write it!
        System.out.println(dog3);
        System.out.println("--------------------------");

        //dog1 barks friendly, dog2 barks angry
        dog1.honkHorn();
       
    }
}