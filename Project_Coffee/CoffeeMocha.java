package com.project_coffee;

/**
 * @author Tram Tran
 * CS55
 * Project_Coffee
 */

import java.util.Scanner;

public class CoffeeMocha extends Coffee {
    private String ing[]; //array of strings storing ingredients 
    
    //constructor
    public CoffeeMocha() {
        super("Coffee Mocha", 6.0);
    }
    
    @Override
    //overriding method ingredient() to get ingredients from user
    void ingredient(){
        Scanner sc = new Scanner(System.in);
        //input no. of ingredients
        System.out.print("Enter the number of ingredients: ");
        int num = sc.nextInt();
        sc.nextLine();
        //input the ingredients
        System.out.println("Enter ingredients (separated by enters) :");
        ing = new String[num];
        for(int i=0;i<num;i++){
            ing[i] = sc.nextLine();
        }
    }
    
    @Override
    public void prepare(){
        //print the Coffee type
        System.out.println("\nCoffee type: " + super.getCoffeeType());
        
        //print the ingredients
        System.out.println("Ingredients:");
        for(int i = 0; i< ing.length; i++){
            if(i == ing.length - 1)
                System.out.println(ing[i] + ".");
            else
                System.out.print(ing[i] + ", ");
        }
    }
}
