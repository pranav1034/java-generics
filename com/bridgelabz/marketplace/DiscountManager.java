package com.bridgelabz.marketplace;

public class DiscountManager {
    public static <T extends ProductCategory> void applyDiscount(Product<T> product, double percentage){
        double price = product.getPrice();
        price = price - (price * percentage / 100);
        product.setPrice(price);
    }
}
