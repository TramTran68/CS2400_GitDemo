package com.project_coffee;

/**
 * @author Tram Tran
 * CS55
 * Project_Coffee
 */

abstract class Coffee implements howToMakeCoffee {
    private String coffeeType;
    private double price;
    private String storeName;
    
    //constructor to set values to variables
    public Coffee(String type, double price) 
    {
        this.coffeeType = type;
        this.price = price;
        this.storeName = "Java Coffee Shop";
    }
    
    //getters and setters for all variables
    public String getCoffeeType() {
        return coffeeType;
    }
    public void setCoffeeType(String type){
        this.coffeeType = type;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public String getStoreName() {
        return storeName;
    }
    public void setStoreName(String store){
        this.storeName = store;
    }
    
    @Override
    public void prepare() {
        System.out.println("Coffee Type :" + coffeeType);
    }
    
    abstract void ingredient();
}
