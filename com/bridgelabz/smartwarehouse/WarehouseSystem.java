package com.bridgelabz.smartwarehouse;

public class WarehouseSystem {
    public static void main(String[] args) {
        Storage<Electronics> electronicsStorage = new Storage<>();
        electronicsStorage.addItem(new Electronics("Laptop","Dell"));
        electronicsStorage.addItem(new Electronics("Smartphone","Samsung"));

        Storage<Groceries> groceriesStorage = new Storage<>();
        groceriesStorage.addItem(new Groceries("Dairy Milk","Sweets"));
        groceriesStorage.addItem(new Groceries("Apple","Fruits"));

        Storage<Furniture> furnitureStorage = new Storage<>();
        furnitureStorage.addItem(new Furniture("Table","Wood"));
        furnitureStorage.addItem(new Furniture("Chair","Plastic"));

        System.out.println("\nItems stored in electronics: ");
        WarehouseManager.displayItems(electronicsStorage.getItems());

        System.out.println("\nItems stored in groceries: ");
        WarehouseManager.displayItems(groceriesStorage.getItems());

        System.out.println("\nItems stored in furniture: ");
        WarehouseManager.displayItems(furnitureStorage.getItems());
    }
}
