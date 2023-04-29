package com.restaurant;

public class MenuItem {
    private String description;

    private double price;
    private String category;
    private boolean isNewItem;

    //Ctor
    public MenuItem(double price, String description, String category) {
        this.description = description;
        this.price = price;
        this.category = category;
        this.isNewItem = true;
    }

    //Getters/Setters
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

    /*toString() Overrides java default toString method.
    Returns object value in string format (meaningful output)
    */
    @Override
    public String toString() {
        return description + '\n' +
                "Price: " + price + '\n' +
                "Category: " + category + '\n' +
                "new item? " + isNewItem + '\n';

        //--another way to implement--
//                return
//                String.format(description + '\n'+
//                        "price: " +
//                        price + '\n' +
//                        "category: " +
//                        category + '\n' +
//                        "new item: " + isNew);
    }
}
