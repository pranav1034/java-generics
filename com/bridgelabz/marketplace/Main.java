package com.bridgelabz.marketplace;

public class Main {
    public static void main(String[] args) {
        //Create category objects
        Gadgets gadgets = new Gadgets();
        Clothing clothing = new Clothing();
        Books books = new Books();

        //Create product objects
        Product<Books> book = new Product<>("The Fault In Our Stars", 100, books);
        Product<Clothing> shirt = new Product<>("T-Shirt", 30, clothing);
        Product<Gadgets> smartphone = new Product<>("Smartphone", 700, gadgets);

        //Creating a store
        ProductStore store= new ProductStore();
        store.addProduct(book);
        store.addProduct(shirt);
        store.addProduct(smartphone);

        //Displaying the details
        store.displayDetails();

        //discounted prices
        System.out.println("\nApplying discounted prices:");
        DiscountManager.applyDiscount(book, 10);
        DiscountManager.applyDiscount(shirt, 20);
        DiscountManager.applyDiscount(smartphone, 5);

        //Displaying the discounted details
        store.displayDetails();
    }
}
