package com.bridgelabz.smartwarehouse;

class Electronics extends WarehouseItem {
    private String brand;

    public Electronics(String name, String brand) {
        super(name);
        this.brand = brand;
    }
    @Override
    public void displayDetails() {
        System.out.println("Name: " + getName() + ", Brand: " + brand);
    }

}
