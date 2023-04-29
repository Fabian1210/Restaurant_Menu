package com.restaurant;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private ArrayList<MenuItem> menuItems =  new ArrayList<>();
    private Date lastEntry;

    public Menu(ArrayList<MenuItem> menuItems, Date lastEntry) {
        this.menuItems = menuItems;
        this.lastEntry = lastEntry;
    }

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
