package com.bridgelabz.smartwarehouse;

public class Furniture extends WarehouseItem {
    private String material;

    public Furniture(String name, String material) {
        super(name);
        this.material = material;
    }

    @Override
    public void displayDetails() {
        System.out.println("Name: " + getName() + ", Material: " + material);
    }
}
