package com.project_coffee;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Tram Tran
 * CS55
 * Project_Coffee
 */
public class Project_Coffee {

    public static void main(String[] args) {
        //variables to take input from user
        Scanner input = new Scanner(System.in);
        int option, drink;
        
        //store all coffees created
        ArrayList<Coffee> coffees = new ArrayList<Coffee>();
        
        do
        {
            //print menu
            Menu();
            //get user input
            option = input.nextInt();
            //check valid input
            if(option != 1 && option != 2 && option != 3)
            {
                System.out.println("Invalid option. Please type again.");
                continue;
            }
            
            switch(option)
            {
                //create a drink
                case 1:
                    //print avaiable types of mocha
                    MochaMenu();
                    drink = input.nextInt();
                    if (drink == 1)
                    {
                        //create a Coffee Mocha object
                        CoffeeMocha cm = new CoffeeMocha();
                        //call ingredient() method to get ingredients from user
                        cm.ingredient();
                        //add object to ArrayList
                        coffees.add(cm);
                    }
                    else if (drink == 2)
                    {
                        //create a WhiteCocolateMocha object
                        WhiteChocolateMocha wc = new WhiteChocolateMocha();
                        //call ingredient() method to get ingredients from user
                        wc.ingredient();
                        //add object to ArrayList
                        coffees.add(wc);
                    }
                    else if (drink == 3)
                    {
                        //create a DarkCocolateMocha object
                        DarkChocolateMocha dc = new DarkChocolateMocha();
                        //call ingredient() method to get ingredients from user
                        dc.ingredient();
                        //add object to ArrayList
                        coffees.add(dc);
                    }
                    else if (drink == 4)
                    {
                        //create a PeppermintMocha object
                        PeppermintMocha pm = new PeppermintMocha();
                        //call ingredient() method to get ingredients from user
                        pm.ingredient();
                        //add object to ArrayList
                        coffees.add(pm);
                    }
                    else //invalid input
                    {
                        System.out.println("Invalid option.");
                    }
                    break;
                
                //display current coffees
                case 2:
                    //if empty ArrayList
                    if(coffees.isEmpty())
                        System.out.println("No coffee added.");
                    else
                    {
                        System.out.println("\n---Current Coffees---");
                        //iterate over the list and print each coffees
                        for(Coffee cf : coffees)
                        {
                            //call prepare method
                            cf.prepare();
                            //print price associated with the coffee
                            System.out.println("Price: " + cf.getPrice());
                        }
                    }
                    break;
                
                //quit program
                case 3:
                   System.out.println("\nDone.");
                   break;     
            }
        } while (option != 3);
    }
    
    public static void Menu() {
        System.out.println("\n---Menu---");
        System.out.println("1. Create a Mocha drink.");
        System.out.println("2. Display all drinks created.");
        System.out.println("3. Quit.");
        System.out.print("Please enter your choice: ");
    }
    
    public static void MochaMenu() {
        System.out.println("\n---Drink Menu---");
        System.out.println("1. Coffee Mocha");
        System.out.println("2. White Chocolate Mocha");
        System.out.println("3. Dark Chocolate Mocha");
        System.out.println("4. Peppermint Mocha ");
        System.out.print("Please enter your choice: ");
    }
}
