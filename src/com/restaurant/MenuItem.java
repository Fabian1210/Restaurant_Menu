package com.restaurant;

public class MenuItem {
    private String description;

    private double price;
    private String category;
    private boolean isNewItem;

    public MenuItem(double price, String description, String category) {
        this.description = description;
        this.price = price;
        this.category = category;
        this.isNewItem = true;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public boolean isNewItem() {
        return isNewItem;
    }

    public void setNewItem(boolean newItem) {
        isNewItem = newItem;
    }


}
