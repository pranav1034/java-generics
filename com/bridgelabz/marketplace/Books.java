package com.bridgelabz.marketplace;

public class Books implements ProductCategory{
    private String categoryName = "Books";

    @Override
    public String getCategoryName() {
        return categoryName;
    }
}
