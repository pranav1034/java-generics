package com.bridgelabz.smartwarehouse;
import java.util.*;

public class Storage<T extends WarehouseItem> {
    private ArrayList<T> items = new ArrayList<>();

    public void addItem(T item) {
        items.add(item);
    }

    public List<T> getItems() {
        return items;
    }

}
