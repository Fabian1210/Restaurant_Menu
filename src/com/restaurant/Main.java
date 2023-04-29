package com.restaurant;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        MenuItem item1 = new MenuItem(2.99, "Hot Dog", "Main Course");
        MenuItem item2 = new MenuItem(4.99, "Hamburger", "Main Course");
        MenuItem item3 = new MenuItem(.99, "Ice Cream Cone", "Dessert");
        MenuItem item4 = new MenuItem(1.50, "Side Salad", "Appetizer");

        Menu myMenu = new Menu(new ArrayList<>(Arrays.asList(item1, item2, item3, item4)));
        //Arrays.asList() Returns a FIXED-SIZE list backed by the specified array. No data is copied or created
        System.out.println(myMenu.getMenuItems());
        System.out.println(myMenu.getLastEntry());
    }
}
