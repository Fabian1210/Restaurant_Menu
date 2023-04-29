package com.restaurant;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private ArrayList<MenuItem> menuItems;
    private Date lastEntry; //Date util

    //Ctor
    public Menu(ArrayList<MenuItem> menuItems) { //takes in list of menuItems
        this.menuItems = menuItems;
        this.lastEntry = Date.from(Instant.now());
    }

    //Getters/Setters
    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    public Date getLastEntry() {
        return lastEntry;
    }

    public void setLastEntry(Date lastEntry) {
        this.lastEntry = lastEntry;
    }
}
