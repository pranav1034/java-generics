package com.bridgelabz.smartwarehouse;

public class Groceries extends WarehouseItem{
    private String category;

    public Groceries(String name, String category) {
        super(name);
        this.category = category;
    }

    @Override
    public void displayDetails() {
        System.out.println("Name: " + getName() + ", Category: " + category);
    }
}
