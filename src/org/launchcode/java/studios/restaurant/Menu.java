package src.org.launchcode.java.studios.restaurant;

import java.util.ArrayList;
import java.util.Date;
import src.org.launchcode.java.studios.restaurant.MenuItem;

public class Menu {

    private ArrayList<MenuItem> items;
    private Date date;

    public Menu(Date date) {
        this.items = new ArrayList<>();
        this.date = date;
    }

    public ArrayList<MenuItem> getItems() {
        return items;
    }

    public void setItems(ArrayList<MenuItem> items) {
        this.items = items;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "items=" + items +
                ", date=" + date +
                '}';
    }
}
