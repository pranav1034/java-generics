package com.bridgelabz.marketplace;

public class Gadgets implements ProductCategory{
    private String categoryName = "Gadgets";

    @Override
    public String getCategoryName() {
        return categoryName;
    }
}
