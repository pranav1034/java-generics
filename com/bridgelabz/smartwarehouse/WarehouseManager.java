package com.bridgelabz.smartwarehouse;
import java.util.List;

public class WarehouseManager {
    public static void displayItems(List<? extends WarehouseItem> items) {
        for (WarehouseItem item : items) {
            item.displayDetails();
        }
    }
}
